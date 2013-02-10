/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import avenue.MyWindowEvent;
import avenue.Session;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.persistence.EntityManager;
import javax.swing.JFrame;
import model.AppUser;
import model.DBManager;

/**
 *
 * @author Aggelos
 */
public class ListUsersForm extends javax.swing.JFrame {

    /**
     * Creates new form ListUsersForm
     */
    public ListUsersForm() {
        em = DBManager.em;
        if ( !em.getTransaction().isActive()){
            em.getTransaction().begin();
        }
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        query1 = em.createQuery("select au from AppUser au where au.stationId=:station").setParameter("station",Session.loginUser.getStationId());
        list1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query1.getResultList());
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit1.png"))); // NOI18N
        jButton3.setText("Επεξεργασία");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remove.gif"))); // NOI18N
        jButton2.setText("Διαγραφή");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.gif"))); // NOI18N
        jButton1.setText("Νέος");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list1, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${FName}"));
        columnBinding.setColumnName("FName");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${LName}"));
        columnBinding.setColumnName("LName");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${userName}"));
        columnBinding.setColumnName("User Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${password}"));
        columnBinding.setColumnName("Password");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${address}"));
        columnBinding.setColumnName("Address");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${adt}"));
        columnBinding.setColumnName("Adt");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${afm}"));
        columnBinding.setColumnName("Afm");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${city}"));
        columnBinding.setColumnName("City");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${phone}"));
        columnBinding.setColumnName("Phone");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${roleId.roleName}"));
        columnBinding.setColumnName("Role Id");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${stationId.description}"));
        columnBinding.setColumnName("Station Id");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${zipCode}"));
        columnBinding.setColumnName("Zip Code");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Χρήστες");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)))
                        .addGap(0, 497, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       u = new AppUser();
       em.persist(u);
       EditUserForm euf = new EditUserForm(u,false);
       
       euf.setVisible(true);
       thisFrame=this;
       thisFrame.setEnabled(false);
       //************
        euf.addWindowListener(new WindowListener() {
            public void windowClosed(WindowEvent arg0) {
                System.out.println("Window close event occur");
               if (((MyWindowEvent)arg0).exitAndSave){
                    
                    
                    list1.add(u);
                    int row = list1.size() - 1;
        
                    jTable1.setRowSelectionInterval(row, row);
                    jTable1.scrollRectToVisible(jTable1.getCellRect(row, 0, true));
                    thisFrame.setEnabled(true);
                }
                else{
                    thisFrame.setEnabled(true);
                    em.getTransaction().rollback();
                    em.getTransaction().begin();
                    java.util.Collection data = query1.getResultList();
                    for (Object entity : data) {
                        em.refresh(entity);
                    }
                    list1.clear();
                    list1.addAll(data);
                }
            }
            public void windowActivated(WindowEvent arg0) {
                System.out.println("Window Activated");
            }
            public void windowClosing(WindowEvent arg0) {
                System.out.println("Window Closing");
            }
            public void windowDeactivated(WindowEvent arg0) {
                System.out.println("Window Deactivated");
            }
            public void windowDeiconified(WindowEvent arg0) {
                System.out.println("Window Deiconified");
            }
            public void windowIconified(WindowEvent arg0) {
                System.out.println("Window Iconified");
            }
            public void windowOpened(WindowEvent arg0) {
                System.out.println("Window Opened");
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int s=jTable1.getSelectedRow();
        if (s>=0) {
            AppUser u = list1.get(jTable1.convertRowIndexToModel(s));
            list1.remove(u);
            em.remove(u);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        s=jTable1.getSelectedRow();
        
        if (s>=0) {
            u = list1.get(jTable1.convertRowIndexToModel(s));
            EditUserForm euf = new EditUserForm(u,false);
            
            em.persist(u);
            
            euf.setVisible(true);
            thisFrame=this;
            thisFrame.setEnabled(false);
        
       
       //************
        euf.addWindowListener(new WindowListener() {
            public void windowClosed(WindowEvent arg0) {
                System.out.println("Window close event occur");
               if (((MyWindowEvent)arg0).exitAndSave){
                    
                    
                    jTable1.setRowSelectionInterval(s, s);
                    jTable1.scrollRectToVisible(jTable1.getCellRect(s, 0, true));
                    thisFrame.setEnabled(true);
                }
                else{
                    thisFrame.setEnabled(true);
                    em.getTransaction().rollback();
                    em.getTransaction().begin();
                    java.util.Collection data = query1.getResultList();
                    for (Object entity : data) {
                        em.refresh(entity);
                    }
                    list1.clear();
                    list1.addAll(data);
                }
            }
            public void windowActivated(WindowEvent arg0) {
                System.out.println("Window Activated");
            }
            public void windowClosing(WindowEvent arg0) {
                System.out.println("Window Closing");
            }
            public void windowDeactivated(WindowEvent arg0) {
                System.out.println("Window Deactivated");
            }
            public void windowDeiconified(WindowEvent arg0) {
                System.out.println("Window Deiconified");
            }
            public void windowIconified(WindowEvent arg0) {
                System.out.println("Window Iconified");
            }
            public void windowOpened(WindowEvent arg0) {
                System.out.println("Window Opened");
            }
        });
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ListUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListUsersForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.util.List<AppUser> list1;
    private javax.persistence.Query query1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    AppUser u;
    EntityManager em;
    JFrame thisFrame;
    int s;
}