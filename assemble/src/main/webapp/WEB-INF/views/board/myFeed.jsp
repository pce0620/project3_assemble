<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>myFeed.jsp</title>
</head>
<body>
	<h2>내가 속한 그룹의 게시글 전체 출력</h2>
	<c:forEach var="i" items="${list }">
		<table>
			<tr>
				<th>게시글번호</th>
				<th>그룹번호</th>
				<th>카테고리번호</th>
				<th>멤버번호</th>
				<th>게시일</th>
				<th>게시글</th>
				<th>좋아요</th>
				<th>싫어요</th>
				<th>공지여부</th>
				<th>요청여부</th>
			</tr>
			<tr>
				<td>${i.bno } 
					<input type="hidden" class="bno" name="bno" value="${i.bno }" />
					<input type="button" class="btn" value="전송" />
				</td>
				<td>${i.groupno }</td>
				<td>${i.categoryno }</td>
				<td>${i.memberno }</td>
				<td>${i.boarddate }</td>
				<td>${i.boardcontents }</td>
				<td>${i.boardlike }</td>
				<td>${i.boardhate }</td>
				<td>${i.boardnotice }</td>
				<td>${i.requestboolean }</td>
			</tr>
		</table>

	</c:forEach>



</body>
</html>