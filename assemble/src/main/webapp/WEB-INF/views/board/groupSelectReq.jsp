<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>groupSelectReq.jsp</title>
</head>
<body>
	<!-- 전체보기이면~ -->
	<c:forEach var="i" items="${list }">
		<h2>${i.boardcontents }</h2>
		<h2>${i.reqstatus }</h2>
	</c:forEach>

</body>
</html>