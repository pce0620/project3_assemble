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
  		//게시글수정으로 이동
		$(".btn").click(function(){
			
			var bno = this.parentNode.childNodes[1].value;		

			document.location.href = "selectBoard?bno="+bno;
		});
		
		//게시글 삭제
		$(".delete").click(function(){

			var bno = this.parentNode.childNodes[1].value;
			var groupno = this.parentNode.childNodes[5].value;
			
			document.location.href = "deleteBoard?bno="+bno+"&groupno="+groupno;
		});
		
		
		//댓글달기
		$(".re").click(function(){
			
			console.log(this.parentNode.childNodes);
			
			var bno = this.parentNode.childNodes[1].value;
			var groupno = this.parentNode.childNodes[3].value;
			var categoryno = this.parentNode.childNodes[5].value;
			var memberno = this.parentNode.childNodes[7].value;
			var contents = this.parentNode.childNodes[9].value;
			
			
			document.location.href = "insertComment?bno="+bno+"&groupno="+groupno+"&categoryno="+categoryno+"&contents="+contents+"&memberno="+memberno;
		});
				
	}); 

</script>
</head>
<body>
	<h2>그룹별 글 목록</h2>
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
					<th>댓글달기</th>
					<th>파일이름</th>
				</tr>
				<tr>
					<td>
						${i.bno }
						<input type="hidden" class="bno" name="bno" value="${i.bno }"/>
						<input type="button" class="btn" value="전송"/>
						<input type="hidden" class="groupno" name="groupno" value="${i.groupno }"/>
						<input type="button" class="delete"value="삭제" />
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
					<td>
						<input type="hidden" class="bno" name="bno" value="${i.bno }"/>
						<input type="hidden" class="groupno" name="groupno" value="${i.groupno }"/>
						<input type="hidden" class="categoryno" name="categoryno" value="${i.categoryno }"/>
						<input type="hidden" class="memberno" name="memberno" value="${i.memberno }"/>
						<input type="text" name="recomment" id="recomment" />
						<input type="button" class="re" value="댓글달기" />
					</td>
					<td>${fileName }</td>
				</tr>

			</table>

	</c:forEach>

</body>
</html>