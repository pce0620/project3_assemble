<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>groupSelect.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		
		$("#member").click(function(){
			var groupno = $("#groupno").val();
			document.location.href = "groupMember?groupno="+groupno;
		});
		
		$("#img").click(function(){
			var groupno = $("#groupno").val();
			document.location.href = "groupImg?groupno="+groupno;
		});
		
		$("#file").click(function(){
			var groupno = $("#groupno").val();
			document.location.href = "groupFile?groupno="+groupno;
		});
		
		$("#req").click(function(){
			var groupno = $("#groupno").val();
			document.location.href = "groupReqList?groupno="+groupno;
		});
		
		
		
	});
</script>
</head>
<body>
	<h2>그룹 번호</h2>
	<input type="text" name="groupno" id="groupno" />
	
	<input type="button" value="멤버" id="member"/>
	<input type="button" value="사진" id="img"/>
	<input type="button" value="파일" id="file"/>
	<input type="button" value="요청" id="req"/>

</body>
</html>