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
          <form action="/action_page.php">
                <div class="form-label">
                    <label for="firstname">First name:</label>
                    <input type="text" class="form-control" placeholder="Enter your first name" id="email">
                </div>
                <div class="form-label">
                    <label for="lastname">Last name:</label>
                    <input type="text" class="form-control" placeholder="Enter your last name" id="pwd">
                </div>
                <div class="form-label">
                    <label for="phone">Phone number:</label>
                    <input type="number" class="form-control" placeholder="Enter your phone number" id="pwd">
                </div>
            </form>
      </div>
      <div class="modal-footer">
          <button type="submit" class="btn btn-primary">Signup</button>
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>


  </body>
</html>
