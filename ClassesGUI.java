/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_mannagement;

import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author ragha
 */
public class ClassesGUI extends javax.swing.JFrame {

    /**
     * Creates new form ClassesGUI
     */
    private String Class_name;
    private Class cl=new Class();
    private String selectCellValue;
    public ClassesGUI() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ClassName = new javax.swing.JTextField();
        AddClassBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ClassTable = new javax.swing.JTable();
        ValidClass = new javax.swing.JLabel();
        DelClassBtn = new javax.swing.JButton();
        BackToMenu = new javax.swing.JButton();
        TeachList = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Classes");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setLabelFor(ClassName);
        jLabel2.setText("Class Name ");

        ClassName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ClassNameKeyReleased(evt);
            }
        });

        AddClassBtn.setText("Add Class");
        AddClassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddClassBtnActionPerformed(evt);
            }
        });

        try{
            ClassTable.setModel(new javax.swing.table.DefaultTableModel(
                cl.getClasses(),
                new String [] {
                    "Class Name", "Class Teacher",
                }
            ));
            ClassTable.setCellSelectionEnabled(true);
            ClassTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            ClassTable.setRowHeight(30);
        }catch(Exception e){ }
        ClassTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClassTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ClassTable);

        DelClassBtn.setText("Delete Class");
        DelClassBtn.setEnabled(false);
        DelClassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelClassBtnActionPerformed(evt);
            }
        });

        BackToMenu.setText("Back To Menu");
        BackToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuActionPerformed(evt);
            }
        });

        TeachList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BackToMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(DelClassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(AddClassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ClassName, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ValidClass, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TeachList, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ClassName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ValidClass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BackToMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DelClassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddClassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(TeachList, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddClassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddClassBtnActionPerformed
        if(Class_name!=""){
            try {
                cl.setClass_id(Class_name);
                cl.insertClass_name();
                Class_name="";
            ClassName.setText(Class_name);
            createTable();
            } catch (Exception ex) {
                Logger.getLogger(ClassesGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_AddClassBtnActionPerformed
public void createTable()throws Exception{
ClassTable.setModel(new javax.swing.table.DefaultTableModel(
    cl.getClasses(),
    new String [] {
        "Class Name", "Class Teacher",
    }
));

jScrollPane2.setViewportView(ClassTable);
}
    private void ClassNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ClassNameKeyReleased
        // TODO add your handling code here:
        Validations valid=new Validations();
        if(valid.Vclass(ClassName.getText())){
            ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\Users\\ragha\\Documents\\NetBeansProjects\\School_Mannagement\\src\\school_mannagement\\Icons\\valid.png").getImage().getScaledInstance(ValidClass.getHeight(), ValidClass.getWidth(), Image.SCALE_DEFAULT));
            ValidClass.setIcon(imageIcon);
            Class_name=ClassName.getText();
        }else{
            ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\Users\\ragha\\Documents\\NetBeansProjects\\School_Mannagement\\src\\school_mannagement\\Icons\\invalid.jpg").getImage().getScaledInstance(ValidClass.getHeight(), ValidClass.getWidth(), Image.SCALE_DEFAULT));
            ValidClass.setIcon(imageIcon);
            Class_name="";
        }
    }//GEN-LAST:event_ClassNameKeyReleased

    private void DelClassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelClassBtnActionPerformed
        try {
            // TODO add your handling code here:

            System.out.println(selectCellValue);
            cl.delClass(selectCellValue);
            createTable();
            DelClassBtn.setEnabled(false);

        } catch (Exception ex) {
            Logger.getLogger(SubjectGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DelClassBtnActionPerformed

    private void ClassTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClassTableMouseClicked
        // TODO add your handling code here:
        if(ClassTable.getSelectedRow()>-1){
        selectCellValue= (String)ClassTable.getValueAt(ClassTable.getSelectedRow(), ClassTable.getSelectedColumn());  //this statement get data when use selects cell on table and click on Del Subj btn
            DelClassBtn.setEnabled(true);
    }else
            DelClassBtn.setEnabled(false);
    }//GEN-LAST:event_ClassTableMouseClicked

    private void BackToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuActionPerformed
        // TODO add your handling code here:
        new AdminMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_BackToMenuActionPerformed

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
            java.util.logging.Logger.getLogger(ClassesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassesGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddClassBtn;
    private javax.swing.JButton BackToMenu;
    private javax.swing.JTextField ClassName;
    private javax.swing.JTable ClassTable;
    private javax.swing.JButton DelClassBtn;
    private javax.swing.JComboBox<String> TeachList;
    private javax.swing.JLabel ValidClass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
