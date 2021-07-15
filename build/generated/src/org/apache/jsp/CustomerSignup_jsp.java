package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CustomerSignup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link href=\"bootstrap-5.0.2-dist/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link href=\"bootstrap-5.0.2-dist/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <script src=\"bootstrap-5.0.2-dist/js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"bootstrap-5.0.2-dist/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("  </head>\n");
      out.write("<script> \n");
      out.write("function validate()\n");
      out.write("{ \n");
      out.write("     var fullname = document.form.fullname.value;\n");
      out.write("     var email = document.form.email.value;\n");
      out.write("     var username = document.form.username.value; \n");
      out.write("     var password = document.form.password.value;\n");
      out.write("     var conpassword= document.form.conpassword.value;\n");
      out.write("     \n");
      out.write("     if (fullname==null || fullname==\"\")\n");
      out.write("     { \n");
      out.write("     alert(\"Full Name can't be blank\"); \n");
      out.write("     return false; \n");
      out.write("     }\n");
      out.write("     else if (email==null || email==\"\")\n");
      out.write("     { \n");
      out.write("     alert(\"Email can't be blank\"); \n");
      out.write("     return false; \n");
      out.write("     }\n");
      out.write("     else if (username==null || username==\"\")\n");
      out.write("     { \n");
      out.write("     alert(\"Username can't be blank\"); \n");
      out.write("     return false; \n");
      out.write("     }\n");
      out.write("     else if(password.length<6)\n");
      out.write("     { \n");
      out.write("     alert(\"Password must be at least 6 characters long.\"); \n");
      out.write("     return false; \n");
      out.write("     } \n");
      out.write("     else if (password!=conpassword)\n");
      out.write("     { \n");
      out.write("     alert(\"Confirm Password should match with the Password\"); \n");
      out.write("     return false; \n");
      out.write("     } \n");
      out.write(" } \n");
      out.write("</script> \n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("    <h2>CUSTOMER</h2>\n");
      out.write("    \n");
      out.write("    <!-- Button trigger modal -->\n");
      out.write("<button type=\"button\" class=\"btn btn-primary\" data-bs-toggle=\"modal\" data-bs-target=\"#exampleModal\">\n");
      out.write("  Signup\n");
      out.write("</button>\n");
      out.write("\n");
      out.write("<!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Signup </h5>\n");
      out.write("        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("          <form action=\"CustomerSignup\" method=\"post\" onsubmit=\"return validate()\">\n");
      out.write("                <div class=\"form-label\">\n");
      out.write("                    <label for=\"firstname\">First name:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Enter your first name\" name=\"firstnamef\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-label\">\n");
      out.write("                    <label for=\"lastname\">Last name:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Enter your last name\" name=\"lastnamef\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-label\">\n");
      out.write("                    <label for=\"phone\">Phone number:</label>\n");
      out.write("                    <input type=\"number\" class=\"form-control\" placeholder=\"Enter your phone number\" name=\"phonef\">\n");
      out.write("                </div>\n");
      out.write("              <tr>\n");
      out.write("            <center>\n");
      out.write("                <h3 style=\"color:red;\">\n");
      out.write("                ");

                if(request.getAttribute("InsertErrorMsg")!=null){
                    out.println(request.getAttribute("InsertErrorMsg"));
                }
                
      out.write("\n");
      out.write("                </h3>\n");
      out.write("            </center>\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("          <button name=\"customerSignupf\" type=\"submit\" class=\"btn btn-primary\">Signup</button>\n");
      out.write("          <button type=\"reset\" value=\"Reset\" class=\"btn btn-secondary\">Reset</button>\n");
      out.write("        </div>\n");
      out.write("            </form>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
