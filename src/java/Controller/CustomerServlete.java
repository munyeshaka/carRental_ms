
package Controller;

import Model.Bean.CustomerBean;
import Model.DAO.CustomerDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomerServlete extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        if(request.getParameter("customerSignupf")!=null){
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
             String insertValidate = CustomerD.insertCustomer(CustomerB); //insertCustomer:function of insert in DAO       
             
             if(insertValidate.equals("Registation success")){   //On Registation success, you can display a message to user on Home page
                
            request.setAttribute("InsertSuccessMsg", insertValidate);
            request.getRequestDispatcher("/index.jsp").forward(request, response);
         }
         else   //On Failure, display a meaningful message to the User.
         {
            request.setAttribute("InsertErrorMsg", insertValidate);
            request.getRequestDispatcher("/CustomerServvlete.jsp").include(request, response);
         }
     }
}
}