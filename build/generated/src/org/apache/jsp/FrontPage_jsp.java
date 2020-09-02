package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FrontPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> Anaj Mandi</title>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <a href=\"FrontPage.jsp\" style=\"color: #ff3366\">   ANAJ MANDI </a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"menu\">\n");
      out.write("            <table border=\"1px\"  cellspacing=\"4\" cellpadding=\"2\" width=\"100%\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th><a href=\"FrontPage.jsp\" style=\"color: #ff3366\">HOME</a></th>\n");
      out.write("                        <th><a href=\"FrontPage.jsp\" style=\"color: #ff3366\">ABOUT US</a></th>\n");
      out.write("                        <th><a href=\"FrontPage.jsp\" style=\"color: #ff3366\">CONTACT US</a></th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <img class=\"mySlides\" src=\"slide-1.jpg\"  >\n");
      out.write("            \n");
      out.write("          <img class=\"mySlides\" src=\"slide-2.jpg\" >\n");
      out.write("            <img class=\"mySlides\" src=\"slide-3.jpg\" >\n");
      out.write("          <img class=\"mySlides\" src=\"slide-4.jpg\" >\n");
      out.write("\n");
      out.write("          <script>\n");
      out.write("              var myIndex=0;\n");
      out.write("              carousel();\n");
      out.write("              function carousel(){\n");
      out.write("              var i;\n");
      out.write("              var x =document.getElementsByClassName(\"mySlides\");\n");
      out.write("              for(i=0;i<x.length;i++){\n");
      out.write("                  x[i].style.display=\"none\";\n");
      out.write("              }\n");
      out.write("              myIndex++;\n");
      out.write("              if(myIndex>x.length){\n");
      out.write("                  myIndex = 1;\n");
      out.write("              }\n");
      out.write("              x[myIndex-1].style.display=\"block\";\n");
      out.write("          setTimeout(carousel,2000);\n");
      out.write("              }\n");
      out.write(" //form validation\n");
      out.write(" \n");
      out.write(" \n");
      out.write("function isFilled(str) {\n");
      out.write("if (str.length === 0) {\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("for (var i = 0; i < str.length; i++) {\n");
      out.write("var ch = str.charAt(i);\n");
      out.write("if (ch !== ' ')\n");
      out.write("{\n");
      out.write("return true;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("function isPassword(str) {\n");
      out.write("if (isFilled(str)) {\n");
      out.write("return str.length >= 3;\n");
      out.write("} else {\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("\n");
      out.write("function validate() {\n");
      out.write("var unm = document.getElementById(\"userName\").value;\n");
      out.write("var flag1 = isFilled(unm);\n");
      out.write("var upass = document.getElementById(\"userPass\").value;\n");
      out.write("var flag2 = isPassword(upass);\n");
      out.write("var flag = flag1 && flag2;\n");
      out.write("if (!flag) {\n");
      out.write("alert(\"incorrect user name or password\");\n");
      out.write("}\n");
      out.write("return flag;\n");
      out.write("}\n");
      out.write("          </script>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("            <div class=\"log\"><br><br><br><h3>ADMIN LOGIN</h3> <br><br><br>\n");
      out.write("       <form action=\"validate.jsp\" onsubmit=\"return validate()\" method=\"post\" >\n");
      out.write("<table border=\"0\" align=\"center\">\n");
      out.write("\n");
      out.write("<tbody>\n");
      out.write("<tr>\n");
      out.write("<td>User Name :</td>\n");
      out.write("<td><input id=\"userName\" type=\"text\" name=\"userName\" value=\"\" /></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td><br><br>Password :</td>\n");
      out.write("<td><br><br><input id=\"userPass\" type=\"password\" name=\"userPass\" value=\"\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td></td>\n");
      out.write("<td style=\"text-align:center\"><br><br>\n");
      out.write("\n");
      out.write("<input type=\"submit\" value=\"Login\" /></td>\n");
      out.write("</tr>\n");
      out.write("</tbody>\n");
      out.write("</table> <br>  \n");
      out.write("<a href=\"Register.jsp\" style=\"color: white\">If&nbsp; Not&nbsp; Register&nbsp; Click &nbsp;Here</a>          \n");
      out.write("           <br><br><br><br><br><br>\n");
      out.write("                <p style=\"color: white\"> Copyrighted @ all rights reserved.</p>\n");
      out.write("         </form>\n");
      out.write("    </body>\n");
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
