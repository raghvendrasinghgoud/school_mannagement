/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_mannagement;

import java.awt.Image;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ragha
 */
public class Validations {

    //Code for validate only alphabets contain string;
    public boolean Name(String s) {
        if (s.length() == 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!((int) ch == (int) ' ' || (int) ch >= (int) 'A' && (int) ch <= (int) 'Z' || (int) ch >= (int) 'a' && (int) ch < (int) 'z')) {
                return false;
            }
        }
        return true;
    }
    //Code for validate class
    public boolean Vclass(String cl){
        if (cl.length() == 0) {
            return false;
        }
        for (int i = 0; i < cl.length(); i++) {
            char ch = cl.charAt(i);
            if (!( ch >= '0' ||(int) ch >= (int) 'A' && (int) ch <= (int) 'Z' || (int) ch >= (int) 'a' && (int) ch < (int) 'z')) {
                return false;
            }
        }
        return true;
    }
    //code for valid mobno
    boolean mobValid(String s)
{
   
    Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");
    Matcher m = p.matcher(s);
    return (m.find() && m.group().equals(s));
}
    //code for valid Email
    public static boolean emailValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
                              
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
    //code for valid qualification
    public boolean qualValid(String s) {
        if (s.length() == 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!((int) ch == (int) '.' || (int) ch >= (int) 'A' && (int) ch <= (int) 'Z' || (int) ch >= (int) 'a' && (int) ch < (int) 'z')) {
                return false;
            }
        }
        return true;
    }
    
    
/*          Driver Code
    
    public static void main(String args[]) {
        System.out.println(Vclass("12l"));
    }
*/
}
