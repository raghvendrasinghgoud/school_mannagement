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

/**
 *
 * @author ragha
 */
public class TeacherSub {
    private String P_id;
    private String Sub_id;
        
    //Database Connection Variables
           private String url="jdbc:mysql://localhost:3306/school_mannagement";
           private String uname="root";
           private String pass="Raghav@123";
           private String sql;
            //End of JDBC varidables;
           
    public TeacherSub(String P_id, String Sub_id) {
        this.P_id = P_id;
        this.Sub_id = Sub_id;
    }
    
    
    void insertTeachSub()throws Exception{
        forName("com.mysql.cj.jdbc.Driver");
          Connection con=DriverManager.getConnection(url,uname,pass);
          Statement st=con.createStatement();
          sql="insert into teach_sub(p_id,sub_id)"
                  + "       values('"+P_id+"','"+Sub_id+"')";
          int rA=st.executeUpdate(sql);
          System.out.println(rA+" rows affected in teach_sub table");
          st.close();
          con.close();
    }
    void removeTeachSub(String P_id,String Sub_id){}
    
}
