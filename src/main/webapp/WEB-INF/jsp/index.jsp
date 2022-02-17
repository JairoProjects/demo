<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fo" uri="http://www.springframework.org/tags/form" %>

<html>
  <head>

  </head>
  <body>
<fo:form action="hello" method="get" modelAttribute="student">
    <fo:input type="text" name="edad" path="edad"  />
    <input type="submit" value="enviar"/>     
</fo:form>
<!-- 
    <form action="/hello" method="get" >
      <input name="edad">
      <input type="submit" value="enviar">
    </form> 
 -->
  </body>
