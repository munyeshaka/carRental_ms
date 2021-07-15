
package Model.Dao;

import Model.Bean.CustomerBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 
public class CustomerDao { 
     public String insertCustomer(CustomerBean customerBe)
     {
         String firstname = customerBe.getFirstname();
         String lastname = customerBe.getLastname();
         String phone = customerBe.getPhone();
         
         Connection con = null;
         PreparedStatement pstmt = null;         
         try{
             con = DBconnection.createConnection();
             String query = "insert into customer(first_name, last_name, phone_number) values (?,?,?)"; //Insert user details into the table 'USERS'
             pstmt = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
             pstmt.setString(1, firstname);
             pstmt.setString(2, lastname);
             pstmt.setString(3, phone);
             
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
