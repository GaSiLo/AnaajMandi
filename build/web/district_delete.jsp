<%@page import="dao.DistrictDao"%>
<%
String param = request.getParameter("districtId");
int districtId = Integer.parseInt(param);
DistrictDao districtDao = new DistrictDao();
int i = districtDao.deleteDistrict(districtId);
response.sendRedirect("AdminFrontPage.jsp");
%>