<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<!DOCTYPE html>
<html>
	<head>
		<tiles:insertAttribute name="head"/>
	</head>
	<body>
		<!-- header -->
		<tiles:insertAttribute name="header"/>
		
		<!-- nav -->
		<tiles:insertAttribute name="nav"/>
		
		<!-- main -->
		<tiles:insertAttribute name="main"/>
		
		<!-- footer -->
		<tiles:insertAttribute name="footer"/>
	</body>
</html>