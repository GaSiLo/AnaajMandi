<%--
    Document   : FrontPage
    Created on : 6 Feb, 2019, 6:34:06 PM
    Author     : Gajendra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Registration Form</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
     
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

        </div><form action="RC" method="post">         
       
<div class="rf"><br><br>
    <h2><center>Registration Form</center></h2><br><br>

    <table align="center" >
                <tr>
                    <td>First Name :</td>
                    <td><input type="text" name="firstname"/> </td>
                </tr>
                <tr>
                    <td>Last Name :</td>
                    <td><input type="text" name="lastname"/> </td>
                </tr>
                <tr>
                    <td>Age :</td>
                    <td><input type="text" name="age"/> </td>
                    
                </tr>
                <tr>
                    <td>Mobile No :</td>
                    <td><input type="text" name="mno"/> </td>
                </tr>
                <tr>
                    <td>Set Username :</td>
                    <td><input type="text" name="uname"/> </td>
                </tr>
                <tr>
                    <td>Set Password :</td>
                    <td><input type="password" name="upass"/> </td>
                </tr>
          </table><br>
              <center>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="submit" value="Register"/></center>         

          <br><br><br><br><br><br>
          
          <center> <p style="color: white"> Copyrighted @ all rights reserved.</p></center>
          
</center>

</div>                
    </form> 
    </body>
</html>