/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_mannagement;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ragha
 */
public class Admin {
    private String Fname;
    private String Lname;
    private String Gender;
    private String Birth_date;
    private String Mob_no;
    private String Email;
    private String ImagePath;
    private String Password;
//Database Connection Variables
           private String url="jdbc:mysql://localhost:3306/school_mannagement";
           private String uname="root";
           private String pass="Raghav@123";
           private String sql;
            //End of JDBC varidables;
    public Admin(String Fname, String Lname, String Gender, String Birth_date, String Mob_no, String Email, String ImagePath, String Password) {
        this.Fname = Fname;
        this.Lname = Lname;
        this.Gender = Gender;
        this.Birth_date = Birth_date;
        this.Mob_no = Mob_no;
        this.Email = Email;
        this.ImagePath = ImagePath;
        this.Password = Password;
    }
    void insertAdmin()throws Exception{
         forName("com.mysql.cj.jdbc.Driver");
          Connection con=DriverManager.getConnection(url,uname,pass);
          Statement st=con.createStatement();
          sql="insert into admin(fname,lname,gender,birth_date,password,email,mob,image)values('"+Fname+"','"+Lname+"','"+Gender+"','"+Birth_date+"','"+Password+"','"+Email+"',"+Mob_no+",'"+ImagePath+"')";
          int rA=st.executeUpdate(sql);
          System.out.println(rA+" rows affected in teacher table");
          
    }
    static String[][] getAdminData()throws Exception{
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
          sql="select fname,lname,email,mob from admin";
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
                      TeachData[i][j]=res.getString("fname");
                  if(j==1)
                      TeachData[i][j]=res.getString("lname");
                  if(j==2)
                      TeachData[i][j]=res.getString("email");
                  if(j==3)
                      TeachData[i][j]=res.getString("mob");
                  
              }
              res.next();
          }
             
          //closing db connection
          st.close();
          con.close();
          
          return TeachData;
     }
    
    /*updateTeacherData function takes two argument P_id and dataName what data need to update */
     static Map<String,String> getAdminData(String Email)throws Exception{
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
          sql="select * from admin";
          ResultSet res=st.executeQuery(sql);
          ResultSetMetaData rsmd=res.getMetaData();
          res.next();
          Map<String,String> TeachData=new HashMap<>();
             for(int i=1;i<=8;i++){
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
     
     
    static void updateAdminData(String TableName,String Email,String ColName,String upValue)throws Exception{
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
          System.out.println("TablemName= "+TableName+" ,Email="+Email+" ,ColName="+ColName+" ,upValue="+upValue);
          sql="update "+TableName+" set "+ColName+"='"+upValue+"' where email='"+Email+"';";
          int rA=st.executeUpdate(sql);
          System.out.println(rA+" rows affected");
           //closing db connection
          st.close();
          con.close();
     }
    
   static boolean adminLogin(String Email,String Password)throws Exception{
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
          sql="select password from admin where email='"+Email+"'";
          ResultSet res=st.executeQuery(sql);
          res.next();
          System.out.println(Email+"\n"+res.getString("password")+" is stored password");
          if(Password.equals(res.getString("password"))){
              
              return true;
          }
          else{
              System.out.println(res.getString("password")+" is stored password");
              return false;
              
          }
   }
          static void removeAdmin(String Email)throws Exception{
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
          sql="delete from admin where email='"+Email+"'";
          int  rA=st.executeUpdate(sql);
          System.out.println(rA+" row affected");
          }
    }


