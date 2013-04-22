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
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import jwget.Config;
import jwget.jWget;

/**
 *
 * @author Joao
 */
public class Index extends javax.swing.JFrame {

    /**
     * Creates new form Index
     */
    public Index() {
        // Center window
        Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        int wdwLeft = screenSize.width / 2 - 420;
        int wdwTop = screenSize.height / 2 - 170;
        pack();
        setLocation(wdwLeft, wdwTop);

        // Initialize components
        initComponents();
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
        cbDeepness = new javax.swing.JComboBox();
        lblDeepness = new javax.swing.JLabel();
        btnHistory = new javax.swing.JButton();
        lblFolderPath = new javax.swing.JLabel();
        txtFolderPath = new javax.swing.JTextField();
        cbImages = new javax.swing.JCheckBox();
        lblDownloads = new javax.swing.JLabel();
        cbCss = new javax.swing.JCheckBox();
        cbJavascript = new javax.swing.JCheckBox();
        cbVideos = new javax.swing.JCheckBox();
        btnChooseFolder = new javax.swing.JButton();
        btnPaste = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple wget");
        setPreferredSize(new java.awt.Dimension(840, 340));
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

        cbDeepness.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbDeepness.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

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
        txtFolderPath.setEnabled(false);

        cbImages.setText("Images");

        lblDownloads.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDownloads.setText("Download files");

        cbCss.setText("Stylesheets");

        cbJavascript.setText("Javascript");

        cbVideos.setText("Videos");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUrl)
                    .addComponent(lblDownloads)
                    .addComponent(lblFolderPath)
                    .addComponent(lblDeepness))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbDeepness, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUrl)
                                    .addComponent(txtFolderPath))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnChooseFolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPaste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(297, 297, 297))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnDownload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbImages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbVideos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbCss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbJavascript, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(644, 644, 644))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btnHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPaste, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUrl)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFolderPath)
                    .addComponent(txtFolderPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChooseFolder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbImages)
                    .addComponent(cbVideos)
                    .addComponent(cbCss)
                    .addComponent(cbJavascript)
                    .addComponent(lblDownloads))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDeepness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDeepness))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDownload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
        if (!txtUrl.getText().isEmpty()) {
            String folderPath = txtFolderPath.getText() + "\\";
            boolean dlImages = cbImages.isSelected();
            boolean dlVideos = cbImages.isSelected();
            boolean dlCss = cbImages.isSelected();
            boolean dlJs = cbImages.isSelected();
            int deepLevel = Integer.parseInt(cbDeepness.getSelectedItem().toString());
            Config config = new Config(txtUrl.getText(), folderPath, dlImages, dlVideos, dlCss, dlJs, deepLevel, folderPath);
            jWget main = new jWget(config);
            try {
                main.execute();
            } catch (URISyntaxException ex) {
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
    private javax.swing.JCheckBox cbCss;
    private javax.swing.JComboBox cbDeepness;
    private javax.swing.JCheckBox cbImages;
    private javax.swing.JCheckBox cbJavascript;
    private javax.swing.JCheckBox cbVideos;
    private javax.swing.JLabel lblDeepness;
    private javax.swing.JLabel lblDownloads;
    private javax.swing.JLabel lblFolderPath;
    private javax.swing.JLabel lblUrl;
    private javax.swing.JTextField txtFolderPath;
    private javax.swing.JTextField txtUrl;
    // End of variables declaration//GEN-END:variables
}
