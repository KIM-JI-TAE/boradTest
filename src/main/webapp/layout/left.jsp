<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="col-sm-3 col-md-2 sidebar">
         <ul class="nav nav-sidebar">
        	<!-- class="active" -->
           <li><a href="${pageContext.request.contextPath}/getUserPageList">멤버 리스트</a></li>
           <li><a href="${pageContext.request.contextPath}/studentList">학생 리스트</a></li>
           <li><a href="${pageContext.request.contextPath}/connection/lotto.jsp">lotto</a></li>
         </ul>
	</div>
        
</body>
</html>