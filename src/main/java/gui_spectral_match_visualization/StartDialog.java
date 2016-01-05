/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_spectral_match_visualization;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JTextField;

/**
 *
 * @author Sule
 */
public class StartDialog extends javax.swing.JDialog {

    private JFileChooser fileChooser = new JFileChooser();
    private int totalSpectra = 0,
            indSpecA = 0, 
            indSpecB = 0,
            indScore = 0;
    private boolean isSpectraLoaded = false,
            isScoreFileLoaded = false;
    private String specAFolder = "",
            specBFolder = "";

    /**
     * Creates new form StartJDialog
     * @param parent
     * @param modal
     */
    public StartDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        indSpecA = Integer.parseInt(indSpecAjTextField.getText());
        indSpecB = Integer.parseInt(indSpecBjTextField.getText());
        setLocation(620, 400);
        setVisible(true);
    }

    public JTextField getPathSpectrumFolderjTextField() {
        return pathSpecAFolderjTextField;
    }

    public JTextField getPathToScoreFilejTextField() {
        return pathToScoreFilejTextField;
    }

    public String getSpecBFolder() {
        return specBFolder;
    }

    public String getSpecAFolder() {
        return specAFolder;
    }

    public int getIndSpecA() {
        return indSpecA;
    }

    public void setIndSpecA(int indSpecA) {
        this.indSpecA = indSpecA;
    }

    public int getIndSpecB() {
        return indSpecB;
    }

    public void setIndSpecB(int indSpecB) {
        this.indSpecB = indSpecB;
    }

    public int getIndScore() {
        return indScore;
    }

    public void setIndScore(int indScore) {
        this.indScore = indScore;
    }
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        specAFolderjPanel = new javax.swing.JPanel();
        pathSpecAFolderjLabel = new javax.swing.JLabel();
        pathSpecAFolderjTextField = new javax.swing.JTextField();
        browseSpecAjButton = new javax.swing.JButton();
        clearSpecAjButton = new javax.swing.JButton();
        scoreFilejPanel = new javax.swing.JPanel();
        pathToScoreFilejTextField = new javax.swing.JTextField();
        pathToScoreFilejLabel = new javax.swing.JLabel();
        browseScoreFilejButton = new javax.swing.JButton();
        clearScoreFilejButton = new javax.swing.JButton();
        createjButton = new javax.swing.JButton();
        specBFolderjPanel = new javax.swing.JPanel();
        pathSpecBFolderjLabel = new javax.swing.JLabel();
        pathSpecBFolderjTextField = new javax.swing.JTextField();
        browseSpecBjButton = new javax.swing.JButton();
        clearSpecBjButton = new javax.swing.JButton();
        indSpecAjLabel = new javax.swing.JLabel();
        indSpecBjLabel = new javax.swing.JLabel();
        indSpecAjTextField = new javax.swing.JTextField();
        indSpecBjTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        specAFolderjPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("SpecA folder"));

        pathSpecAFolderjLabel.setText("Path to specA folder");

        browseSpecAjButton.setText("Browse");
        browseSpecAjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseSpecAjButtonActionPerformed(evt);
            }
        });

        clearSpecAjButton.setText("Clear");
        clearSpecAjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearSpecAjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout specAFolderjPanelLayout = new javax.swing.GroupLayout(specAFolderjPanel);
        specAFolderjPanel.setLayout(specAFolderjPanelLayout);
        specAFolderjPanelLayout.setHorizontalGroup(
            specAFolderjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(specAFolderjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pathSpecAFolderjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pathSpecAFolderjTextField)
                .addGap(18, 18, 18)
                .addComponent(browseSpecAjButton)
                .addGap(6, 6, 6)
                .addComponent(clearSpecAjButton)
                .addGap(7, 7, 7))
        );
        specAFolderjPanelLayout.setVerticalGroup(
            specAFolderjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, specAFolderjPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(specAFolderjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pathSpecAFolderjLabel)
                    .addComponent(pathSpecAFolderjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browseSpecAjButton)
                    .addComponent(clearSpecAjButton))
                .addContainerGap())
        );

        scoreFilejPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Score file"));

        pathToScoreFilejLabel.setText("Path to score file");

        browseScoreFilejButton.setText("Browse");
        browseScoreFilejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseScoreFilejButtonActionPerformed(evt);
            }
        });

        clearScoreFilejButton.setText("Clear");

        javax.swing.GroupLayout scoreFilejPanelLayout = new javax.swing.GroupLayout(scoreFilejPanel);
        scoreFilejPanel.setLayout(scoreFilejPanelLayout);
        scoreFilejPanelLayout.setHorizontalGroup(
            scoreFilejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scoreFilejPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pathToScoreFilejLabel)
                .addGap(29, 29, 29)
                .addComponent(pathToScoreFilejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(browseScoreFilejButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearScoreFilejButton)
                .addContainerGap())
        );
        scoreFilejPanelLayout.setVerticalGroup(
            scoreFilejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scoreFilejPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(scoreFilejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pathToScoreFilejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pathToScoreFilejLabel)
                    .addComponent(browseScoreFilejButton)
                    .addComponent(clearScoreFilejButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        createjButton.setText("CREATE");
        createjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createjButtonActionPerformed(evt);
            }
        });

        specBFolderjPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("SpecB folder"));

        pathSpecBFolderjLabel.setText("Path to specB folder");

        pathSpecBFolderjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathSpecBFolderjTextFieldActionPerformed(evt);
            }
        });

        browseSpecBjButton.setText("Browse");
        browseSpecBjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseSpecBjButtonActionPerformed(evt);
            }
        });

        clearSpecBjButton.setText("Clear");
        clearSpecBjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearSpecBjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout specBFolderjPanelLayout = new javax.swing.GroupLayout(specBFolderjPanel);
        specBFolderjPanel.setLayout(specBFolderjPanelLayout);
        specBFolderjPanelLayout.setHorizontalGroup(
            specBFolderjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(specBFolderjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pathSpecBFolderjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pathSpecBFolderjTextField)
                .addGap(18, 18, 18)
                .addComponent(browseSpecBjButton)
                .addGap(6, 6, 6)
                .addComponent(clearSpecBjButton)
                .addGap(7, 7, 7))
        );
        specBFolderjPanelLayout.setVerticalGroup(
            specBFolderjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, specBFolderjPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(specBFolderjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pathSpecBFolderjLabel)
                    .addComponent(pathSpecBFolderjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browseSpecBjButton)
                    .addComponent(clearSpecBjButton))
                .addContainerGap())
        );

        indSpecAjLabel.setText("Index for specA");

        indSpecBjLabel.setText("Index for specB");

        indSpecAjTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        indSpecAjTextField.setText("1");

        indSpecBjTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        indSpecBjTextField.setText("4");
        indSpecBjTextField.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scoreFilejPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(specBFolderjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(specAFolderjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(indSpecAjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(indSpecAjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(indSpecBjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(indSpecBjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(specAFolderjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(specBFolderjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scoreFilejPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indSpecAjLabel)
                    .addComponent(indSpecAjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indSpecBjLabel)
                    .addComponent(indSpecBjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createjButton)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Project creation");
        getAccessibleContext().setAccessibleDescription("Open required files");
        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void browseSpecAjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseSpecAjButtonActionPerformed
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.setMultiSelectionEnabled(true);
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File folder = fileChooser.getSelectedFile();
            specAFolder = folder.getAbsolutePath();
            pathSpecAFolderjTextField.setText(folder.getAbsolutePath());
            isSpectraLoaded = true;
        } else {
            System.out.println("File access is cancelled by user.");
        }
    }//GEN-LAST:event_browseSpecAjButtonActionPerformed

    private void clearSpecAjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearSpecAjButtonActionPerformed
        pathSpecAFolderjTextField.setText("");
        totalSpectra = 0;
    }//GEN-LAST:event_clearSpecAjButtonActionPerformed

    private void browseScoreFilejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseScoreFilejButtonActionPerformed
        // prepare the data and load a file
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            pathToScoreFilejTextField.setText(file.getPath());
            isScoreFileLoaded = true;
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_browseScoreFilejButtonActionPerformed

    private void createjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createjButtonActionPerformed
        if (isScoreFileLoaded && isSpectraLoaded) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_createjButtonActionPerformed

    private void browseSpecBjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseSpecBjButtonActionPerformed
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.setMultiSelectionEnabled(true);
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File folder = fileChooser.getSelectedFile();
            specBFolder = folder.getAbsolutePath();
            pathSpecBFolderjTextField.setText(folder.getAbsolutePath());
            isSpectraLoaded = true;
        } else {
            System.out.println("File access is cancelled by user.");
        }
    }//GEN-LAST:event_browseSpecBjButtonActionPerformed

    private void clearSpecBjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearSpecBjButtonActionPerformed
        pathSpecBFolderjTextField.setText("");
        totalSpectra = 0;
    }//GEN-LAST:event_clearSpecBjButtonActionPerformed

    private void pathSpecBFolderjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathSpecBFolderjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pathSpecBFolderjTextFieldActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(StartDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(StartDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(StartDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(StartDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                StartDialog dialog = new StartDialog(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseScoreFilejButton;
    private javax.swing.JButton browseSpecAjButton;
    private javax.swing.JButton browseSpecBjButton;
    private javax.swing.JButton clearScoreFilejButton;
    private javax.swing.JButton clearSpecAjButton;
    private javax.swing.JButton clearSpecBjButton;
    private javax.swing.JButton createjButton;
    private javax.swing.JLabel indSpecAjLabel;
    private javax.swing.JTextField indSpecAjTextField;
    private javax.swing.JLabel indSpecBjLabel;
    private javax.swing.JTextField indSpecBjTextField;
    private javax.swing.JLabel pathSpecAFolderjLabel;
    private javax.swing.JTextField pathSpecAFolderjTextField;
    private javax.swing.JLabel pathSpecBFolderjLabel;
    private javax.swing.JTextField pathSpecBFolderjTextField;
    private javax.swing.JLabel pathToScoreFilejLabel;
    private javax.swing.JTextField pathToScoreFilejTextField;
    private javax.swing.JPanel scoreFilejPanel;
    private javax.swing.JPanel specAFolderjPanel;
    private javax.swing.JPanel specBFolderjPanel;
    // End of variables declaration//GEN-END:variables
}
