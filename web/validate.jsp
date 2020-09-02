<%@page import="dao.UserDao"%>
<jsp:useBean id="user" class="dto.User" scope="session"></jsp:useBean>
<jsp:setProperty name="user" property="*"></jsp:setProperty>	
<%
	UserDao userDao = new UserDao();
	boolean b = userDao.login(user);
	if(b){
		response.sendRedirect("AdminFrontPage.jsp");
	}else{
		response.sendRedirect("FrontPage.jsp");
	}
	%>