/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jwget;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Joao
 */
public class jWget {
    protected Config jConfig;         // Configuration file

    public jWget() {
    }

    /**
     *
     * @param root
     * @param domain
     * @param folderPath
     * @param dlAll
     * @param txtOther
     * @param dlImages
     * @param dlAudio
     * @param dlVideos
     * @param dlCss
     * @param dlJs
     * @param dlOther
     * @param deepLevel
     * @param dateTime
     */
    public jWget(String root, String domain, String folderPath, boolean dlAll, String txtOther, boolean dlImages, boolean dlAudio, boolean dlVideos, boolean dlCss, boolean dlJs, boolean dlOther, int deepLevel, String dateTime) throws URISyntaxException {
        Config config = new Config(root, domain, folderPath, deepLevel, dateTime);
        FileTypeManager fileTypeManager = new FileTypeManager(dlAll, dlImages, dlAudio, dlVideos, dlCss, dlJs, dlOther, txtOther);
        FileTypeMap.setFileTypeManager(fileTypeManager);

        this.jConfig = config;
    }

    /**
     *
     * GETTERS AND SETTERS - BEGIN
     *
     */
    public Config getConfig() {
        return jConfig;
    }

    public void setConfig(Config config) {
        this.jConfig = config;
    }
    /**
     *
     * GETTERS AND SETTERS - END
     *
     */
    
    /**
     * Updates the history file
     */
    public void updateHistory() {
        try {
            // Create file
            FileWriter fstream = new FileWriter("history.csv", true);
            try (PrintWriter out = new PrintWriter(fstream)) {
                out.println(this.jConfig.getDateTime() + ";" + this.jConfig.getDomain() + ";" + this.jConfig.getFolderPath() + ";" + this.jConfig.getDeepLevel());
            }
        } catch (Exception e) { //Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
    }

    /**
     * Updates to the current date and time
     */
    public void updateDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        this.jConfig.setDateTime(dateFormat.format(date));
    }

    /**
     * Main method to coordinate the download and parse threads
     *
     * @return boolean
     * @throws URISyntaxException
     */
    public void execute() throws URISyntaxException {
        // Update date and time
        updateDate();

        // Dowlonad summary
        System.out.println(
                this.jConfig.getDateTime()
                + "\nStarting new download for: "
                + this.jConfig.getDomain()
                + "\nExtracting files to: "
                + this.jConfig.getFolderPath()
                + "\nLevel of deepness: "
                + this.jConfig.getDeepLevel());

        // Update the hisory file
        updateHistory();

        Thread executeWget = new Thread(new jWget.ExecuteWget(this.jConfig));
        executeWget.start();
//        try {
//            executeWget.wait();
//        } catch (InterruptedException ex) {
//            Logger.getLogger(jWget.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    class ExecuteWget extends jWget implements Runnable {

        private Config jConfig;         // Configuration file

        public ExecuteWget(Config config) {
            this.jConfig = config;
        }

        @Override
        public void run() {

            // Create the first webfile to download and add to queue
            String fullPathAndFileName = Utils.getPathAndFileName(this.jConfig.getFolderPath(), this.jConfig.getRoot(), this.jConfig.getRoot());


            if (fullPathAndFileName != null) {

                Webfile wf = new Webfile(fullPathAndFileName, this.jConfig.getRoot(), 0);

                // Start counting downloaded links
                int t = this.jConfig.getCountLinks();
                this.jConfig.incrementCountLinks();

                // Begin the downloads
                Downloader d = new DownloaderParseHtml(this.jConfig, wf);
                this.jConfig.getExecutor().execute(d);

                System.out.println("initial: " + String.valueOf(this.jConfig.getCountLinks()));
                while (this.jConfig.getCountLinks() > 0) {
                    //     System.out.println("loop: " + this.jConfig.getCountLinks());
                }
                System.out.println("final: " + String.valueOf(this.jConfig.getCountLinks()));
                this.jConfig.getExecutor().shutdown();
                try {
                    this.jConfig.getExecutor().awaitTermination(1, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                }
            } else {
                // TODO Handle fileName == null
            }
        }
    }
}
