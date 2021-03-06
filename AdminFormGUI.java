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
public class AdminFormGUI extends javax.swing.JFrame {

    /**
     * Creates new form AdminFormGUI
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
    private String Password="";
    
    
    //required classes obects
        Validations valid=new Validations();
        GetComponentData fillData=new GetComponentData();
       
    public AdminFormGUI() {
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
        jLabel6 = new javax.swing.JLabel();
        FemaleRadio = new javax.swing.JRadioButton();
        MaleRadio = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        monthBox = new javax.swing.JComboBox<>();
        dayBox = new javax.swing.JComboBox<>();
        yearBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        FnameField = new javax.swing.JTextField();
        LnameField = new javax.swing.JTextField();
        selectImageBtn = new javax.swing.JButton();
        imageLabel = new javax.swing.JLabel();
        Submitbtn = new javax.swing.JButton();
        BackToTeachers1 = new javax.swing.JButton();
        MobField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        ConfirmPassField = new javax.swing.JPasswordField();
        fnameValid = new javax.swing.JLabel();
        lnameValid = new javax.swing.JLabel();
        passValid = new javax.swing.JLabel();
        mobValid = new javax.swing.JLabel();
        conpassValid = new javax.swing.JLabel();
        emailValid = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin Register");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Last Name");

        FemaleRadio.setText("Female");
        FemaleRadio.setName("Female"); // NOI18N
        FemaleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleRadioActionPerformed(evt);
            }
        });

        MaleRadio.setText("Male");
        MaleRadio.setName("Male"); // NOI18N
        MaleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleRadioActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("Gender");

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

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setText("Birth Date");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setText("Password");

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel10.setText("E-mail");

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

        selectImageBtn.setText("Select Image");
        selectImageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectImageBtnActionPerformed(evt);
            }
        });

        Submitbtn.setText("Submit");
        Submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitbtnActionPerformed(evt);
            }
        });

        BackToTeachers1.setText("Back To Admin");
        BackToTeachers1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToTeachers1ActionPerformed(evt);
            }
        });

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

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setText("Mob No.");

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel11.setText("Confirm Password");

        ConfirmPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmPassFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addComponent(Submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33)
                                    .addComponent(MaleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(FemaleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addComponent(LnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addComponent(FnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46)
                                    .addComponent(dayBox, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(53, 53, 53)
                                    .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(passwordField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(BackToTeachers1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addComponent(passValid, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ConfirmPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MobField, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fnameValid, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lnameValid, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectImageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(mobValid, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(emailValid, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(conpassValid, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(selectImageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(MaleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FemaleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dayBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fnameValid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(lnameValid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(passValid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(conpassValid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ConfirmPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailValid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MobField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobValid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(BackToTeachers1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FemaleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FemaleRadioActionPerformed

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

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void emailFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailFieldKeyReleased
        // TODO add your handling code here:

        Email=fillData.checkValidData(emailField,emailValid,valid.emailValid(emailField.getText()));
    }//GEN-LAST:event_emailFieldKeyReleased

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

    private void SubmitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitbtnActionPerformed
        // TODO add your handling code here:
        String month;
        if(monthBox.getSelectedIndex()>9)
        month=""+monthBox.getSelectedIndex();
        else
        month="0"+monthBox.getSelectedIndex();
        if(passwordField.getText().equals(ConfirmPassField.getText())){
            Password=passwordField.getText();
            System.out.println(Password+" password is equal");
        }
        else{
            ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\Users\\ragha\\Documents\\NetBeansProjects\\School_Mannagement\\src\\school_mannagement\\Icons\\invalid.jpg").getImage().getScaledInstance(conpassValid.getHeight(),conpassValid.getWidth(),Image.SCALE_DEFAULT ));        
        conpassValid.setIcon(imageIcon);
        return;

        }
            System.out.println(Password+" password is this");
        Birth_date=(String)yearBox.getSelectedItem()+"-"+month+"-"+dayBox.getSelectedItem();
        System.out.println(Birth_date);
        if(!(Fname==""&&Lname==""&&Birth_date==""&&Mob_no==""&&ImageName==""&&Password=="")){
            try {
                if(MaleRadio.isSelected())    //getting gender data
                Gender=MaleRadio.getText();
                else
                Gender=FemaleRadio.getText();

                ImagePath="C:\\Users\\ragha\\Documents\\NetBeansProjects\\School_Mannagement\\src\\school_mannagement\\StuTeachImages\\"+ImageName+"";
                
                
                ImagePath=ImagePath.replace(".", Mob_no+".");
                ImageIO.write(bi, "jpg", new File(ImagePath));
                ImagePath=ImagePath.replace((char)92,(char)44);
                Admin admin=new Admin(Fname,Lname,Gender,Birth_date, Mob_no, Email, ImagePath, Password);
                admin.insertAdmin();
                ClearComponents() ;  //this will clear the omponents of the frame for next Input
            } catch (Exception ex) {
                java.util.logging.Logger.getLogger(TeacherFormGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_SubmitbtnActionPerformed
public void ClearComponents()throws Exception{
        FnameField.setText("");
        LnameField.setText("");
        MobField.setText("");
        emailField.setText("");
        passwordField.setText("");
        ConfirmPassField.setText("");
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\Users\\ragha\\Documents\\NetBeansProjects\\School_Mannagement\\src\\school_mannagement\\Icons\\addimage.png").getImage().getScaledInstance(imageLabel.getHeight(),imageLabel.getWidth(),Image.SCALE_DEFAULT ));        
        imageLabel.setIcon(imageIcon);
        
        ImageIcon validIcon = new ImageIcon(new ImageIcon("C:\\Users\\ragha\\Documents\\NetBeansProjects\\School_Mannagement\\src\\school_mannagement\\Icons\\invalid.jpg").getImage().getScaledInstance(fnameValid.getHeight(),fnameValid.getWidth(),Image.SCALE_DEFAULT ));        
        
        fnameValid.setIcon(validIcon);
        mobValid.setIcon(validIcon);
        emailValid.setIcon(validIcon);
        
        
    }
    private void BackToTeachers1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToTeachers1ActionPerformed
        // TODO add your handling code here:
        new AdminsGUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_BackToTeachers1ActionPerformed

    private void MobFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MobFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MobFieldActionPerformed

    private void MobFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MobFieldKeyReleased
        // TODO add your handling code here:
        Mob_no=fillData.checkValidData(MobField,mobValid,valid.mobValid(MobField.getText()));
    }//GEN-LAST:event_MobFieldKeyReleased

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void ConfirmPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmPassFieldActionPerformed

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
            java.util.logging.Logger.getLogger(AdminFormGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminFormGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminFormGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFormGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFormGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToTeachers1;
    private javax.swing.JPasswordField ConfirmPassField;
    private javax.swing.JRadioButton FemaleRadio;
    private javax.swing.JTextField FnameField;
    private javax.swing.JTextField LnameField;
    private javax.swing.JRadioButton MaleRadio;
    private javax.swing.JTextField MobField;
    private javax.swing.JButton Submitbtn;
    private javax.swing.JLabel conpassValid;
    private javax.swing.JComboBox<String> dayBox;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailValid;
    private javax.swing.JLabel fnameValid;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lnameValid;
    private javax.swing.JLabel mobValid;
    private javax.swing.JComboBox<String> monthBox;
    private javax.swing.JLabel passValid;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton selectImageBtn;
    private javax.swing.JComboBox<String> yearBox;
    // End of variables declaration//GEN-END:variables
}
