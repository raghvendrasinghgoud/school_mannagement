/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_mannagement;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author ragha
 */
public class Class {
    private String Class_id;
    private String P_id="";
    
    //Database Connection Variables
           private String url="jdbc:mysql://localhost:3306/school_mannagement";
           private String uname="root";
           private String pass="Raghav@123";
           private String sql;
            //End of DB varidables;
    /* constructor recieves data */

    public void setClass_id(String Class_id) {
        this.Class_id = Class_id;
    }

    public void setP_id(String P_id) {
        this.P_id = P_id;
    }
   
    /*insert class_id to the database; */
     void insertClass_name()throws Exception{
         forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
            Statement st=con.createStatement();
            sql="insert into class(class_id)values('"+Class_id+"')";
            int rA=st.executeUpdate(sql);
            System.out.println(rA+"row affected");
            st.close();
            con.close();
     }
     /*
     getEmptyClass return the classes which doesnot have any class teacher
     */
     String[] getEmptyClasses()throws Exception{
         forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
            Statement st=con.createStatement();
            sql="select * from class where p_id is NULL";
            ResultSet res=st.executeQuery(sql);
            int size=0;
            while(res.next())
                size++;
            String empClass[]=new String[size];
            sql="select * from class where p_id is NULL";
            res=st.executeQuery(sql);
            for(int i=0;i<size;i++){
                res.next();
                empClass[i]=res.getString("class_id");
            }
            return empClass;
     }
    /* getclasses is use to retrieve classe from the database */
     Object[][] getClasses()throws Exception{
            forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
            Statement st=con.createStatement();
            sql="select * from class";
            ResultSet res=st.executeQuery(sql);
            int row=0;
            while(res.next())
                row++;
            //int row=res.getRow();
            //System.out.println(row+" rows in table");
            res=st.executeQuery(sql);
            
            Object str[][]=new Object[row][2];
            for(int i=0;i<row;i++){
                res.next();
                for(int j=0;j<2;j++){
                    if(j==0)
                    str[i][j]=res.getString("class_id");
                    else
                        str[i][j]=res.getString("p_id");
                }
            }
            /*
            for(Object i[]:str){
                for(Object j:i)
                    System.out.println(j+" ");
                    System.out.println();
            }
              */  
                st.close();
            con.close();
           return str;
    }
     /* remove class deletes the following class */
     void delClass(String Class_id)throws Exception{
            forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
            Statement st=con.createStatement();
            sql="delete from class where class_id='"+Class_id+"' or p_id='"+P_id+"'";
            int res=st.executeUpdate(sql);
            System.out.println(res);
            st.close();
            con.close();
     }
    /* update class is taken two argument of string type class_id and dataName*/
     void updateClass(String Class_id,String dataName){}
    /*
     Driver Code
     
     public static void main(String args[])throws Exception{
         Class cl=new Class();
         String str[]=cl.getEmptyClasses();
         for(String i:str){
         System.out.println(i);
         }
     }
*/
}
