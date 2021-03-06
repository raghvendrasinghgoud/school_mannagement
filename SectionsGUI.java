/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_mannagement;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ragha
 */
public class SectionsGUI extends javax.swing.JFrame {

    /**
     * Creates new form SectionsGUI
     */
    private Section sec=new Section();
    private char selectCellValue=' ';
    public SectionsGUI() {
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
        AddSecBtn = new javax.swing.JButton();
        DelSectionBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SectionTable = new javax.swing.JTable();
        BackToMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Section");

        AddSecBtn.setText("Add Section");
        AddSecBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSecBtnActionPerformed(evt);
            }
        });

        DelSectionBtn.setText("Delete Section");
        DelSectionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelSectionBtnActionPerformed(evt);
            }
        });

        try{
            SectionTable.setModel(new javax.swing.table.DefaultTableModel(
                sec.showSection(),
                new String [] {
                    "Section Name"
                }
            ));
            SectionTable.setCellSelectionEnabled(true);
            SectionTable.setRowHeight(30);
        }catch(Exception e){}
        jScrollPane1.setViewportView(SectionTable);

        BackToMenu.setText("Back To Menu");
        BackToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(BackToMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DelSectionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
            .addGroup(layout.createSequentialGroup()
                .addGap(342, 342, 342)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddSecBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(AddSecBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DelSectionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BackToMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DelSectionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelSectionBtnActionPerformed
        try {
            // TODO add your handling code here:

            
            sec.deleteSection();
            createTable();
        //    DelSectionBtn.setEnabled(false);
            
        } catch (Exception ex) {
            Logger.getLogger(SubjectGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DelSectionBtnActionPerformed

    private void AddSecBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSecBtnActionPerformed
        try {
            // TODO add your handling code here:
            sec.insertSection();
            createTable();
        } catch (Exception ex) {
            Logger.getLogger(SectionsGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AddSecBtnActionPerformed

    private void BackToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuActionPerformed
        // TODO add your handling code here:
        new AdminMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_BackToMenuActionPerformed
  /*
    public Object[][] listToArray()throws Exception{
        //  ArrayList<Character> li=sec.showSection();
         // char arr[]=new char[li.size()];
          //Object obj[]=sec.showSection().toArray(); //= new Object[li.size()][0];
          Object secName[][]=sec.showSection().toArray(new Object[sec.showSection().size()][]);;
            //secName[] = li.toArray();
          //Object TabData[][]=new Object[secName.length][0];
          //for(int i=0;i<li.size();i++){
            //  System.out.println("Loop is running and list size is "+li.size());
           // secName[][]=li.toArray();
          //}
          for(int i=0;i<secName.length;i++){
              //System.out.println(li.get(i));
              //obj[i]=li.get(i);
              //secName[i][0]=obj[i];
             System.out.println(secName[i][0]);
          }
          //Object obj[][]=secName[][];
          return secName;
    }*/
    public void createTable()throws Exception{
      SectionTable.setModel(new javax.swing.table.DefaultTableModel(
    sec.showSection(),
    new String [] {
        "Class Name"
    }
));

jScrollPane1.setViewportView(SectionTable);
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
            java.util.logging.Logger.getLogger(SectionsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SectionsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SectionsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SectionsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SectionsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddSecBtn;
    private javax.swing.JButton BackToMenu;
    private javax.swing.JButton DelSectionBtn;
    private javax.swing.JTable SectionTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
