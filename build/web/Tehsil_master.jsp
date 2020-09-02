<%@page import="dto.District"%>
<%@page import="dao.DistrictDao"%>
<%@page import="dto.Tehsil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.TehsilDao"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> District</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>

		<script>
			function selectTehsil(obj) {
				var disId = obj.id;
				var disName = obj.name;
				document.getElementById("tehsilId").value = disId;
				document.getElementById("tehsilName").value = disName;
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
    <h2><center>Tehsil Management</center></h2>
<form action="tehsil_add.jsp" onsubmit="" method="post">
<table border="0" align="center">

<tbody>
<tr>
<td class="rightAlign" >Tehsil Name :</td>
<td>
<input id="tehsilId" type="hidden" name="tehsilId" value="" />
<input id="tehsilName" type="text" name="tehsilName" value="" />
</td>
</tr>
<tr>
<td>District :</td>
<td>
<select name="districtId" >
<%
        DistrictDao districtDao = new DistrictDao();
        ArrayList<District> districts = districtDao.getDistricts();
        for(District district : districts){
%>
<option value="<%=district.getDistrictId()%>" ><%=district.getDistrictName()%></option>
<% } %>
</select>
</td>
</tr>
<tr>
<td>

</td>
<td style="text-align: right">
<input name="btn" type="submit" value="Update" />
<input name="btn" type="submit" value="Add" />
</td>
</tr>
</tbody>
</table>
</form>


<center>
<h3>Tehsil List</h3>
<table border="0">
<thead>

<tr>
    <th>Tehsil ID</th>		
<th>&nbsp;Tehsil Name</th>
<th>&nbsp;Select</th>
<th>&nbsp;Delete</th>
</tr>
</thead>
<tbody>


<%
TehsilDao tehsilDao = new TehsilDao();
ArrayList<Tehsil> l = tehsilDao.getTehsils();
for (Tehsil d : l) {
%>
<tr align="center">
<td><%=d.getTehsilId()%></td>
<td><%=d.getTehsilName()%></td>
<td><input id="<%=d.getTehsilId()%>" name="<%=d.getTehsilName()%>" type="button" value="Select" onclick="selectTehsil(this)" /></td>
<td><a href="tehsil_delete.jsp?tehsilId=<%=d.getTehsilId()%>" style="color:white">Delete</a></td>
</tr>
<% }%>

</tbody>
</table>

</center>

</div>                
   
    </body>
</html>
