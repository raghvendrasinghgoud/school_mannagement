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
import java.util.ArrayList;

/**
 *
 * @author ragha
 */


public class Section {
    private int Sec_name;

    
    //Database Connection Variables
           private String url="jdbc:mysql://localhost:3306/school_mannagement";
           private String uname="root";
           private String pass="Raghav@123";
           private String sql;
            //End of DB varidables;
     
    void insertSection()throws Exception{
        forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
            Statement st=con.createStatement();
            //ArrayList<Character> li=showSection();
            Object ch[][]=showSection();
            System.out.println(ch.length+" is length of obj");
            if(ch.length==0){
                Sec_name=(int)'A';
            sql="insert into section(section_name)values('"+(char)Sec_name+"')";
            int rA=st.executeUpdate(sql);
            System.out.println(rA+"row affected");
            }else{
                Sec_name=(int)ch[ch.length-1][0].toString().charAt(0)+1;
                System.out.println((char)Sec_name+" is char to be inserted");
                sql="insert into section(section_name)values('"+(char)Sec_name+"')";
            int rA=st.executeUpdate(sql);
            System.out.println(rA+"row affected");
            }
            st.close();
            con.close();
     }
     public Object[][] showSection()throws Exception{
         Section sec=new Section();
         forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(sec.url,sec.uname,sec.pass);
            Statement st=con.createStatement();
            sec.sql="select * from section";
            ResultSet res=st.executeQuery(sec.sql); 
            int cou=0;
            while(res.next())
                cou++;
            Object[][] ch=new Object[cou][1];
            //Object[][] ob=new Object[cou][0];
            sec.sql="select * from section";
            res=st.executeQuery(sec.sql);
            
            for(int i=0;i<cou;i++){
                for(int j=0;j<1;j++){
               res.next();
                    //System.out.println((char)res.getByte("section_name"));
                ch[i][j]=(char)res.getByte("section_name");
                }
            }
            return ch;
            
     }
     void deleteSection()throws Exception{
            forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
            Statement st=con.createStatement();
            Object ch[][]=showSection();
            if(ch.length>0 ){
            Sec_name=(int)ch[ch.length-1][0].toString().charAt(0);
            sql="delete from section where section_name='"+(char)Sec_name+"'";
            int res=st.executeUpdate(sql);
            System.out.println(res);
            st.close();
            con.close();
            }else{
                System.out.println("List is Empty");
            }
     }
     /*
     Driver Code
     
     public static void main(String args[]) throws Exception{
            Object ch[][]=showSection();
            for(int i=0;i<ch.length;i++)
                System.out.println(ch[i][0]);
     }
*/
}
