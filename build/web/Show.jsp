<%-- 
    Document   : Show
    Created on : 7 Feb, 2019, 10:20:13 PM
    Author     : Gajendra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <script type="text/javascript">
      function showAlert(){
     alert("Successfully registered");
        }
         </script>

    </head>
    
        <body>
        <div id="header">
            <a href="FrontPage.jsp" style="color: #ff3366">   ANAJ MANDI </a>
        </div>
        <div class="menu">
            <table border="1px"  cellspacing="4" cellpadding="2" width="100%">
                <thead>
                    <tr>
                                   <th><a href="FrontPage.jsp" style="color: #ff3366">HOME</a></th>
                        <th><a href="FrontPage.jsp" style="color: #ff3366">DISTRICT</a></th>
                        <th><a href="FrontPage.jsp" style="color: #ff3366">TEHSIL</a></th>
                        <th><a href="FrontPage.jsp" style="color: #ff3366">ANAJ MANDI</a></th>
                        <th><a href="FrontPage.jsp" style="color: #ff3366">ABOUT US</a></th>
                        <th><a href="FrontPage.jsp" style="color: #ff3366">CONTACT US</a></th>
        
                    </tr>
                </thead>
            </table>

        </div>
<div class="rf"><br><br>
    <h2><center>Details</center></h2><br><br>
    
        <%
String fname=request.getParameter("firstname");
String lname=request.getParameter("lastname");
String age=request.getParameter("age");
String mobno=request.getParameter("mno");
String username=request.getParameter("uname");
String userpass=request.getParameter("upass");
        %>
        <center>
            
            <table border="1">
            <tbody>
                <tr>
                    <td>First name :</td>
                    <td><%=fname%></td>
                </tr>
                <tr>
                    <td>Last Name:</td>
                    <td><%=lname%></td>
                </tr>
                <tr>
                    <td>Age :</td>
                    <td><%=age%></td>
                </tr>
                <tr>
                    <td>Mobile No. :</td>
                    <td><%=mobno%></td>
                </tr>
                <tr>
                    <td>Username :</td>
                    <td><%=username%></td>
                </tr>
                <tr>
                    <td>Userpass :</td>
                    <td><%=userpass%></td>
                </tr>
            </tbody>
            </table><br><br>
            <form action="FrontPage.jsp" method="post">
                    <input type="submit" value="OK" onclick="showAlert()"/>   
                            <br><br><br><br><br><br><br>
                <p style="color: white"> Copyrighted @ all rights reserved.</p>
        
                </form>
        </center>
        </body>
</html>
