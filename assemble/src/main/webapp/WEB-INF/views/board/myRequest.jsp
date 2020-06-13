<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>myRequest.jsp</title>
</head>
<body>
	<c:forEach var="i" items="${list }">
	<table>
		<tr>
			<th>글번호</th>
			<td>{i.bno}</td>
		</tr>
		<tr>
			<th>요청한사람</th>
			<td>${i.memberno }</td>
		</tr>
		<tr>
			<th>요청상태</th>
			<td>${i.reqstatus }</td>
		</tr>
		<tr>
			<th>요청받는사람</th>
			<td>${i.responseid }</td>
		</tr>
		<tr>
			<th>글내용</th>
			<td>${i.boardcontents }</td>
		</tr>
		<tr>
			<th>작성일</th>
			<td>${i.boarddate }</td>
		</tr>
		<tr>
			<th>좋아요</th>
			<td>${i.boardlike }</td>
		</tr>
		<tr>
			<th>싫어요</th>
			<td>${i.boardhate }</td>
		</tr>
		<tr>
			<th>파일명</th>
			<td>${i.filename }</td>
		</tr>
	</table>
	</c:forEach>

</body>
</html>