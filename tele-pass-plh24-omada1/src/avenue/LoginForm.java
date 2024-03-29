/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package avenue;

import java.awt.Toolkit;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.AppUser;
import model.DBManager;

/**
 *
 * @author Aggelos
 */
public class LoginForm extends javax.swing.JFrame {
 
    /**
     * Creates new form LoginForm
     */
    
    
    public LoginForm(){
    }
    
//    public LoginForm() {
//        em = DBManager.em;
//       // this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("images/e-pass.jpg")));//Εικονίδιο στη γραμμή τίτλου
//        initComponents();
//     //   this.requestFocus(); // Η φόρμα παίρνει το Focus
//       // this.getRootPane().setDefaultButton(ButtonOK);// Κάνουμε το ΟΚ default button για να ανταποκρίνεται στο ENTER
//         }
   
       public LoginForm(JFrame parent) {
        em = DBManager.em;
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("images/e-pass.jpg")));  //Εικονίδιο στη γραμμή τίτλου
        this.parent=(Avenue)parent;
       
        initComponents();
        this.requestFocus();  // Η φόρμα παίρνει το Focus
        this.getRootPane().setDefaultButton(ButtonOK);// Κάνουμε το ΟΚ default button για να ανταποκρίνεται στο ENTER
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonCancel = new javax.swing.JButton();
        TextBoxPassword = new javax.swing.JPasswordField();
        LabelUsername = new javax.swing.JLabel();
        LabelPassword = new javax.swing.JLabel();
        ButtonOK = new javax.swing.JButton();
        TextBoxUsername = new javax.swing.JTextField();
        LabelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Έλεγχος Πρόσβασης");
        setAlwaysOnTop(true);
        setName("FrameLogin"); // NOI18N
        setResizable(false);

        ButtonCancel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ButtonCancel.setText("Ακύρωση");
        ButtonCancel.setPreferredSize(new java.awt.Dimension(85, 25));
        ButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelActionPerformed(evt);
            }
        });

        TextBoxPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextBoxPassword.setText("admin");

        LabelUsername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelUsername.setText("Όνομα Χρήστη:");

        LabelPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelPassword.setText("Κωδικός Πρόσβασης:");

        ButtonOK.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonOK.setText("Είσοδος");
        ButtonOK.setPreferredSize(new java.awt.Dimension(85, 25));
        ButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOKActionPerformed(evt);
            }
        });

        TextBoxUsername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextBoxUsername.setText("admin");

        LabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LoginFormTelePass.jpg"))); // NOI18N
        LabelLogo.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelUsername)
                            .addComponent(LabelPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextBoxUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextBoxPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(LabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextBoxUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextBoxPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelPassword))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOKActionPerformed
        // TODO add your handling code here:
      query1 = em.createQuery("select u from AppUser u where u.userName=:userName and u.password=:password").setParameter("userName",TextBoxUsername.getText()).setParameter("password",TextBoxPassword.getText());
        list1 =  query1.getResultList();
        if (list1.size()==1) {
            Session.loginUser = (AppUser)list1.get(0);
            parent.getjMenuItem3().setEnabled(Session.doesSessionUserHasPermission(Session.USERS_MODULE));
            this.setVisible(false); //Αφού υπάρχει έγκυρο Login κρύψε τη φόρμα του Login
            dispose(); //Απελευθέρωσε πόρους
            parent.setVisible(true);
        } else
        {
            String message;
            message = "Τα στοιχεία εισόδου είναι λανθασμένα!";
            JOptionPane.showMessageDialog(this,  message,"Σφάλμα Εισόδου",JOptionPane.ERROR_MESSAGE); // Ενδεικτικό μήνυμα σφάλαμτος
 
      }
        
    }//GEN-LAST:event_ButtonOKActionPerformed
 
    
    private void ButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ButtonCancelActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                new LoginForm().setVisible(true);
                                       }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JButton ButtonOK;
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JLabel LabelUsername;
    private javax.swing.JPasswordField TextBoxPassword;
    private javax.swing.JTextField TextBoxUsername;
    // End of variables declaration//GEN-END:variables
    private javax.persistence.Query query1;
    List list1;
    EntityManager em;
    Avenue parent;

  }
