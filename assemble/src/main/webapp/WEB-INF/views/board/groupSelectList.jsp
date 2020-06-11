<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib  prefix="spring" uri="http://www.springframework.org/tags" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>groupSelectList.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		
		$("#statusAll").click(function(){
			var groupno = $("#groupno").val();
			document.location.href = "groupReqList?groupno="+groupno;
		});

		$("#status0").click(function(){
			var groupno = $("#groupno").val();
			var status = 0;
			document.location.href = "groupReqStatus?groupno="+groupno+"&status="+status;
		});
		
		$("#status1").click(function(){
			var groupno = $("#groupno").val();
			var status = 1;
			document.location.href = "groupReqStatus?groupno="+groupno+"&status="+status;
		});
		
		$("#status2").click(function(){
			var groupno = $("#groupno").val();
			var status = 2;
			document.location.href = "groupReqStatus?groupno="+groupno+"&status="+status;
		});
		
		
	});
</script>
</head>
<body>
	<!-- 멤버띄우기 됨!!! -->
	<%-- <c:forEach var="i" items="${list }">
		<h2>${i.mi_memid }</h2>
		<h2>${i.mi_memname }</h2>
	</c:forEach> --%>
	
	<!-- 이미지띄우기 됨!!! spring태그 써주어야함!! -->
	<%-- <c:forEach var="i" items="${list }">
		<h2>${i.filepath }${i.filename }</h2>
		<h2><c:out value="/uploadFiles/${i.filename }"/></h2>
		<h2><spring:url value="/resources/uploadFiles/${i.filename }"/></h2>
		
		<img src="<spring:url value='/resources/uploadFiles/${i.filename }'/>" alt="" />
	</c:forEach> --%>
	
	<!-- 파일 이름띄우기 됨!! -->
	<%-- <c:forEach var="i" items="${list }">
		<h2>${i.filename }</h2>
		<h2>${i.filepath }</h2>
	</c:forEach> --%>
	
	<input type="hidden" id="groupno" value="${groupno }"/>
	<input type="button" value="전체" id="statusAll"/>
	<input type="button" value="요청" id="status0"/>
	<input type="button" value="진행" id="status1"/>
	<input type="button" value="완료" id="status2"/>

	<!-- 요청이 있는 모든 목록 띄우기됨!!! (바로 전체 목록 띄우기)-->
	<c:forEach var="i" items="${list }">
		<h2>${i.boardcontents }</h2>
		<h2>${i.reqstatus }</h2>
	</c:forEach>
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>