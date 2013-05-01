/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jwget;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Configuration file with location of the HTML files and other resources
 *
 * @author Joao
 */
public class Config {
    private String root;                  // Root url
    private String domain;                // Domain
    private String folderPath;            // Path to save all files   
    private int deepLevel;                // Level of deepness to crawl for websites
    private String dateTime;              // Date and time of the request
    private static final int NCORES = Runtime.getRuntime().availableProcessors();           // Number of cores the current computer has
    private ConcurrentLinkedQueue<Webfile> controlQueue = new ConcurrentLinkedQueue();      // Concurrent queue for websites (already downloaded, control dups)
    private final PausableThreadPoolExecutor executor = new PausableThreadPoolExecutor(NCORES + 1, NCORES + 1, 10, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());// Thread pool
    private AtomicInteger countLinks = new AtomicInteger(0);                                // Counter of the number of links to be downloaded

    public Config() {
    }

    /**
     * Class constructor
     *
     * @param root
     * @param domain
     * @param folderPath
     * @param deepLevel
     * @param dateTime
     */
    public Config(String root, String domain, String folderPath, int deepLevel, String dateTime) throws URISyntaxException {
        this.root = buildURI(root).toString();
        this.domain = extractDomain(domain).toString();
        this.folderPath = folderPath;
        this.deepLevel = deepLevel;
        this.dateTime = dateTime;
    }

    /**
     *
     * GETTERS AND SETTERS - BEGIN
     *
     */
    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getFolderPath() {
        return folderPath;
    }

    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
    }

    public int getDeepLevel() {
        return deepLevel;
    }

    public void setDeepLevel(int deepLevel) {
        this.deepLevel = deepLevel;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public ConcurrentLinkedQueue<Webfile> getControlQueue() {
        return controlQueue;
    }

    public void setControlQueue(ConcurrentLinkedQueue<Webfile> controlQueue) {
        this.controlQueue = controlQueue;
    }

    public PausableThreadPoolExecutor getExecutor() {
        return executor;
    }

    public int incrementCountLinks() {
        return countLinks.incrementAndGet();
    }

    public int decrementCountLinks() {
        return countLinks.decrementAndGet();
    }

    public int getCountLinks() {
        return countLinks.get();
    }
    /**
     *
     * GETTERS AND SETTERS - END
     *
     */
    
    /**
     * Parses a given URL to extract to domain
     *
     * @return String url
     * @throws URISyntaxException
     */
    public final String extractDomain(String url) throws URISyntaxException {
        URI uri = buildURI(url);
        String dom = uri.getHost();
        return dom.startsWith("www.") ? dom.substring(4) : dom;
    }

    /**
     * Builds URI
     *
     * @param url
     * @return
     * @throws URISyntaxException
     */
    public URI buildURI(String url) {
        if (url.isEmpty()) {
            return null;
        } else {
            try {
                if (url.startsWith("/")) {
                    url = this.domain + url;
                }
                if (!url.startsWith("http") && !url.startsWith("https")) {
                    url = "http://" + url;
                }
                return new URI(url);
            } catch (URISyntaxException | NullPointerException ex) {
                Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
        }
    }

    /**
     * Checks if a given Webfile is inside the initial domain
     *
     * @param wf
     * @return
     * @throws URISyntaxException
     */
    public boolean isInDomain(Webfile wf) throws URISyntaxException {
        String wfDomain = extractDomain(wf.getUrl());
        if (wfDomain.equalsIgnoreCase(this.domain)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Checks if a given Webfile is inside the allowed deep level
     *
     * @param wf
     * @return
     */
    public boolean isInDeepLevel(Webfile wf) {
        if (wf.getLevel() <= this.getDeepLevel()) {
            return true;
        } else {
            return false;
        }
    }
}