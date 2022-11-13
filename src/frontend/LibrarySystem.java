package frontend;


import backend.AdminDataBase;
import backend.LibrarianDataBase;
import static constants.FileNames.ADMIN_FILENAME;
import static constants.FileNames.LIBRARIAN_FILENAME;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eyada
 */
public class LibrarySystem extends javax.swing.JFrame{

    public static AdminDataBase admin=new AdminDataBase(ADMIN_FILENAME);
    public static LibrarianDataBase librarian=new LibrarianDataBase(LIBRARIAN_FILENAME);
    
    /**
     * Creates new form NewJFrame1
     */
    public LibrarySystem() {
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

        jPanel1 = new javax.swing.JPanel();
        Role = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        AdmLib = new javax.swing.JComboBox<>();
        signin = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        signup = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.FlowLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Role.setFont(new java.awt.Font("Tahoma", 2, 48)); // NOI18N
        Role.setForeground(new java.awt.Color(52, 73, 94));
        Role.setText("Role");
        jPanel1.add(Role, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 100, 50));

        title.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(52, 73, 94));
        title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        title.setText("Library system");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, 70));

        AdmLib.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        AdmLib.setForeground(new java.awt.Color(52, 73, 94));
        AdmLib.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Admin", "Librarian" }));
        jPanel1.add(AdmLib, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 300, 50));

        signin.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        signin.setForeground(new java.awt.Color(52, 73, 94));
        signin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/signin.png"))); // NOI18N
        signin.setText("sign in");
        signin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinMouseClicked(evt);
            }
        });
        jPanel1.add(signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 220, 160));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/close.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/minimize.png"))); // NOI18N
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        signup.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        signup.setForeground(new java.awt.Color(52, 73, 94));
        signup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/signup.png"))); // NOI18N
        signup.setText("sign up");
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupMouseClicked(evt);
            }
        });
        jPanel1.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 220, 160));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/background.jpg"))); // NOI18N
        background.setText("jLabel1");
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 610, 690));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinMouseClicked
        if("Admin".equals(AdmLib.getSelectedItem().toString())){
            new AdminSignIn();
            this.dispose();
        }
        else if("Librarian".equals(AdmLib.getSelectedItem().toString())){
            new LibrarianSignIn();
            this.dispose();
        }
        else
            JOptionPane.showMessageDialog(this,"Choose a role","Error",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_signinMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseClicked
        if("Admin".equals(AdmLib.getSelectedItem().toString())){
            new AdminSignUp();
            this.dispose();
        }
        else if("Librarian".equals(AdmLib.getSelectedItem().toString())){
            new LibrarianSignUp();
            this.dispose();
        }
        else
            JOptionPane.showMessageDialog(this,"Choose a role","CHOOSE",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_signupMouseClicked

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
            java.util.logging.Logger.getLogger(LibrarySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AdmLib;
    private javax.swing.JLabel Role;
    private javax.swing.JLabel background;
    private javax.swing.JLabel close;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel signin;
    private javax.swing.JLabel signup;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
