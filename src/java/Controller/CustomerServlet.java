
import Model.CustomerBean;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
 
@WebServlet("/CustomerServlet") //yourServletURL
public class CustomerServlet extends HttpServlet {
 
     public CustomerServlet() {
     }
 
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Copying all the input parameters in to local variables
         String firstname = request.getParameter("firstnamef"); //firstnamef: from name in form 
         String lastname = request.getParameter("lastnamef");
         String phone = request.getParameter("phonef");
         
         CustomerBean CustomerB = new CustomerBean();
        //Using Java Beans - An easiest way to play with group of related data
         CustomerB.setFirstname(firstname);
         CustomerB.setLastname(lastname);
         CustomerB.setPhone(phone);
         
         CustomerDao CustomerD = new CustomerDao();
         
        //The core Logic of the Registration application is present here. We are going to insert user data in to the database.
         String CustomerRegistered = CustomerD.insertCustomer(CustomerB);
         
         if(CustomerRegistered.equals("SUCCESS"))   //On success, you can display a message to user on Home page
         {
            //request.setAttribute("username", CustomerRegistered);
            request.getRequestDispatcher("/Home.jsp").forward(request, response);
         }
         else   //On Failure, display a meaningful message to the User.
         {
            request.setAttribute("errMessage", CustomerRegistered);
            request.getRequestDispatcher("/CustomerSignup.jsp").forward(request, response);
         }
     }
}
