<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ezzy
  Date: 5/8/15
  Time: 11:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Patient records</title>
</head>
<body>
<c:if test="${not empty error}">
  <div class="error">${error}</div>
</c:if>
<c:if test="${not empty patients}">
  <div class="msg">${patients}</div>
</c:if>
<table>
    <thead>
    <tr>
        <th>#</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Date of Birth</th>
        <th>Time of Recording</th>
    </tr>
    </thead>
<c:forEach items="${listPatient}" var="lp">
    <tr>
        <td>${lp.patient_id}</td>
        <td>${lp.fname}</td>
        <td>${lp.last_name}</td>
        <td>${lp.dob}</td>
        <td>${lp.timestamp}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>
