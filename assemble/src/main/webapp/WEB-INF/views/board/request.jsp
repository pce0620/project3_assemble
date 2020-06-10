<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request.jsp</title>
</head>
<body>
	<form action="requestOk" method="post">
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
		
		<input type="submit" value="입력" />
	</form>

</body>
</html>