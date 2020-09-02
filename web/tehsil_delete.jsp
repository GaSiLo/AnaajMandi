<%@page import="dao.TehsilDao"%>
<%
	String param = request.getParameter("tehsilId");
	int tehsilId = Integer.parseInt(param);
	TehsilDao tehsilDao = new TehsilDao();
	int i = tehsilDao.deleteTehsil(tehsilId);
	response.sendRedirect("Tehsil_master.jsp");
%>