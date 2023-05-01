<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

  <h1>Todo 리스트.</h1>

  <ul>
	<li><a href="${pageContext.request.contextPath}/todo/read?no=1">1. 청소하기 </a> 2023-05-01 DONE </li>
	<li><a href="${pageContext.request.contextPath}/todo/read?no=2">2. 짱구시청 </a> 2023-05-02 DONE </li>
	<li><a href="${pageContext.request.contextPath}/todo/read?no=3">3. 그냥짱구 </a> 2023-05-03 DONE </li>
	<li><a href="${pageContext.request.contextPath}/todo/read?no=4">4. 액션짱구 </a> 2023-05-04 DONE </li>
	<li><a href="${pageContext.request.contextPath}/todo/read?no=5">5. 건담짱구 </a> 2023-05-05 DONE </li>
  </ul>

  <a href="${pageContext.request.contextPath}/todo/register">Todo Register</a>



</body>
</html>