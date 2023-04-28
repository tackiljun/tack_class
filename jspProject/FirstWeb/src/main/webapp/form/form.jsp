<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

  <h1>Form Test</h1>
  <form action="/<%= request.getContextPath() %>/form/input.jsp" method="post">
  내용입력<br>
  <textarea name="content" rows="5" cols="20">안녕하세요!</textarea>
  
  <br>
  성별 <input type="radio" name="gender" value="male" >남성
      <input type="radio" name="gender" value="female" checked>여성
      
  <br>
  관심사 : <input type="checkbox" name="lang" value="그냥짱구" checked> 그냥짱구
         <input type="checkbox" name="lang" value="액션짱구"> 액션짱구
         <input type="checkbox" name="lang" value="초코비짱구"> 초코비짱구
         <input type="checkbox" name="lang" value="건담짱구"> 건담짱구
         <input type="checkbox" name="lang" value="이슬이누나"> 이슬이누나
  
  <br>
  태어난 년도 :
  <select name="birthyear">
     <option value="2002">2002</option>
     <option>2001</option>
     <option>2000</option>
     <option>1999</option>
     <option>1998</option>
  </select>
  
  <br>
  나이 : 
  <input type="number" name="age">
  
  <br>
  생일 :
  <input type="date" name="birth">
  
  
  <br><br>
  <input type="submit">
  </form>



</body>
</html>