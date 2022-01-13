<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
  <head>

  </head>
  <body>
<form:form action="hello" method="get" modelAttribute="student">
    <form:input type="text" name="edad" path="edad"  />
    <input type="submit" value="enviar"/>     
</form:form>
<!-- 
    <form action="/hello" method="get" >
      <input name="edad">
      <input type="submit" value="enviar">
    </form> 
 -->
  </body>
