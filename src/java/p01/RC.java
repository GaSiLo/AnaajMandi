package p01;

import conn.MyConn;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="register",urlPatterns={"/RC"})
public class RC extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
      
String fname=request.getParameter("firstname");
String lname=request.getParameter("lastname");
String age=request.getParameter("age");
String mobno=request.getParameter("mno");
String username=request.getParameter("uname");
String userpass=request.getParameter("upass");
//validate given input

if(fname.isEmpty()||lname.isEmpty()||age.isEmpty()||mobno.isEmpty()||username.isEmpty()||userpass.isEmpty())
{
    RequestDispatcher rd=request.getRequestDispatcher("Register.jsp");
   out.println("<style=background-color:black>");
   

    out.println("<font color=#ff3366>Please fill all the fields</font>");
    rd.include(request,response);
}else{
    try{
         Connection con = MyConn.getConn() ;
            
            PreparedStatement ps=con.prepareStatement("insert into data(first_name,last_name,age,mobileno,user_name,user_pass)values(?,?,?,?,?,?)");
            ps.setString(1,fname);
            ps.setString(2,lname);
            ps.setInt(3,Integer.parseInt(age));
            ps.setString(4,mobno);
            ps.setString(5,username);
            ps.setString(6,userpass);
            ps.executeUpdate();
            ps.close();
   con.close();
    }catch(ClassNotFoundException|SQLException e){
        e.printStackTrace();
    }
    RequestDispatcher rd=request.getRequestDispatcher("Show.jsp");
    rd.forward(request, response);
}
    }
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
