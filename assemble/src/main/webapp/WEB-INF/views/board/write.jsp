<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>white.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
			
		/* 	$('form[name="frm"]').submit(function(){
				if($("#uploadFile").val()==null){
					console.log("not file");
					document.frm.action = "/writeOk"; 
				}else{
					console.log("file in");
					document.frm.action = "/upload"; 						
				};
			});
	 */
	 
	 	$("#btn").click(function(){
	 		var data = $("#uploadFile").val(); 		
	 		
	 		if(data==""){
	 			console.log("not file");	 	
	 			document.frm.action = "/writeOk";
	 			document.frm.submit();
	 		}else{
	 			console.log("file in");
	 			document.frm.action = "/upload";
	 			document.frm.method = "post";
	 			document.frm.submit();
	 		} 		
	 		
	 	});
	 
	});

</script>
</head> 
<body>

	<h2>글쓰기 폼</h2>
	<form name="frm" enctype="multipart/form-data">
		<h2>카테고리 번호</h2>
		<input type="text" name="cgNum" id="cgNum" />
		
		<h2>그룹 번호</h2>
		<input type="text" name="grNum" id="grNum" />
		
		<h2>멤버번호</h2>
		<input type="text" name="memNum" id="memNum" />
		
		<h2>글내용</h2>
		<input type="text" name="contents" id="contents" />
		
		
		<h2>파일 업로드</h2>
		<input type="hidden" id="fileStatus" name="fileStatus" value="0" />
		<input type="file" id="uploadFile" name="uploadFile" />
		
		<input type="button" id="btn" value="등록" />
	</form>
	
	<div>
	</div>
	
</body>
</html>








