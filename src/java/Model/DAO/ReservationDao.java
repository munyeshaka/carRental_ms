
package Model.Dao;

import Model.Bean.CustomerBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 
public class ReservationDao { 
     public String insertCustomer(CustomerBean ReservationBe)
     {
         String customer = ReservationBe.getFirstname();
         String category = ReservationBe.getLastname();
         String pick_up_date = ReservationBe.getPhone();
         String return_date = ReservationBe.getFirstname();
         String discount_amount = ReservationBe.getLastname();
         String transaction_amount = ReservationBe.getPhone();
         
         Connection con = null;
         PreparedStatement pstmt = null;         
         try{
             con = DBconnection.createConnection();
           
             
             pstmt = con.prepareStatement("select * from reservation"); //Making use of prepared statements here to insert bunch of data
             pstmt.setString(1, customer);
             pstmt.setString(2, category);
             pstmt.setString(3, pick_up_date);
             pstmt.setString(4, return_date);
             pstmt.setString(5, discount_amount);
             pstmt.setString(6, transaction_amount);
             
             int i= pstmt.executeUpdate();
             
             if (i!=0)  //Just to ensure data has been inserted into the database
             return "SUCCESS"; 
         }
         catch(SQLException e)
         {
            e.printStackTrace();
         }       
         return "Oops.. Something went wrong there..!";  // On failure, send a message from here.
     }
}
