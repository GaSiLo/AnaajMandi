<%--
    Document   : FrontPage
    Created on : 6 Feb, 2019, 6:34:06 PM
    Author     : Gajendra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Anaj Mandi</title>
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
                        <th><a href="FrontPage.jsp" style="color: #ff3366">ABOUT US</a></th>
                        <th><a href="FrontPage.jsp" style="color: #ff3366">CONTACT US</a></th>
                    </tr>
                </thead>
            </table>

        </div>
        <div>
            <img class="mySlides" src="slide-1.jpg"  >
            
          <img class="mySlides" src="slide-2.jpg" >
            <img class="mySlides" src="slide-3.jpg" >
          <img class="mySlides" src="slide-4.jpg" >

          <script>
              var myIndex=0;
              carousel();
              function carousel(){
              var i;
              var x =document.getElementsByClassName("mySlides");
              for(i=0;i<x.length;i++){
                  x[i].style.display="none";
              }
              myIndex++;
              if(myIndex>x.length){
                  myIndex = 1;
              }
              x[myIndex-1].style.display="block";
          setTimeout(carousel,2000);
              }
 //form validation
 
 
function isFilled(str) {
if (str.length === 0) {
return false;
}
for (var i = 0; i < str.length; i++) {
var ch = str.charAt(i);
if (ch !== ' ')
{
return true;
}
}
return false;
}

function isPassword(str) {
if (isFilled(str)) {
return str.length >= 3;
} else {
return false;
}
}

function validate() {
var unm = document.getElementById("userName").value;
var flag1 = isFilled(unm);
var upass = document.getElementById("userPass").value;
var flag2 = isPassword(upass);
var flag = flag1 && flag2;
if (!flag) {
alert("incorrect user name or password");
}
return flag;
}
          </script>
          
        </div>
        
            <div class="log"><br><br><br><h3>ADMIN LOGIN</h3> <br><br><br>
       <form action="validate.jsp" onsubmit="return validate()" method="post" >
<table border="0" align="center">

<tbody>
<tr>
<td>User Name :</td>
<td><input id="userName" type="text" name="userName" value="" /></td>

</tr>

<tr>
<td><br><br>Password :</td>
<td><br><br><input id="userPass" type="password" name="userPass" value="" /></td>
</tr>
<tr>
<td></td>
<td style="text-align:center"><br><br>

<input type="submit" value="Login" /></td>
</tr>
</tbody>
</table> <br>  
<a href="Register.jsp" style="color: white">If&nbsp; Not&nbsp; Register&nbsp; Click &nbsp;Here</a>          
           <br><br><br><br><br><br>
                <p style="color: white"> Copyrighted @ all rights reserved.</p>
         </form>
            </div> </body>
</html>
