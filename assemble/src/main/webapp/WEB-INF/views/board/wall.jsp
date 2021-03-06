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
			var memberno = this.parentNode.childNodes[5].value;
			var contents = this.parentNode.childNodes[7].value;
			
			
			document.location.href = "insertComment?bno="+bno+"&groupno="+groupno+"&categoryno="+categoryno+"&contents="+contents+"&memberno="+memberno;
		});
		
		//요청 버튼
		$(".status_0").click(function(){
			var status = 0;
			var bno = this.parentNode.childNodes[1].value;
			var groupno = this.parentNode.childNodes[3].value;

			document.location.href = "updateStatus?status="+status+"&bno="+bno+"&groupno="+groupno;

		});
		
		$(".status_1").click(function(){
			var status = 1;
			var bno = this.parentNode.childNodes[1].value;
			var groupno = this.parentNode.childNodes[3].value;

			document.location.href = "updateStatus?status="+status+"&bno="+bno+"&groupno="+groupno;
		});
		
		$(".status_2").click(function(){
			var status = 2;
			var bno = this.parentNode.childNodes[1].value;
			var groupno = this.parentNode.childNodes[3].value;

			document.location.href = "updateStatus?status="+status+"&bno="+bno+"&groupno="+groupno;
		});
		
		
		//파일 다운로드처리
		 $(".fileName").click(function(){
			console.log(this.parentNode.childNodes);
			var filename = this.parentNode.childNodes[1].value;
			var url = "download?fileName=" + encodeURIComponent(filename); 
			
			document.location.href = url;
			
		});
		
		
		//북마크
		$(".mark").click(function(){
			var bno = this.parentNode.childNodes[1].value;
			var groupno = this.parentNode.childNodes[3].value;
			var memberno = this.parentNode.childNodes[5].value;
			
			document.location.href = "bookMark?bno="+bno+"&groupno="+groupno+"&memberno="+memberno;
			
		});
		
		//공지
		$(".notice").click(function(){
			var bno = this.parentNode.childNodes[1].value;
			var groupno = this.parentNode.childNodes[3].value;
			
			document.location.href = "notice?bno="+bno+"&groupno="+groupno;
			
		});

	});
		
</script>
</head>
<body>
	<h2>그룹별 글 목록</h2>
	<c:forEach var="i" items="${list }">
			<table>
				<tr>
					<th>멤버번호</th>
					<th>멤버이름</th>
					<th>멤버아이디</th>
					<th>게시글번호</th>
					<th>공지사항여부</th>
					<th>게시일</th>
					<th>게시글</th>
					<th>좋아요</th>
					<th>싫어요</th>
					<th>요청여부</th>
					<th>파일이름</th>
					<th>댓글달기</th>
					<th>요청 status</th>
					<th>요청 상태 변경</th>
					<th>북마크</th>
					<th>공지등록</th>
			</tr>
				<tr>
					<td>${i.memberno }</td>
					<td>${i.mi_memname }</td>
					<td>${i.mi_memid }</td>
					<td>
						${i.bno }
						<input type="hidden" class="bno" name="bno" value="${i.bno }"/>
						<input type="button" class="btn" value="수정"/>
						<input type="hidden" class="groupno" name="groupno" value="${i.groupno }"/>
						<input type="button" class="delete"value="삭제" />
					</td>
					<td>${i.boardnotice }</td>
					<td>${i.boarddate }</td>
					<td>${i.boardcontents }</td>
					<td>${i.boardlike }</td>
					<td>${i.boardhate }</td>
					<td>${i.requestboolean }</td>
					<td>
						<input type="button" value="${i.fileName }" class="fileName">
					</td>
					<td>
						<input type="hidden" class="bno" name="bno" value="${i.bno }"/>
						<input type="hidden" class="groupno" name="groupno" value="${i.groupno }"/>
						<input type="hidden" class="memberno" name="memberno" value="${i.memberno }"/>
						<input type="text" name="recomment" id="recomment" />
						<input type="button" class="re" value="댓글달기" />
					</td>
					<td>${i.reqstatus }</td>
					<td>
						<input type="hidden" class="bno" name="bno" value="${i.bno }"/>
						<input type="hidden" class="groupno" name="groupno" value="${i.groupno }"/>
						<input type="button" class="status_0" value="요청" />
						<input type="button" class="status_1" value="진행중" />
						<input type="button" class="status_2" value="완료" />
					</td>
					<td>
						<input type="hidden" class="bno" name="bno" value="${i.bno }"/>
						<input type="hidden" class="groupno" name="groupno" value="${i.groupno }"/>
						<input type="hidden" class="memberno" name="memberno" value="${i.memberno }"/>
						<input type="button" class="mark" value="북마크" />
					</td>
					<td>
						<input type="hidden" class="bno" name="bno" value="${i.bno }"/>
						<input type="hidden" class="groupno" name="groupno" value="${i.groupno }"/>
						<input type="button" value="공지" class="notice"/>
					</td>
				</tr>

			</table>
	</c:forEach>

</body>
</html>