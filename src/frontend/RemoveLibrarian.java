package frontend;


import static frontend.Validation.*;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author eyada
 */
public class RemoveLibrarian extends javax.swing.JFrame {
    /**
     * Creates new form NewJFrame7
     */
    public RemoveLibrarian() {
        initComponents();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        subtitle = new javax.swing.JLabel();
        librarianID = new javax.swing.JLabel();
        librarianIDText = new javax.swing.JTextField();
        remove = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/close.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 70, 70));

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/minimize.png"))); // NOI18N
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        getContentPane().add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 60, 70));

        title.setBackground(new java.awt.Color(0, 255, 0));
        title.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(140, 56, 56));
        title.setText("Admin Role");
        title.setPreferredSize(new java.awt.Dimension(100, 44));
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 190, 50));

        subtitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        subtitle.setForeground(new java.awt.Color(140, 56, 56));
        subtitle.setText("Remove Librarian");
        getContentPane().add(subtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        librarianID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        librarianID.setForeground(new java.awt.Color(140, 56, 56));
        librarianID.setText("Librarian ID");
        getContentPane().add(librarianID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        librarianIDText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        librarianIDText.setForeground(new java.awt.Color(140, 56, 56));
        getContentPane().add(librarianIDText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 180, -1));

        remove.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        remove.setForeground(new java.awt.Color(140, 56, 56));
        remove.setText("Remove");
        remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removeMouseExited(evt);
            }
        });
        getContentPane().add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        background.setBackground(new java.awt.Color(242, 239, 234));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/background.jpg"))); // NOI18N
        background.setText("jLabel1");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        new AdminMain();
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void removeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseClicked
        if(librarianIDText.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Some fields are empty","EMPTY FIELDS",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(!hasNoSpace(librarianIDText.getText())){
            JOptionPane.showMessageDialog(this,"Enter valid input","INVALID INPUT",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(!(AdminMain.a1.getDatabase().contains(librarianIDText.getText()))){
            JOptionPane.showMessageDialog(this,"The librarian with ID="+librarianIDText.getText()+" username doesn't exist","DOESN'T EXIST",JOptionPane.INFORMATION_MESSAGE);
            new AdminMain();
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(this,"The librarian with ID="+librarianIDText.getText()+" has been Successfully removed","REMOVE SUCCESSFULLY",JOptionPane.INFORMATION_MESSAGE);
            AdminMain.a1.removeLibrarian(librarianIDText.getText());
            clear(librarianIDText);
        }
    }//GEN-LAST:event_removeMouseClicked

    private void removeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseEntered
        remove.setForeground(new Color(250,56,56));
    }//GEN-LAST:event_removeMouseEntered

    private void removeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseExited
        remove.setForeground(new Color(140,56,56));
    }//GEN-LAST:event_removeMouseExited
    
    public void clear(JTextField t){
        t.setText("");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RemoveLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
    
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel close;
    private javax.swing.JLabel librarianID;
    private javax.swing.JTextField librarianIDText;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel remove;
    private javax.swing.JLabel subtitle;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
