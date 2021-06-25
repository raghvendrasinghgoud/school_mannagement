/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_mannagement;

import java.awt.List;
import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ragha
 */
public class Subject {
    private String Sub_id;
    private String Sub_name;
    
   //Database Connection Variables
           private String url="jdbc:mysql://localhost:3306/school_mannagement";
           private String uname="root";
           private String pass="Raghav@123";
           private String sql;
            //End of DB varidables;
    void Subject(String Sub_id,String Sub_name){
        this.Sub_id=Sub_id;
        this.Sub_name=Sub_name;
    }
    /*
    getSubId generate id for subject;
    */
    String getSubId(String Name)throws Exception{
        /*
        Sub_id format is :
            Sub_name=English Communication
                 format=  Sub0+eng1+com
                 here Sub0 is declared
                      eng taken from first 3 char of English
                      com taken from firt 3 char of Communication
                      and 0,1,....n is separate no. of words
        */
        Name=Name.toLowerCase();
           String id="sub0";
           int j=0;
           int i=0;
           int k=1;
           while(i<Name.length()){
                if(Name.charAt(i)!=' '){
                    if(j<3){
                        id=id+Name.charAt(i);
                        j++;
                    }
                    }else{
                        j=0;
                        id=id+k++;
                }
                i++;
            }
            return id;
    }
     void insertSubject()throws Exception{
            forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
            Statement st=con.createStatement();
            sql="insert into subject(sub_id,sub_name)values('"+Sub_id+"','"+Sub_name+"')";
            int rA=st.executeUpdate(sql);
            System.out.println(rA+"row affected");
            st.close();
            con.close();
    }
     Object[][] showSubjects()throws Exception{
            forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
            Statement st=con.createStatement();
            sql="select * from subject";
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
                    str[i][j]=res.getString("sub_id");
                    else
                        str[i][j]=res.getString("sub_name");
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
     void deleteSub(String Sub_id)throws Exception{
         forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
            Statement st=con.createStatement();
            sql="delete from subject where sub_name='"+Sub_id+"' or sub_id='"+Sub_id+"'";
            int res=st.executeUpdate(sql);
            System.out.println(res);
            st.close();
            con.close();
     }
    
     
/*
     Driver Code
    
     public static void main(String [] args)throws Exception{
        showSubjects();
    }
*/ 
}
