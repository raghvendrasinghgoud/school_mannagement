/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_mannagement;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author ragha
 */
public class StudentFormGUI extends javax.swing.JFrame {

    /**
     * Creates new form StudentFormGUI
     */
     
    private String Fname="";
    private String Lname="";
    private String Gender="";
    private String Birth_date="";
    private String Mob_no="";
    private String Email="";
    private String ImagePath="";
    private String ImageName="";
    private BufferedImage bi ;
    private String P_id;
    private String class_id;
    private LocalDate Join_date;
    private Object SelectedSub[];
    //required classes obects
        Validations valid=new Validations();
        GetComponentData fillData=new GetComponentData();
       
        Subject sub=new Subject();
    public StudentFormGUI() {
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
        imageLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        qualValid = new javax.swing.JLabel();
        ClassBox = new javax.swing.JComboBox<>();
        Submitbtn = new javax.swing.JButton();
        selectImageBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SubjectList = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        BackToMenu = new javax.swing.JButton();
        MaleRadio = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        monthBox = new javax.swing.JComboBox<>();
        dayBox = new javax.swing.JComboBox<>();
        yearBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        MobField = new javax.swing.JTextField();
        mobValid = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FnameField = new javax.swing.JTextField();
        fnameValid = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LnameField = new javax.swing.JTextField();
        lnameValid = new javax.swing.JLabel();
        FemaleRadio = new javax.swing.JRadioButton();
        emailField = new javax.swing.JTextField();
        emailValid = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Form");

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel13.setText("Class ");

        try{
            fillData.StudentClassItemInsertion(ClassBox);
        }catch(Exception e){ }

        Submitbtn.setText("Submit");
        Submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitbtnActionPerformed(evt);
            }
        });

        selectImageBtn.setText("Choose Image");
        selectImageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectImageBtnActionPerformed(evt);
            }
        });

        try{
            SubjectList.setModel(new javax.swing.AbstractListModel<String>() {
                String[] strings = getTableData();
                public int getSize() { return strings.length; }
                public String getElementAt(int i) { return strings[i]; }
            });
        }catch(Exception e){}
        jScrollPane1.setViewportView(SubjectList);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Last Name");

        BackToMenu.setText("Back To Students");
        BackToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuActionPerformed(evt);
            }
        });

        MaleRadio.setSelected(true);
        MaleRadio.setText("Male");
        MaleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleRadioActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setText("Birth Date");

        monthBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "Jan", "Feb", "Mar", "Aprail", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        monthBox.setSelectedIndex(9);
        monthBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthBoxActionPerformed(evt);
            }
        });

        dayBox.setToolTipText("Select Day");
        fillData.dayItemInsertion(dayBox, monthBox);
        dayBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayBoxActionPerformed(evt);
            }
        });

        fillData.yearItemInsertion(dayBox, monthBox, yearBox);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setText("Mob No.");

        MobField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MobFieldActionPerformed(evt);
            }
        });
        MobField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                MobFieldKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel10.setText("E-mail");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("First Name");

        FnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FnameFieldActionPerformed(evt);
            }
        });
        FnameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FnameFieldKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("Gender");

        LnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LnameFieldActionPerformed(evt);
            }
        });
        LnameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                LnameFieldKeyReleased(evt);
            }
        });

        FemaleRadio.setText("Female");
        FemaleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleRadioActionPerformed(evt);
            }
        });

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });
        emailField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(FnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(LnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(MaleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(FemaleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(dayBox, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(MobField, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClassBox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(252, 252, 252)
                                .addComponent(Submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fnameValid, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lnameValid, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mobValid, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(selectImageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(emailValid, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qualValid, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(BackToMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fnameValid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lnameValid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(mobValid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(emailValid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(qualValid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(selectImageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(LnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MaleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FemaleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dayBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addComponent(MobField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(ClassBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(100, 100, 100)
                        .addComponent(Submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(BackToMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public String[] getTableData()throws Exception{
        Object subData[][]=sub.showSubjects();
        String subDataMore[]=new String[subData.length];
        //JCheckBox subCheck=new JCheckBox();
        for(int i=0;i<subData.length;i++){
            for(int j=0;j<3;j++){
                
                if(j==1)
                    subDataMore[i]=subData[i][j].toString();  
                
            } //end of inner for loop
        }
        return subDataMore;
    }
    private void SubmitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitbtnActionPerformed
        // TODO add your handling code here:
        String month;
        if(monthBox.getSelectedIndex()>9)
        month=""+monthBox.getSelectedIndex();
        else
        month="0"+monthBox.getSelectedIndex();
        class_id=ClassBox.getSelectedItem().toString();
        Birth_date=(String)yearBox.getSelectedItem()+"-"+month+"-"+dayBox.getSelectedItem();
        System.out.println(Birth_date);
        if(!(Fname==""&&Lname==""&&Birth_date==""&&Mob_no==""&&ImageName==""&&class_id=="")){
            try {
                if(MaleRadio.isSelected())    //getting gender data
                Gender=MaleRadio.getText();
                else
                Gender=FemaleRadio.getText();

                ImagePath="C:\\Users\\ragha\\Documents\\NetBeansProjects\\School_Mannagement\\src\\school_mannagement\\StuTeachImages\\"+ImageName+"";
                Join_date=LocalDate.now();
                System.out.println(Join_date);
                if(!SubjectList.isSelectionEmpty()){
                    SelectedSub=SubjectList.getSelectedValuesList().toArray();
                }
                Student stu=new Student( "S00",class_id, SelectedSub, Fname,  Lname,  Gender,  Birth_date,  Mob_no,  Email,  ImagePath,  Join_date,bi);
                stu.insertStudentData();

                ClearComponents() ;  //this will clear the omponents of the frame for next Input
            } catch (Exception ex) {
                java.util.logging.Logger.getLogger(TeacherFormGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_SubmitbtnActionPerformed

    private void selectImageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectImageBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser imageFileChooser=new JFileChooser();
        //FileNameExtensionFilter imgFilter=new FileNameExtensionFilter("Jpg Only(.jpg)","jpg","png");
        int selected=imageFileChooser.showOpenDialog(null);
        if(selected==imageFileChooser.APPROVE_OPTION){

            try {
                File Img=imageFileChooser.getSelectedFile();
                ImageName=imageFileChooser.getSelectedFile().getName();
                bi= ImageIO.read(Img);
                Image newImage = bi.getScaledInstance(imageLabel.getHeight(), imageLabel.getWidth(), Image.SCALE_DEFAULT);
                imageLabel.setIcon(new ImageIcon(newImage));

            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(TeacherFormGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

        }else{
            imageLabel.setText("Image is Mandatory");
        }
    }//GEN-LAST:event_selectImageBtnActionPerformed

    private void BackToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuActionPerformed
        // TODO add your handling code here:
        new StudentGUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_BackToMenuActionPerformed

    private void MaleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaleRadioActionPerformed

    private void monthBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthBoxActionPerformed
        // TODO add your handling code here:
        fillData.dayItemInsertion(dayBox, monthBox);
    }//GEN-LAST:event_monthBoxActionPerformed

    private void dayBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayBoxActionPerformed
        // TODO add your handling code here:
        fillData.yearItemInsertion(dayBox, monthBox, yearBox);
    }//GEN-LAST:event_dayBoxActionPerformed

    private void MobFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MobFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MobFieldActionPerformed

    private void MobFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MobFieldKeyReleased
        // TODO add your handling code here:

        Mob_no=fillData.checkValidData(MobField,mobValid,valid.mobValid(MobField.getText()));
    }//GEN-LAST:event_MobFieldKeyReleased

    private void FnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FnameFieldActionPerformed

    private void FnameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FnameFieldKeyReleased

        Fname=fillData.checkValidData(FnameField,fnameValid,valid.Name(FnameField.getText()));
    }//GEN-LAST:event_FnameFieldKeyReleased

    private void LnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LnameFieldActionPerformed

    private void LnameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LnameFieldKeyReleased
        // TODO add your handling code here:

        Lname=fillData.checkValidData(LnameField,lnameValid,valid.Name(LnameField.getText()));
    }//GEN-LAST:event_LnameFieldKeyReleased

    private void FemaleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FemaleRadioActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void emailFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailFieldKeyReleased
        // TODO add your handling code here:

        Email=fillData.checkValidData(emailField,emailValid,valid.emailValid(emailField.getText()));
    }//GEN-LAST:event_emailFieldKeyReleased
public void ClearComponents()throws Exception{
        FnameField.setText("");
        LnameField.setText("");
        MobField.setText("");
        emailField.setText("");
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\Users\\ragha\\Documents\\NetBeansProjects\\School_Mannagement\\src\\school_mannagement\\Icons\\addimage.png").getImage().getScaledInstance(imageLabel.getHeight(),imageLabel.getWidth(),Image.SCALE_DEFAULT ));        
        imageLabel.setIcon(imageIcon);
        SubjectList.clearSelection();
        ImageIcon validIcon = new ImageIcon(new ImageIcon("C:\\Users\\ragha\\Documents\\NetBeansProjects\\School_Mannagement\\src\\school_mannagement\\Icons\\invalid.jpg").getImage().getScaledInstance(fnameValid.getHeight(),fnameValid.getWidth(),Image.SCALE_DEFAULT ));        
        
        fnameValid.setIcon(validIcon);
        mobValid.setIcon(validIcon);
        emailValid.setIcon(validIcon);
        qualValid.setIcon(validIcon);
        fillData.ClassItemInsertion(ClassBox);
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
            java.util.logging.Logger.getLogger(StudentFormGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentFormGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentFormGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentFormGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentFormGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMenu;
    private javax.swing.JComboBox<String> ClassBox;
    private javax.swing.JRadioButton FemaleRadio;
    private javax.swing.JTextField FnameField;
    private javax.swing.JTextField LnameField;
    private javax.swing.JRadioButton MaleRadio;
    private javax.swing.JTextField MobField;
    private javax.swing.JList<String> SubjectList;
    private javax.swing.JButton Submitbtn;
    private javax.swing.JComboBox<String> dayBox;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailValid;
    private javax.swing.JLabel fnameValid;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lnameValid;
    private javax.swing.JLabel mobValid;
    private javax.swing.JComboBox<String> monthBox;
    private javax.swing.JLabel qualValid;
    private javax.swing.JButton selectImageBtn;
    private javax.swing.JComboBox<String> yearBox;
    // End of variables declaration//GEN-END:variables
}