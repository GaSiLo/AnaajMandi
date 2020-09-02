<%@page import="dao.TehsilDao"%>
<jsp:useBean id="tehsil" class="dto.Tehsil"></jsp:useBean>
<jsp:setProperty name="tehsil" property="*"></jsp:setProperty>
<%
	 String button = request.getParameter("btn");
		TehsilDao tehsilDao = new TehsilDao();
		int i = 0;
		if(button!=null && button.equals("Add"))
			i = tehsilDao.enterTehsil(tehsil);
		else if(button!=null && button.equals("Update"))
			i = tehsilDao.updateTehsil(tehsil);
		response.sendRedirect("Tehsil_master.jsp");
%>