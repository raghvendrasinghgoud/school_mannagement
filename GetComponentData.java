/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_mannagement;

import java.awt.Image;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ragha
 */
public class GetComponentData {
    
    private Valid v=new Valid();
    
    /*
    This dayitemInsertion function inserts data iside birthdate day Combobox
    */
   public void dayItemInsertion(JComboBox dayBox,JComboBox monthBox){
        String day[]=new String[31];
dayBox.removeAllItems();
int monthIndex=monthBox.getSelectedIndex();        
        if(monthIndex%2==0){
            if(monthIndex==2){
                v.getValues(day,1,29);
                v.showValues(day,dayBox,29);
        }
            else{
            if(monthIndex==8||monthIndex==10||monthIndex==12){
                v.getValues(day,1,31);
                v.showValues(day, dayBox, 31);
        }
        else{
                v.getValues(day,1,30);
                v.showValues(day, dayBox,30 );
        }
            }
            
        }else{
            if(monthIndex==9||monthIndex==11){
                v.getValues(day,1,30);
                v.showValues(day, dayBox, 30);
        }
        else{
                v.getValues(day,1,31);
                v.showValues(day, dayBox, 31);
        }
        }
        dayBox.setSelectedIndex(12);
    }
   /*
    This dayitemInsertion function inserts data iside birthdate year Combobox
    */
   //code for Birth date combo boxes data
    void yearItemInsertion(JComboBox dayBox,JComboBox monthBox,JComboBox yearBox){
        String year[]=new String[151];
         Calendar calendar = Calendar.getInstance();  
         int currYear=calendar.get(Calendar.YEAR);
         int start=currYear-150;
         
         v.setYear(year, dayBox, monthBox, start, currYear);
         if(monthBox.getSelectedIndex()==2 && dayBox.getSelectedIndex()==28){
             yearBox.removeAllItems();
             
            v.showYearValues(year, yearBox,150/4);
         }
         else{
             yearBox.removeAllItems();
             v.showYearValues(year, yearBox, 150);
         }
        if(monthBox.getSelectedIndex()==2 && dayBox.getSelectedIndex()==28)
                yearBox.setSelectedIndex(32);
        else
            yearBox.setSelectedIndex(128);
    }
    /*
    ClassItemInsertion functions sets data into classBox ComboBox 
    */
    void ClassItemInsertion(JComboBox classBox)throws Exception{
        Class cl=new Class();
        String classData[]=cl.getEmptyClasses();  //cl.getClasses retrieve class_id from Database
       
        for(String str:classData)
        classBox.addItem(str);
    }
    /*
    StudentClassItemInsertion functions sets data into classBox ComboBox 
    */
    void StudentClassItemInsertion(JComboBox classBox)throws Exception{
        Class cl=new Class();
        Object classData[][]=cl.getClasses();  //cl.getClasses retrieve class_id from Database
        String str[]=new String[classData.length];
        for(int i=0;i<classData.length;i++){
            for(int j=0;j<1;j++)
                str[i]=classData[i][j].toString();
        }
        for(String i:str)
        classBox.addItem(i);
    }
    /*
    This checkValidData Function shows validation of data during input
    */
    String checkValidData(JTextField field,JLabel label,boolean b){
        
        if(b){
            ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\Users\\ragha\\Documents\\NetBeansProjects\\School_Mannagement\\src\\school_mannagement\\Icons\\valid.png").getImage().getScaledInstance(label.getHeight(), label.getWidth(),Image.SCALE_DEFAULT ));        
            label.setIcon(imageIcon);
             return field.getText();
             
        }else{
            ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\Users\\ragha\\Documents\\NetBeansProjects\\School_Mannagement\\src\\school_mannagement\\Icons\\invalid.jpg").getImage().getScaledInstance(label.getHeight(), label.getWidth(), Image.SCALE_DEFAULT));
            label.setIcon(imageIcon);
            return "";
        }
    }
    /*
    This function is for validate in seticon on button
    */
    String checkValidUpdate(JTextField field,JButton label,boolean b){
        
        if(b){
            ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\Users\\ragha\\Documents\\NetBeansProjects\\School_Mannagement\\src\\school_mannagement\\Icons\\valid.png").getImage().getScaledInstance(label.getHeight(), label.getWidth(),Image.SCALE_DEFAULT ));        
            label.setIcon(imageIcon);
             return field.getText();
             
        }else{
            ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\Users\\ragha\\Documents\\NetBeansProjects\\School_Mannagement\\src\\school_mannagement\\Icons\\invalid.jpg").getImage().getScaledInstance(label.getHeight(), label.getWidth(), Image.SCALE_DEFAULT));
            label.setIcon(imageIcon);
            return "";
        }
    }
}
