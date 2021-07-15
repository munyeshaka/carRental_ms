
package Controller;

import Model.Bean.ReservationBean;
import Model.Dao.ReservationDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReservationServlet extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        if(request.getParameter("customerSignupf")!=null){
            //Copying all the input parameters in to local variables
            String firstname = request.getParameter("firstnamef"); //firstnamef: from name in form 
            String customer = ReservationBe.getFirstname();
            String category = ReservationBe.getLastname();
            String pick_up_date = ReservationBe.getPhone();
            String return_date = ReservationBe.getFirstname();
            String discount_amount = ReservationBe.getLastname();
            String transaction_amount = ReservationBe.getPhone();

             ReservationBean CustomerB = new ReservationBean();
            //Using Java Beans - An easiest way to play with group of related data
             CustomerB.setFirstname(firstname);
             CustomerB.setLastname(lastname);
             CustomerB.setPhone(phone);

             ReservationDao ReservationD = new ReservationDao();

            //The core Logic of the Registration application is present here. We are going to insert user data in to the database.
             String ReservationValidate = ReservationD.Reservation(ReservationB); //insertCustomer:function of insert in DAO       
             
             if(ReservationValidate.equals(" success")){   //On  success, you can display a message to user on Home page
                
            request.setAttribute("InsertSuccessMsg", ReservationValidate);
            request.getRequestDispatcher("/index.jsp").forward(request, response);
         }
         else   //On Failure, display a meaningful message to the User.
         {
            request.setAttribute("InsertErrorMsg", ReservationValidate);
            request.getRequestDispatcher("/CustomerServvlet.jsp").include(request, response);
         }
     }
}
}
