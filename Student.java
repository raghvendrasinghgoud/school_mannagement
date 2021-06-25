/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_mannagement;

import java.awt.image.BufferedImage;
import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ragha
 */
public class Student extends Person {
    private String P_id;
    private String class_id;
    //private String Section_name;
    private Object SelectedSub[];

    //Database Connection Variables
           private String url="jdbc:mysql://localhost:3306/school_mannagement";
           private String uname="root";
           private String pass="Raghav@123";
           private String sql;
            //End of JDBC varidables;
           
    //private String roll_no;
    /*contructor of class Student who reciesves the values of varidables*/
    public Student(String who,String class_id, Object[] SelectedSub, String Fname, String Lname, String gender, String Birth_date, String Mob_no, String Email, String Image, LocalDate Join_date,BufferedImage bi) {
        super(who,Fname, Lname, gender, Birth_date, Mob_no, Email, Image, Join_date,bi);
        try {
            this.P_id = super.getID(who,Fname, Lname);
        } catch (Exception ex) {
            Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
        }
;
        
        this.class_id = class_id;
        this.SelectedSub = SelectedSub;
    }
    /*insertStudentData inserts the data into database of school_mannagement */
    void insertStudentData()throws Exception{
         super.InsertPersonData();
         forName("com.mysql.cj.jdbc.Driver");
          Connection con=DriverManager.getConnection(url,uname,pass);
          Statement st=con.createStatement();
          sql="insert into student(p_id,class_id)"
                  + "       values('"+P_id+"','"+class_id+"')";
          int rA=st.executeUpdate(sql);
          System.out.println(rA+" rows affected in teacher table");
          /*
          *Here we inserting data inside teach_sub table 
          *which contain subjects of Student
          */
          
          String str[]=new String[SelectedSub.length];
          for(int i=0;i<SelectedSub.length;i++){
          sql="select sub_id from subject where sub_name='"+SelectedSub[i].toString()+"'";
          ResultSet res=st.executeQuery(sql);
          res.next();
          str[i]=res.getString("sub_id");
          System.out.println(str[i] +" sub_id");
          new StudentSub(P_id,str[i]).insertStudentSub();
          }
          
          st.close();
          con.close();
     }
    /*getStudentData retrie data from the data */
    static String[][] getStudentsData()throws Exception{
         //Database Connection Variables
            String url="jdbc:mysql://localhost:3306/school_mannagement";
            String uname="root";
            String pass="Raghav@123";
            String sql;
            //End of JDBC varidables;
         
         forName("com.mysql.cj.jdbc.Driver");
          Connection con=DriverManager.getConnection(url,uname,pass);
          Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,  
                     ResultSet.CONCUR_UPDATABLE);
          sql="select p_id,fname,class_id from (select person.p_id,person.fname,student.class_id "
                  + "from person left join student on person.p_id=student.p_id) as st "
                  + "where p_id like 'S00%'";
          ResultSet res=st.executeQuery(sql);
          res.last();
          int size=res.getRow();
          res.first();
          System.out.println(size+" is no. of ros in table;");
          System.out.println(res.getRow()+" is no. of ros in table;");
          String TeachData[][]=new String[size][3];
          for(int i=0;i<size;i++){
              
              for(int j=0;j<3;j++){
                  if(j==0)
                      TeachData[i][j]=res.getString("p_id");
                  if(j==1)
                      TeachData[i][j]=res.getString("fname");
                  if(j==2)
                      TeachData[i][j]=res.getString("class_id");
                  
              }
              res.next();
          }
             
          //closing db connection
          st.close();
          con.close();
          
          return TeachData;
     }
    /*updateTeacherData function takes two argument P_id and dataName what data need to update */
     static Map<String,String> getStudentData(String P_id)throws Exception{
        //Database Connection Variables
            String url="jdbc:mysql://localhost:3306/school_mannagement";
            String uname="root";
            String pass="Raghav@123";
            String sql;
            //End of JDBC varidables;
         
         forName("com.mysql.cj.jdbc.Driver");
          Connection con=DriverManager.getConnection(url,uname,pass);
          Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,  
                     ResultSet.CONCUR_UPDATABLE);
          sql="select person.p_id,person.fname,person.lname,person.gender,person.birth_date,person.mob_no,person.email,person.image,person.join_date,\n" +
"person.leave_date,student.class_id \n" +
" from person,student where person.p_id='"+P_id+"' and student.p_id='"+P_id+"'";
          ResultSet res=st.executeQuery(sql);
          ResultSetMetaData rsmd=res.getMetaData();
          res.next();
          Map<String,String> TeachData=new HashMap<>();
             for(int i=1;i<=11;i++){
                 TeachData.put(rsmd.getColumnName(i),res.getString(rsmd.getColumnName(i)) );
             }
             for(String key:TeachData.keySet()){
                 System.out.println(key+" "+TeachData.get(key));
             }
          //closing db connection
          st.close();
          con.close();
          
          return TeachData;
     }
     static String[] showStudentSubjects(String P_id)throws Exception{
         //Database Connection Variables
            String url="jdbc:mysql://localhost:3306/school_mannagement";
            String uname="root";
            String pass="Raghav@123";
            String sql;
            //End of JDBC varidables;
            forName("com.mysql.cj.jdbc.Driver");
          Connection con=DriverManager.getConnection(url,uname,pass);
          Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,  
                     ResultSet.CONCUR_UPDATABLE);
          sql="select * from subject where sub_id in (select sub_id from student_subject where p_id='"+P_id+"')";
          ResultSet res=st.executeQuery(sql);
          ResultSetMetaData rsmd=res.getMetaData();
          res.last();
          int size=res.getRow();
          
          res.first();
          String TeachSub[]=new String[size];
          for(int j=0;j<size;j++){   
             
         // for(int i=0;i<2;i++){
              
              TeachSub[j]=res.getString(rsmd.getColumnName(2));
    //     }
          res.next();
    }
          for(String i:TeachSub)
              System.out.println(i);
         
          //closing db connection
          st.close();
          con.close();
          
          return TeachSub;
     }
     static void updateStuSub(List<String> sublist,String P_id)throws Exception{
        //Database Connection Variables
            String url="jdbc:mysql://localhost:3306/school_mannagement";
            String uname="root";
            String pass="Raghav@123";
            String sql;
            //End of JDBC varidables;
            forName("com.mysql.cj.jdbc.Driver");
          Connection con=DriverManager.getConnection(url,uname,pass);
          Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,  
                     ResultSet.CONCUR_UPDATABLE);
          sql="delete from student_subject where p_id='"+P_id+"'";
          int rA=st.executeUpdate(sql);
          System.out.println(rA+" rows affected");
          /*
          *Here we inserting data inside teach_sub table 
          *which contain subjects of teachers
          */
          //String str[]=new String[sublist.size()];
          Object str[]=sublist.toArray();
          String insertSub[]=new String[str.length];
          for(int i=0;i<str.length;i++){
          sql="select sub_id from subject where sub_name='"+str[i].toString()+"'";
          ResultSet res=st.executeQuery(sql);
          res.next();
          insertSub[i]=res.getString("sub_id");
          System.out.println(str[i] +" sub_id");
          new StudentSub(P_id,insertSub[i]).insertStudentSub();
          }
           //closing db connection
          st.close();
          con.close();
     }
    /*updateStudentData function takes two argument P_id and dataName what data need to update */
    void updateStudentData(String P_id,String dataName){}
    /* removeTeacher sets leave_Date of the teacher into database so tht this person not any more in the school */
    void removeStudent(String Leave_date){}
}
