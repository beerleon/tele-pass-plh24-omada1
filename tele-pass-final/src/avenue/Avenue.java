
package avenue;

import customers.ListClientForm;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import program.ListProgramForm;
import roles.ListRolesForm;
import tolls.CollectTollForm;
import tolls.PaymentForm;
import users.ListUsersForm;




/**
 *
 * @author Aggelos
 */

public class Avenue extends javax.swing.JFrame {
     /**
     * Creates new form Avenue
     */
   
    public Avenue() {
     
        LoginForm formLogin = new LoginForm(this);
        formLogin.setLocationRelativeTo(null); // Κεντράρισμα της LoginForm στο κέντρο της οθόνης
        formLogin.setVisible(true); // Εμφάνιση LoginForm
        this.setExtendedState(MAXIMIZED_BOTH);  //Μεγιστοποίηση της Κεντρικής Φόρμας 
        this.setTitle("Αυτόματο Σύστημα Διαχείρισης Διοδίων TELE-PASS"); // Γραμμή Τίτλου στην Κεντρική Φόρμα
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("images/e-pass.jpg")));// Εικονίδιο Ελέγχου στην Κεντρική Φόρμα
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

        PanelFooter = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextFieldStation = new javax.swing.JTextField();
        TextFieldUsername = new javax.swing.JTextField();
        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        MenuItemUsers = new javax.swing.JMenuItem();
        MenuItemCustomers = new javax.swing.JMenuItem();
        MenuItemRoles = new javax.swing.JMenuItem();
        MenuItemPrograms = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MenuItemExitApplication = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MenuItemTollsPass = new javax.swing.JMenuItem();
        MenuItemTollsPayments = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        MenuItemTransactionsCard = new javax.swing.JMenuItem();
        MenuItemTransactionsCustomer = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuItemTileCascade = new javax.swing.JMenuItem();
        MenuItemTileVertically = new javax.swing.JMenuItem();
        MenuItemTileHorizontally = new javax.swing.JMenuItem();
        MenuItemTileGrid = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelFooter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setText("Σταθμός: ");

        jLabel2.setText("Χρήστης: ");

        javax.swing.GroupLayout PanelFooterLayout = new javax.swing.GroupLayout(PanelFooter);
        PanelFooter.setLayout(PanelFooterLayout);
        PanelFooterLayout.setHorizontalGroup(
            PanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFooterLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldStation, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 521, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelFooterLayout.setVerticalGroup(
            PanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFooterLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(PanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(TextFieldStation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        Menu.setText("Διαχείριση");

        MenuItemUsers.setText("Χρήστες");
        MenuItemUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemUsersActionPerformed(evt);
            }
        });
        Menu.add(MenuItemUsers);

        MenuItemCustomers.setText("Πελάτες");
        MenuItemCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCustomersActionPerformed(evt);
            }
        });
        Menu.add(MenuItemCustomers);

        MenuItemRoles.setText("Ρόλοι");
        MenuItemRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemRolesActionPerformed(evt);
            }
        });
        Menu.add(MenuItemRoles);

        MenuItemPrograms.setText("Προγράμματα");
        MenuItemPrograms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemProgramsActionPerformed(evt);
            }
        });
        Menu.add(MenuItemPrograms);
        Menu.add(jSeparator1);

        MenuItemExitApplication.setText("Έξοδος");
        MenuItemExitApplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemExitApplicationActionPerformed(evt);
            }
        });
        Menu.add(MenuItemExitApplication);

        jMenuBar1.add(Menu);

        jMenu3.setText("Διόδια");

        MenuItemTollsPass.setText("Διέλευση");
        MenuItemTollsPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemTollsPassActionPerformed(evt);
            }
        });
        jMenu3.add(MenuItemTollsPass);

        MenuItemTollsPayments.setText("Πληρωμές");
        MenuItemTollsPayments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemTollsPaymentsActionPerformed(evt);
            }
        });
        jMenu3.add(MenuItemTollsPayments);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Κινήσεις");

        MenuItemTransactionsCard.setText("Κίνηση Κάρτας");
        MenuItemTransactionsCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemTransactionsCardActionPerformed(evt);
            }
        });
        jMenu4.add(MenuItemTransactionsCard);

        MenuItemTransactionsCustomer.setText("Κίνηση Πελάτη");
        MenuItemTransactionsCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemTransactionsCustomerActionPerformed(evt);
            }
        });
        jMenu4.add(MenuItemTransactionsCustomer);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Παράθυρο");

        MenuItemTileCascade.setText("Σε Επικάλυψη");
        MenuItemTileCascade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemTileCascadeActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItemTileCascade);

        MenuItemTileVertically.setText("Κατακόρυφα");
        MenuItemTileVertically.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemTileVerticallyActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItemTileVertically);

        MenuItemTileHorizontally.setText("Οριζόντια");
        MenuItemTileHorizontally.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemTileHorizontallyActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItemTileHorizontally);

        MenuItemTileGrid.setLabel("Πλέγμα");
        MenuItemTileGrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemTileGridActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItemTileGrid);
        MenuItemTileGrid.getAccessibleContext().setAccessibleName("");

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(desktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemTollsPaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemTollsPaymentsActionPerformed
        // TODO add your handling code here:
        PaymentForm formPayment = new PaymentForm();
        formPayment.setVisible(true);
        desktop.add(formPayment);
    }//GEN-LAST:event_MenuItemTollsPaymentsActionPerformed

    private void MenuItemCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCustomersActionPerformed
        // TODO add your handling code here:
        ListClientForm formClientList = new ListClientForm();
        formClientList.setVisible(true);
        desktop.add(formClientList);//Προσθήκη της φόρμας σαν Child στο MDI Avenue
    }//GEN-LAST:event_MenuItemCustomersActionPerformed

    private void MenuItemUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemUsersActionPerformed
        // TODO add your handling code here:
         ListUsersForm formUserList = new ListUsersForm();
        formUserList.setVisible(true);
        desktop.add(formUserList);
                         
    }//GEN-LAST:event_MenuItemUsersActionPerformed

    private void MenuItemRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemRolesActionPerformed
        // TODO add your handling code here:
        ListRolesForm formRoleList = new ListRolesForm();
        formRoleList.setVisible(true);
        desktop.add(formRoleList);
    }//GEN-LAST:event_MenuItemRolesActionPerformed

    private void MenuItemTollsPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemTollsPassActionPerformed
        // TODO add your handling code here:
        CollectTollForm ctf = new CollectTollForm();
        ctf.setVisible(true);
        desktop.add(ctf);
    }//GEN-LAST:event_MenuItemTollsPassActionPerformed

    private void MenuItemProgramsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemProgramsActionPerformed
        // TODO add your handling code here:
        ListProgramForm lpf = new ListProgramForm();
        lpf.setVisible(true);
        desktop.add(lpf);
    }//GEN-LAST:event_MenuItemProgramsActionPerformed

    //Χρήση τύπου Enumeration για στοίχιση των παραθύρων
     enum TileType {
    TILE_HORIZONTAL, TILE_VERTICAL, TILE_CASCADE, TILE_SQUARE
   };
        
     private void arrangeCurrentWindow(TileType WindowLayout) {

        /*
         * get the component count at the xc frame layer as only interest in
         * xcFrame nothing else
         */
        final JInternalFrame[] frames = desktop.getAllFramesInLayer(JLayeredPane.DEFAULT_LAYER);

        final Dimension dim = desktop.getSize();
      

        switch (WindowLayout) {
            case TILE_HORIZONTAL: {
                int vertSize = dim.height / frames.length;
                for (int i = 0; i < frames.length; i++) {
                    frames[i].setSize(new Dimension(dim.width, vertSize));
                    frames[i].setLocation(0, i * vertSize);
                }
                break;
            }
            case TILE_VERTICAL: {
                int horizSize = dim.width / frames.length;
                for (int i = 0; i < frames.length; i++) {
                    frames[i].setSize(new Dimension(horizSize, dim.height));
                    frames[i].setLocation(i * horizSize, 0);
                }
                break;
            }
            case TILE_CASCADE: {
                for (int i = 0; i < frames.length; i++) {
                    frames[i].setSize(new Dimension(dim.height / 2, dim.height / 2));
                    frames[i].setLocation(40 * i, 40 * i);
                }
                break;
            }
            case TILE_SQUARE: {
                int hCount = frames.length / 2 + 1;
                if (hCount >= 3) {
                    hCount = 2;
                }
                int vCount = 1;
                if (frames.length > 2) {
                    vCount = 2;
                }
                int vertSize = dim.height / vCount;
                int horizSize = dim.width / hCount;

                for (int i = 0; i < vCount; i++) {
                    for (int j = 0; j < hCount; j++) {
                        if (i * 2 + j >= frames.length) {
                            break;
                        }
                        JInternalFrame frame = frames[i * 2 + j];
                        frame.setSize(new Dimension(horizSize, vertSize));
                        frame.setLocation(j * horizSize, i * vertSize);
                    }
                }
            }
        }
        desktop.validate();

    } 
                        

                 
    
    private void MenuItemTileCascadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemTileCascadeActionPerformed
       arrangeCurrentWindow(TileType.TILE_CASCADE);
    }//GEN-LAST:event_MenuItemTileCascadeActionPerformed

    private void MenuItemExitApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemExitApplicationActionPerformed
        System.exit(0);
    }//GEN-LAST:event_MenuItemExitApplicationActionPerformed

    private void MenuItemTileHorizontallyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemTileHorizontallyActionPerformed
       arrangeCurrentWindow(TileType.TILE_HORIZONTAL);
    }//GEN-LAST:event_MenuItemTileHorizontallyActionPerformed

    private void MenuItemTileVerticallyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemTileVerticallyActionPerformed
        arrangeCurrentWindow(TileType.TILE_VERTICAL);
    }//GEN-LAST:event_MenuItemTileVerticallyActionPerformed

    private void MenuItemTileGridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemTileGridActionPerformed
        arrangeCurrentWindow(TileType.TILE_SQUARE);
    }//GEN-LAST:event_MenuItemTileGridActionPerformed

    private void MenuItemTransactionsCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemTransactionsCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemTransactionsCardActionPerformed

    private void MenuItemTransactionsCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemTransactionsCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemTransactionsCustomerActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Avenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
               new Avenue().setVisible(false);
                            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menu;
    private javax.swing.JMenuItem MenuItemCustomers;
    private javax.swing.JMenuItem MenuItemExitApplication;
    private javax.swing.JMenuItem MenuItemPrograms;
    private javax.swing.JMenuItem MenuItemRoles;
    private javax.swing.JMenuItem MenuItemTileCascade;
    private javax.swing.JMenuItem MenuItemTileGrid;
    private javax.swing.JMenuItem MenuItemTileHorizontally;
    private javax.swing.JMenuItem MenuItemTileVertically;
    private javax.swing.JMenuItem MenuItemTollsPass;
    private javax.swing.JMenuItem MenuItemTollsPayments;
    private javax.swing.JMenuItem MenuItemTransactionsCard;
    private javax.swing.JMenuItem MenuItemTransactionsCustomer;
    private javax.swing.JMenuItem MenuItemUsers;
    private javax.swing.JPanel PanelFooter;
    private javax.swing.JTextField TextFieldStation;
    private javax.swing.JTextField TextFieldUsername;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables

      
}
