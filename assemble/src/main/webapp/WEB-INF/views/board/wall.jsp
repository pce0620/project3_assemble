<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>wall.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btn").click(function(){
			
 			var bno = $("#aaa").text();
			console.log(bno);
 			
			/* document.frm.action = "selectbno?bno="+bno;
			document.frm.submit(); */
		});
	});
</script>
</head>
<body>
	<h2>그룹별 글 목록</h2>
	<c:forEach var="i" items="${list }">
		<form name="frm">
			<table>
				<tr>
					<th>
						게시글번호
						<input type="button" id="btn" value="수정"/>
					</th>
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
					<td id="aaa">${i.bno }</td>
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

		</form>
	</c:forEach>

</body>
</html>