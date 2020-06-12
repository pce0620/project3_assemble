<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		 
	 	$("#btn").click(function(){
	 		var data = $("#uploadFile").val(); 		
	 		
	 		if(data==""){
	 			console.log("not file");	 	
	 			document.frm.action = "/requestOk";
	 			document.frm.method = "post";
	 			document.frm.submit();
	 		}else{
	 			console.log("file in");
	 			document.frm.action = "/requestFileOk";
	 			document.frm.method = "post";
	 			document.frm.submit();
	 		} 		
	 		
	 	});
	 
	});

</script>
</head>
<body>
	<form name="frm" enctype="multipart/form-data">
		<h2>카테고리 번호</h2>
		<input type="text" name="cgNum" id="cgNum" />
		
		<h2>그룹 번호</h2>
		<input type="text" name="grNum" id="grNum" />
		
		<h2>멤버번호</h2>
		<input type="text" name="memNum" id="memNum" />
		
		<h2>받는 사람 </h2>
		<input type="text" name="response" id="response" />
		
		<h2>글내용</h2>
		<input type="text" name="contents" id="contents" />
		
		<h2>파일 업로드</h2>
		<input type="hidden" id="fileStatus" name="fileStatus" value="0" />
		<input type="file" id="uploadFile" name="uploadFile"/>
		
		<input type="button" id="btn" value="등록" />
	</form>

</body>
</html>