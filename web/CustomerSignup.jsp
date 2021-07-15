<%-- 
    Document   : Customer
    Created on : Jul 14, 2021, 10:51:27 AM
    Author     : aimab
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="bootstrap-5.0.2-dist/css/bootstrap.css" rel="stylesheet" type="text/css"/>
    <link href="bootstrap-5.0.2-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <script src="bootstrap-5.0.2-dist/js/bootstrap.js" type="text/javascript"></script>
    <script src="bootstrap-5.0.2-dist/js/bootstrap.min.js" type="text/javascript"></script>
  </head>
<script> 
function validate()
{ 
     var fullname = document.form.fullname.value;
     var email = document.form.email.value;
     var username = document.form.username.value; 
     var password = document.form.password.value;
     var conpassword= document.form.conpassword.value;
     
     if (fullname==null || fullname=="")
     { 
     alert("Full Name can't be blank"); 
     return false; 
     }
     else if (email==null || email=="")
     { 
     alert("Email can't be blank"); 
     return false; 
     }
     else if (username==null || username=="")
     { 
     alert("Username can't be blank"); 
     return false; 
     }
     else if(password.length<6)
     { 
     alert("Password must be at least 6 characters long."); 
     return false; 
     } 
     else if (password!=conpassword)
     { 
     alert("Confirm Password should match with the Password"); 
     return false; 
     } 
 } 
</script> 

  <body>
    <h2>CUSTOMER</h2>
    
    <!-- Button trigger modal -->
<button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
  Signup
</button>

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
        <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Signup </h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
          <form action="CustomerSignup" method="post" onsubmit="return validate()">
                <div class="form-label">
                    <label for="firstname">First name:</label>
                    <input type="text" class="form-control" placeholder="Enter your first name" name="firstnamef">
                </div>
                <div class="form-label">
                    <label for="lastname">Last name:</label>
                    <input type="text" class="form-control" placeholder="Enter your last name" name="lastnamef">
                </div>
                <div class="form-label">
                    <label for="phone">Phone number:</label>
                    <input type="number" class="form-control" placeholder="Enter your phone number" name="phonef">
                </div>
              <tr>
            <center>
                <h3 style="color:red;">
                <%
                if(request.getAttribute("InsertErrorMsg")!=null){
                    out.println(request.getAttribute("InsertErrorMsg"));
                }
                %>
                </h3>
            </center>
        <div class="modal-footer">
          <button name="customerSignupf" type="submit" class="btn btn-primary">Signup</button>
          <button type="reset" value="Reset" class="btn btn-secondary">Reset</button>
        </div>
            </form>
      </div>
      
    </div>
  </div>
</div>


  </body>
</html>
