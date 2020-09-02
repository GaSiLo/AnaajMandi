package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dto.District;
import java.util.ArrayList;
import dao.DistrictDao;

public final class AdminFrontPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> District</title>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("   <script>\n");
      out.write("function selectDistrict(obj) {\n");
      out.write("var disId = obj.id;\n");
      out.write("var disName = obj.name;\n");
      out.write("document.getElementById(\"districtId\").value = disId;\n");
      out.write("document.getElementById(\"districtName\").value = disName;\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <a href=\"FrontPage.jsp\" style=\"color: #ff3366\">   ANAJ MANDI </a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"menu\">\n");
      out.write("            <table border=\"1px\"  cellspacing=\"4\" cellpadding=\"2\" width=\"100%\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th><a href=\"AdminFrontPage.jsp\" style=\"color: #ff3366\">DISTRICT</a></th>\n");
      out.write("                        <th><a href=\"Tehsil_master.jsp\" style=\"color: #ff3366\">TEHSIL</a></th>\n");
      out.write("                        <th><a href=\"Mandi.jsp\" style=\"color: #ff3366\">ANAJ MANDI</a></th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("<div class=\"rf\"><br><br>\n");
      out.write("    <center><h2>District Management</h2></center>\n");
      out.write("    <form action=\"district_add.jsp\" onsubmit=\"\" method=\"post\">\n");
      out.write("<table border=\"0\" align=\"center\">\n");
      out.write("\n");
      out.write("<tbody>\n");
      out.write("<tr>\n");
      out.write("<td class=\"rightAlign\" >District Name :</td>\n");
      out.write("<td>&nbsp;&nbsp;\n");
      out.write("<input id=\"districtId\" type=\"hidden\" name=\"districtId\" value=\"\" />\n");
      out.write("<input id=\"districtName\" type=\"text\" name=\"districtName\" value=\"\" />\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("<td style=\"text-align: center\">\n");
      out.write("    <br><input name=\"btn\" type=\"submit\" value=\"Update\" />\n");
      out.write("    <input name=\"btn\" type=\"submit\" value=\"Add\" />\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<center>\n");
      out.write("<h3>District List</h3>\n");
      out.write("<table border=\"0\">\n");
      out.write("<thead>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<th>District ID</th>\t\t\n");
      out.write("<th>&nbsp;District Name</th>\n");
      out.write("<th>&nbsp;Select</th>\n");
      out.write("<th>&nbsp;Delete</th>\n");
      out.write("</tr>\n");
      out.write("</thead>\n");
      out.write("<tbody>\n");
      out.write("\n");
      out.write("\n");

DistrictDao districtDao = new DistrictDao();
ArrayList<District> l = districtDao.getDistricts();
for (District d : l) {

      out.write("\n");
      out.write("<tr align=\"center\">\n");
      out.write("<td>");
      out.print(d.getDistrictId());
      out.write("</td>\n");
      out.write("<td>");
      out.print(d.getDistrictName());
      out.write("</td>\n");
      out.write("//<td><input id=\"");
      out.print(d.getDistrictId());
      out.write("\" name=\"");
      out.print(d.getDistrictName());
      out.write("\" type=\"button\" value=\"Select\" onclick=\"selectDistrict(this)\" /></td>\n");
      out.write("<td><a href=\"district_delete.jsp?districtId=");
      out.print(d.getDistrictId());
      out.write("\" style=\"color:white\">Delete</a></td>\n");
      out.write("</tr>\n");
 }
      out.write("\n");
      out.write("\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("</div>                \n");
      out.write("   \n");
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
