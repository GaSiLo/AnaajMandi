<%@page import="dao.DistrictDao"%>
<jsp:useBean id="district" class="dto.District"></jsp:useBean>
<jsp:setProperty name="district" property="*"></jsp:setProperty>
<%
	 String button = request.getParameter("btn");
		DistrictDao districtDao = new DistrictDao();
		int i = 0;
		if(button!=null && button.equals("Add"))
			i = districtDao.enterDistrict(district);
		else if(button!=null && button.equals("Update"))
			i = districtDao.updateDistrict(district);
		response.sendRedirect("AdminFrontPage.jsp");
%>