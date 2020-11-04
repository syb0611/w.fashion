<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<!DOCTYPE html>
<html>
	<head>
		<tiles:insertAttribute name="head_admin"/>
	</head>
	<body>		
		<div id="main-wrapper">
			<!-- aside -->
			<tiles:insertAttribute name="aside"/>
			
			<!-- main -->
			<tiles:insertAttribute name="main"/>
		</div>
	</body>
</html>