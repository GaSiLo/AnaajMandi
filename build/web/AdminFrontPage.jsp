<%@page import="dto.District"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.DistrictDao"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> District</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
   <script>
function selectDistrict(obj) {
var disId = obj.id;
var disName = obj.name;
document.getElementById("districtId").value = disId;
document.getElementById("districtName").value = disName;
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
                        <th><a href="AdminFrontPage.jsp" style="color: #ff3366">DISTRICT</a></th>
                        <th><a href="Tehsil_master.jsp" style="color: #ff3366">TEHSIL</a></th>
                        <th><a href="Mandi.jsp" style="color: #ff3366">ANAJ MANDI</a></th>
                    </tr>
                </thead>
            </table>

        </div>
        
<div class="rf"><br><br>
    <center><h2>District Management</h2></center>
    <form action="district_add.jsp" onsubmit="" method="post">
<table border="0" align="center">

<tbody>
<tr>
<td class="rightAlign" >District Name :</td>
<td>&nbsp;&nbsp;
<input id="districtId" type="hidden" name="districtId" value="" />
<input id="districtName" type="text" name="districtName" value="" />
</td>
</tr>
<tr>
<td>

</td>
<td style="text-align: center">
    <br><input name="btn" type="submit" value="Update" />
    <input name="btn" type="submit" value="Add" />
</td>
</tr>
</tbody>
</table>
</form>

<center>
<h3>District List</h3>
<table border="0">
<thead>

<tr>
<th>District ID</th>		
<th>&nbsp;District Name</th>
<th>&nbsp;Select</th>
<th>&nbsp;Delete</th>
</tr>
</thead>
<tbody>


<%
DistrictDao districtDao = new DistrictDao();
ArrayList<District> l = districtDao.getDistricts();
for (District d : l) {
%>
<tr align="center">
<td><%=d.getDistrictId()%></td>
<td><%=d.getDistrictName()%></td>
//<td><input id="<%=d.getDistrictId()%>" name="<%=d.getDistrictName()%>" type="button" value="Select" onclick="selectDistrict(this)" /></td>
<td><a href="district_delete.jsp?districtId=<%=d.getDistrictId()%>" style="color:white">Delete</a></td>
</tr>
<% }%>

</tbody>
</table>

</center>

</div>                
   
    </body>
</html>
