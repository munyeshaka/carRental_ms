package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Reservation_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link href=\"bootstrap-5.0.2-dist/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    <link href=\"bootstrap-5.0.2-dist/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    <script src=\"bootstrap-5.0.2-dist/js/bootstrap.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"bootstrap-5.0.2-dist/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("          <br>\r\n");
      out.write("          <br>\r\n");
      out.write("      <h2>List of customer</h2>            \r\n");
      out.write("      <table class=\"table\">\r\n");
      out.write("        <thead>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <th>Customer</th>\r\n");
      out.write("            <th>Category</th>\r\n");
      out.write("            <th>Pick-up date</th>\r\n");
      out.write("            <th>Return date</th>\r\n");
      out.write("            <th>Discount amount</th>\r\n");
      out.write("            <th>Transaction amount</th>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>Amissa ABAYO</td>\r\n");
      out.write("            <td>SEDAN</td>\r\n");
      out.write("            <td>2021-8-8</td>\r\n");
      out.write("            <td>2021-9-9</td>\r\n");
      out.write("            <td>30000</td>\r\n");
      out.write("            <td>10</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>Amina IRANZI</td>\r\n");
      out.write("            <td>COUPE</td>\r\n");
      out.write("            <td>2021-8-9</td>\r\n");
      out.write("            <td>2021-9-10</td>\r\n");
      out.write("            <td>50000</td>\r\n");
      out.write("            <td>10</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>Pascal ARAKAZA</td>\r\n");
      out.write("            <td>MINIVAN</td>\r\n");
      out.write("            <td>2021-10-9</td>\r\n");
      out.write("            <td>2021-10-11</td>\r\n");
      out.write("            <td>40000</td>\r\n");
      out.write("            <td>10</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </tbody>\r\n");
      out.write("      </table>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
