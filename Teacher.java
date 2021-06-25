/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_mannagement;
import java.sql.ResultSetMetaData;
//import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.image.BufferedImage;
import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author ragha
 */
public class Teacher extends Person {
    private String P_id;
    private String Qualification;
    private String class_id;
    private Object SelectedSub[];
    //Database Connection Variables
           private String url="jdbc:mysql://localhost:3306/school_mannagement";
           private String uname="root";
           private String pass="Raghav@123";
           private String sql;
            //End of JDBC varidables;
           
    /*contructor of class teacher who reciesves the values of varidables*/
          

    public Teacher(String who,String Qualification, String class_id, Object[] SelectedSub, String Fname, String Lname, String gender, String Birth_date, String Mob_no, String Email, String Image, LocalDate Join_date,BufferedImage bi) {
        super(who,Fname, Lname, gender, Birth_date, Mob_no, Email, Image, Join_date,bi);
        try {
            this.P_id = super.getID(who,Fname, Lname);
        } catch (Exception ex) {
            Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
        }
;
        this.Qualification = Qualification;
        this.class_id = class_id;
        this.SelectedSub = SelectedSub;
    }

    
    
     void insertTeacherData()throws Exception{
         super.InsertPersonData();
         forName("com.mysql.cj.jdbc.Driver");
          Connection con=DriverManager.getConnection(url,uname,pass);
          Statement st=con.createStatement();
          sql="insert into teacher(p_id,qualification,class_id)"
                  + "       values('"+P_id+"','"+Qualification+"','"+class_id+"')";
          int rA=st.executeUpdate(sql);
          System.out.println(rA+" rows affected in teacher table");
         /*
          Here we insert the class teacher id inside the class table
          */
          sql="update class set p_id='"+P_id+"' where class_id='"+class_id+"';";
            rA=st.executeUpdate(sql);
          System.out.println(rA+" row affected");
          
          /*
          *Here we inserting data inside teach_sub table 
          *which contain subjects of teachers
          */
          
          String str[]=new String[SelectedSub.length];
          for(int i=0;i<SelectedSub.length;i++){
          sql="select sub_id from subject where sub_name='"+SelectedSub[i].toString()+"'";
          ResultSet res=st.executeQuery(sql);
          res.next();
          str[i]=res.getString("sub_id");
          System.out.println(str[i] +" sub_id");
          new TeacherSub(P_id,str[i]).insertTeachSub();
          }
          
          st.close();
          con.close();
     }
    /*getPersonData retrie data from the data */
     static String[][] getTeachersData()throws Exception{
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
          sql="select p_id,fname,class_id,qualification from (select person.p_id,"
                  + "person.fname,teacher.class_id,teacher.qualification from "
                  + "person left join teacher on person.p_id=teacher.p_id) as t "
                  + "where p_id like 'T00%'";
          ResultSet res=st.executeQuery(sql);
          res.last();
          int size=res.getRow();
          res.first();
          System.out.println(size+" is no. of ros in table;");
          System.out.println(res.getRow()+" is no. of ros in table;");
          String TeachData[][]=new String[size][4];
          for(int i=0;i<size;i++){
              
              for(int j=0;j<4;j++){
                  if(j==0)
                      TeachData[i][j]=res.getString("p_id");
                  if(j==1)
                      TeachData[i][j]=res.getString("fname");
                  if(j==2)
                      TeachData[i][j]=res.getString("class_id");
                  if(j==3)
                      TeachData[i][j]=res.getString("qualification");
              }
              res.next();
          }
             
          //closing db connection
          st.close();
          con.close();
          
          return TeachData;
     }
    /*updateTeacherData function takes two argument P_id and dataName what data need to update */
     static Map<String,String> getTeacherData(String P_id)throws Exception{
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
"person.leave_date,teacher.qualification,teacher.class_id \n" +
" from person,teacher where person.p_id='"+P_id+"' and teacher.p_id='"+P_id+"'";
          ResultSet res=st.executeQuery(sql);
          ResultSetMetaData rsmd=res.getMetaData();
          res.next();
          Map<String,String> TeachData=new HashMap<>();
             for(int i=1;i<=12;i++){
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
    static String[] showTeachSubjects(String P_id)throws Exception{
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
          sql="select * from subject where sub_id in (select sub_id from teach_sub where p_id='"+P_id+"')";
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
     static void updateTeacherData(String TableName,String P_id,String ColName,String upValue)throws Exception{
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
          sql="update "+TableName+" set "+ColName+"='"+upValue+"' where p_id='"+P_id+"';";
          int rA=st.executeUpdate(sql);
          System.out.println(rA+" rows affected");
           //closing db connection
          st.close();
          con.close();
     }
     static void updateTeachSub(List<String> sublist,String P_id)throws Exception{
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
          sql="delete from teach_sub where p_id='"+P_id+"'";
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
          new TeacherSub(P_id,insertSub[i]).insertTeachSub();
          }
           //closing db connection
          st.close();
          con.close();
     }
    /* removeTeacher sets leave_Date of the teacher into database so tht this person not any more in the school */
     static void removeTeacher(LocalDate Leave_date,String P_id)throws Exception{
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
          sql="update person set leave_date='"+Leave_date+"' where p_id='"+P_id+"'";
          int rA=st.executeUpdate(sql);
          System.out.println(rA+" rows affected");
          //closing db connection
          st.close();
          con.close();
     }
     
     /*
     Driver code
     */
     public static void main(String[] args)throws Exception{
        String TeachData[]=Teacher.showTeachSubjects("T00130SS");
     }

}
