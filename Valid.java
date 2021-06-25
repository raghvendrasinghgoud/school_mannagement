package school_mannagement;
//package swing.learn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;

/**
 *
 * @author ragha
 */
class Valid {
    boolean isEmptyString(String s){
        s=s.toLowerCase();
        if(s.length()==0)
            return true;
        else{
           char arr[]= s.toCharArray();
            for(int i=0;i<s.length();i++){
                char ch=arr[i];
                 if (!(ch >= 'a' && ch <= 'z')) {
                        return true;
         }
            }
        }
        return false;
    }
    
    //code for valid mobno
    boolean mobValid(String s)
{
   
    Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");
    Matcher m = p.matcher(s);
    return (m.find() && m.group().equals(s));
}
    /*
    getValues function sets values in the String val[]  
    */
   static void getValues(String val[],int start,int end){
        int i=0;    
        while(start<=end){
                String s=Integer.toString(start);
                val[i]=s;
                start=Integer.parseInt(s);
                start++;
                i++;
            }
    }
    void showValues(String day[],JComboBox dayBox,int end){
        for(int i=0;i<end;i++){
            dayBox.addItem(day[i]);
        }
    }
        void setYear(String year[],JComboBox dayBox,JComboBox monthBox,int start,int currYear){
            int i=0;
            if(monthBox.getSelectedIndex()==2 && dayBox.getSelectedIndex()==28){
                int currYearLastDigit=currYear%10;
                start=start+currYearLastDigit;
                       while(start<=currYear){
                String s=Integer.toString(start);
                year[i]=s;
                start=Integer.parseInt(s);
                start+=4;
                i++;
            }
             
    }else{
                while(start<=currYear){
                String s=Integer.toString(start);
                year[i]=s;
                start=Integer.parseInt(s);
                start++;
                i++;
            }
            }
    }
        void showYearValues(String year[],JComboBox yearBox,int currYear){
            for(int i=0;i<=currYear;i++){
            yearBox.addItem(year[i]);
        }
        }
    

    //Driver Code
    /*
 public static void main(String args[]){
     String str[]=new String[31];   
     getValues(str,1,28);
     for(String i:str){
         System.out.println(i);
     } 
 }*/
}
