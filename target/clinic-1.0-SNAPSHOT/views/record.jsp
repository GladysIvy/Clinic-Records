<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ezzy
  Date: 5/7/15
  Time: 9:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<c:if test="${not empty error}">
  <div class="error">${error}</div>
</c:if>
<c:if test="${not empty msg}">
  <div class="msg">${msg}</div>
</c:if>

<form action="<c:url value='/create' />" method='POST'>

  <input type="text" placeholder="first name" name="fname" >
  <input type="text" placeholder="last name" name="lname" >
  <input type="date" placeholder="date of birth" name="dob" >
  <input type="datetime-local" placeholder="time stamp" name="timestamp" >

  <button> Create</button>

</form>

</body>
</html>
