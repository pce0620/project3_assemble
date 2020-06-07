<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>modify.jsp</title>
</head>
<body>
	<h2>글쓰기 폼</h2>
	<c:forEach var="i" items="${list }">
	<form action="modify">
		<input type="hidden" name="bno" value="${i.bno }"/>
		<input type="hidden" name="groupno" value="${i.groupno }"/>
		
		<h2>글번호</h2>
		<h2>${i.bno }</h2>
		
		<h2>글내용</h2>
		<input type="text" name="contents" id="contents" value="${i.boardcontents }"/>
		<input type="submit" value="등록" />
	</form>
	</c:forEach>
</body>
</html>