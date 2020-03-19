package Booking;
import java.sql.*;
import javax.swing.JOptionPane;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jagdish
 */
public class colon {

   static String removeColon(String str){
        int i=str.length();
        StringBuffer s=new StringBuffer();
        for(int a=1;a<i;a++){
            s.append(str.substring(a, a+2));
            s.append(" ");
            a+=4;
        }
        return s.toString();
    }
static String addColon(String str){
        int i=str.length();
        StringBuffer s=new StringBuffer();
        for(int a=0;a<i-1;a+=3){
            s.append("'"+str.substring(a, a+2)+"',");
            }

        String s1=""+s.substring(0, s.length()-1);
        return s1;
    }
public static String aColon(String str){
   String s1="";
    if(str.charAt(0)=='\''){
        s1=(str);
    } else if(str.charAt(0)!='\''){
        s1=addColon(str);
    }
   return s1;
}
public static String rColon(String str){
   String s1="";
    if(str.charAt(0)=='\''){
        s1=removeColon(str);
    } else if(str.charAt(0)!='\''){
        s1=(str);
    }
    return s1;
}
void paymentToTable(double Amt, String Id, String loginID, String mode){
try{
        Class.forName("java.sql.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd","root","sps");
        Statement stmt=con.createStatement();
String queryP="Insert into Payment_Detail(Payment_Name, W_ID, Amount,mode, login_id) values" +
        "('Money Addition','"+Id+"',"+(Amt)+",'"+mode+"','"+loginID+"');";
        stmt.executeUpdate(queryP);

}

catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
System.out.print(e);
}
}
int addToTable(String movie_Name, String hall_Name, String movie_Time, String movie_Date, String seat, double Amt, String Table, String Id, String loginID, String mode, String Event_name){
int bookingNo = 0;
    try{
        Class.forName("java.sql.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd","root","sps");
        Statement stmt=con.createStatement();

    String queryP1="Select Booking_No from Booking_Detail;";
        ResultSet rs=stmt.executeQuery(queryP1);
        rs.last();
      bookingNo=rs.getInt(1)+1;
        String queryP="Insert into Payment_Detail(Payment_Name, W_ID, Amount,mode, login_id) values('"+movie_Name.concat("_Booking No" +
                ":"+(bookingNo))+"','"+Id+"',"+(-Amt)+",'"+mode+"','"+loginID+"');";
        stmt.executeUpdate(queryP);
        String queryB1="Select Payment_No from Payment_Detail;";
        ResultSet rs1=stmt.executeQuery(queryB1);
        rs1.last();
        int pNo=rs1.getInt(1);
        String queryB="Insert into Booking_Detail(M_Name, M_Hall, M_Time, M_Seat, Payment_No, Login_ID, t_name,event) values('"
                +movie_Name+"','"+hall_Name+"','"+movie_Time+"','"+rColon(seat)+"', "+pNo+",'"+loginID+"','"+Table+"','"+Event_name+"');";

        stmt.executeUpdate(queryB);

     
}
catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}
return bookingNo;
}
}