/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jwget.ui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import jwget.jWget;

/**
 *
 * @author Joao
 */
public class Index extends javax.swing.JFrame {

    public jWget main;

    /**
     * Creates new form Index
     */
    public Index() {
        // Center window
        Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        int wdwLeft = screenSize.width / 2 - 350;
        int wdwTop = screenSize.height / 2 - 250;
        pack();
        setLocation(wdwLeft, wdwTop);

        // Initialize components
        initComponents();

        // Initializes the folder path to the users home directory
        txtFolderPath.setText(System.getProperty("user.home"));

        // Hide pause and resume buttons
        btnPause.setVisible(false);
        btnResume.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDownload = new javax.swing.JButton();
        lblUrl = new javax.swing.JLabel();
        txtUrl = new javax.swing.JTextField();
        lbDeepness = new javax.swing.JComboBox();
        lblDeepness = new javax.swing.JLabel();
        btnHistory = new javax.swing.JButton();
        lblFolderPath = new javax.swing.JLabel();
        txtFolderPath = new javax.swing.JTextField();
        cbImages = new javax.swing.JCheckBox();
        cbCss = new javax.swing.JCheckBox();
        cbJavascript = new javax.swing.JCheckBox();
        cbVideos = new javax.swing.JCheckBox();
        btnChooseFolder = new javax.swing.JButton();
        btnPaste = new javax.swing.JButton();
        cbAll = new javax.swing.JCheckBox();
        lblExt = new javax.swing.JLabel();
        txtExt = new javax.swing.JTextField();
        cbOther = new javax.swing.JCheckBox();
        cbAudio = new javax.swing.JCheckBox();
        btnPause = new javax.swing.JButton();
        btnResume = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple wget");
        setMaximumSize(new java.awt.Dimension(700, 470));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);

        btnDownload.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDownload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jwget/img/download.png"))); // NOI18N
        btnDownload.setText("Download");
        btnDownload.setPreferredSize(new java.awt.Dimension(173, 43));
        btnDownload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownloadActionPerformed(evt);
            }
        });

        lblUrl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUrl.setText("URL");

        txtUrl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lbDeepness.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbDeepness.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        lblDeepness.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDeepness.setText("Levels deep");

        btnHistory.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jwget/img/history.png"))); // NOI18N
        btnHistory.setText("View history");
        btnHistory.setPreferredSize(new java.awt.Dimension(173, 43));
        btnHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoryActionPerformed(evt);
            }
        });

        lblFolderPath.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblFolderPath.setText("Folder");

        txtFolderPath.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        cbImages.setText("Images");
        cbImages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbImagesActionPerformed(evt);
            }
        });

        cbCss.setText("Stylesheets");

        cbJavascript.setText("Javascript");

        cbVideos.setText("Videos");
        cbVideos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVideosActionPerformed(evt);
            }
        });

        btnChooseFolder.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnChooseFolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jwget/img/folder.png"))); // NOI18N
        btnChooseFolder.setText("Choose folder...");
        btnChooseFolder.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnChooseFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseFolderActionPerformed(evt);
            }
        });

        btnPaste.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnPaste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jwget/img/paste.png"))); // NOI18N
        btnPaste.setText("Paste");
        btnPaste.setBorderPainted(false);
        btnPaste.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPaste.setPreferredSize(new java.awt.Dimension(173, 43));
        btnPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasteActionPerformed(evt);
            }
        });

        cbAll.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbAll.setText("Download all file types");
        cbAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAllActionPerformed(evt);
            }
        });

        lblExt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblExt.setText("Specify the extensions");

        cbOther.setText("Others");
        cbOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOtherActionPerformed(evt);
            }
        });

        cbAudio.setText("Audio");
        cbAudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAudioActionPerformed(evt);
            }
        });

        btnPause.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jwget/img/pause.png"))); // NOI18N
        btnPause.setText("Pause");
        btnPause.setPreferredSize(new java.awt.Dimension(173, 43));
        btnPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPauseActionPerformed(evt);
            }
        });

        btnResume.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnResume.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jwget/img/play.png"))); // NOI18N
        btnResume.setText("Resume");
        btnResume.setPreferredSize(new java.awt.Dimension(173, 43));
        btnResume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblExt)
                    .addComponent(lblUrl)
                    .addComponent(lblFolderPath)
                    .addComponent(lblDeepness))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbAudio)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUrl)
                            .addComponent(txtFolderPath))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnChooseFolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPaste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(84, 84, 84))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbAll)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnResume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDownload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbDeepness, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtExt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbJavascript)
                                    .addComponent(cbImages))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbVideos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbCss, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbOther))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUrl)
                    .addComponent(btnPaste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFolderPath)
                    .addComponent(txtFolderPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChooseFolder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDeepness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDeepness))
                .addGap(18, 18, 18)
                .addComponent(cbAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCss)
                    .addComponent(cbJavascript))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbImages)
                    .addComponent(cbVideos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAudio)
                    .addComponent(cbOther))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblExt, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(txtExt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDownload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        lblUrl.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * onClick method - starts the download
     *
     * @param evt
     */
    private void btnDownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownloadActionPerformed
        if (false) {
        } else {
            btnDownload.setVisible(false);
            btnPause.setVisible(true);
            if (!txtUrl.getText().isEmpty()) {
                // Get user input
                String folderPath = txtFolderPath.getText();
                boolean dlAll = cbAll.isSelected();
                boolean dlImages = cbImages.isSelected();
                boolean dlAudio = cbAudio.isSelected();
                boolean dlVideos = cbVideos.isSelected();
                boolean dlCss = cbCss.isSelected();
                boolean dlJs = cbJavascript.isSelected();
                boolean dlOther = cbOther.isSelected();
                String extOther = txtExt.getText();
                int deepLevel = Integer.parseInt(lbDeepness.getSelectedItem().toString());

                try {
                    // Start downloading
                    main = new jWget(txtUrl.getText(), txtUrl.getText(), folderPath, dlAll, extOther, dlImages, dlAudio, dlVideos, dlCss, dlJs, dlOther, deepLevel, folderPath);

                    main.execute();
                } catch (URISyntaxException ex) {
                    Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnDownloadActionPerformed

    private void btnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryActionPerformed
        History.main(null);
    }//GEN-LAST:event_btnHistoryActionPerformed

    private void btnChooseFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseFolderActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            txtFolderPath.setText(fileChooser.getSelectedFile().toString());
        } else {
            System.out.println("No directory selected...");
        }
    }//GEN-LAST:event_btnChooseFolderActionPerformed

    private void btnPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasteActionPerformed
        try {
            txtUrl.setText(Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor).toString());
        } catch (UnsupportedFlavorException | IOException ex) {
        }
    }//GEN-LAST:event_btnPasteActionPerformed

    private void cbImagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbImagesActionPerformed
    }//GEN-LAST:event_cbImagesActionPerformed

    private void cbVideosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVideosActionPerformed
    }//GEN-LAST:event_cbVideosActionPerformed

    private void cbOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOtherActionPerformed
    }//GEN-LAST:event_cbOtherActionPerformed

    private void cbAudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAudioActionPerformed
    }//GEN-LAST:event_cbAudioActionPerformed

    private void cbAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAllActionPerformed
        boolean state = !cbAll.isSelected();

        // Disable all checkboxes
        cbAudio.setEnabled(state);
        cbCss.setEnabled(state);
        cbImages.setEnabled(state);
        cbJavascript.setEnabled(state);
        cbOther.setEnabled(state);
        cbVideos.setEnabled(state);

        // Disable textbox
        txtExt.setEnabled(state);
    }//GEN-LAST:event_cbAllActionPerformed

    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed
        btnPause.setVisible(false);
        btnResume.setVisible(true);

        main.getConfig().getExecutor().pause();
    }//GEN-LAST:event_btnPauseActionPerformed

    private void btnResumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumeActionPerformed
        btnPause.setVisible(true);
        btnResume.setVisible(false);

        main.getConfig().getExecutor().resume();
    }//GEN-LAST:event_btnResumeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Index().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChooseFolder;
    private javax.swing.JButton btnDownload;
    private javax.swing.JButton btnHistory;
    private javax.swing.JButton btnPaste;
    private javax.swing.JButton btnPause;
    private javax.swing.JButton btnResume;
    private javax.swing.JCheckBox cbAll;
    private javax.swing.JCheckBox cbAudio;
    private javax.swing.JCheckBox cbCss;
    private javax.swing.JCheckBox cbImages;
    private javax.swing.JCheckBox cbJavascript;
    private javax.swing.JCheckBox cbOther;
    private javax.swing.JCheckBox cbVideos;
    private javax.swing.JComboBox lbDeepness;
    private javax.swing.JLabel lblDeepness;
    private javax.swing.JLabel lblExt;
    private javax.swing.JLabel lblFolderPath;
    private javax.swing.JLabel lblUrl;
    private javax.swing.JTextField txtExt;
    private javax.swing.JTextField txtFolderPath;
    private javax.swing.JTextField txtUrl;
    // End of variables declaration//GEN-END:variables
}
