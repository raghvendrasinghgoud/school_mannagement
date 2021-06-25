/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_mannagement;

import java.awt.image.BufferedImage;
import java.io.File;
import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author ragha
 */
public class Person {
    protected String P_id;
    protected String Fname;
    protected String Lname;
    protected String gender;
    protected String Birth_date;
    protected String Mob_no;
    protected String Email;
    protected String Image;
    protected LocalDate Join_date;
    protected String Leave_date;
    private BufferedImage bi ;
    //Database Connection Variables
           private String url="jdbc:mysql://localhost:3306/school_mannagement";
           private String uname="root";
           private String pass="Raghav@123";
           private String sql;
            //End of JDBC varidables;
           
    public Person( String who,String Fname, String Lname, String gender, String Birth_date, String Mob_no, String Email, String Image, LocalDate Join_date,BufferedImage bi) {
        this.bi=bi;
        this.Fname = Fname;
        this.Lname = Lname;
        try {
            this.P_id = getID(who,Fname,Lname);
        } catch (Exception ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.gender = gender;
        this.Birth_date = Birth_date;
        this.Mob_no = Mob_no;
        this.Email = Email;
        this.Image = Image;
        this.Join_date = Join_date;
        
    }
    /*insertDataPerson inserts the data into database of school_mannagement */
      String getID(String who,String Fname, String Lname) throws Exception {
          forName("com.mysql.cj.jdbc.Driver");
          Connection con=DriverManager.getConnection(url,uname,pass);
          Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,  
                     ResultSet.CONCUR_UPDATABLE);
          sql="select s_no from person";
          ResultSet res=st.executeQuery(sql);
          int count=1;
          while(res.next())
              count++;
          if(Fname.length()==0&&Lname.length()==0)
              System.out.println("length is null");
          String  id=""+who+count+"0"+Fname.toUpperCase().charAt(0)+Lname.toUpperCase().charAt(0);
          return id;
    }
      
      void InsertPersonData()throws Exception{
          forName("com.mysql.cj.jdbc.Driver");
          Connection con=DriverManager.getConnection(url,uname,pass);
          Statement st=con.createStatement();
          /*
            Setting path of image to store in db
          */
          Image=Image.replace(".", P_id+".");
          System.out.println(Image);
          ImageIO.write(bi, "jpg", new File(Image));
          ImageIO.write(bi, "jpeg", new File(Image));
          ImageIO.write(bi, "png", new File(Image));
          ImageIO.write(bi, "gif", new File(Image));
          ImageIO.write(bi, "bmp", new File(Image));
                Image=Image.replace((char)92,(char)44);
          //end of setting path
          sql="insert into person(p_id,fname,lname,gender,birth_date,mob_no,email,image,join_date)"
                  + "       values('"+P_id+"','"+Fname+"','"+Lname+"','"+gender+"','"+Birth_date+"',"
                  + "               "+Mob_no+",'"+Email+"','"+Image+"','"+Join_date+"')";
          int rA=st.executeUpdate(sql);
          System.out.println(rA+" rows affected in person table");
          st.close();
          con.close();
      }
    
             
}
