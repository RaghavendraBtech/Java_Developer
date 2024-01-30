<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:choose>
    <c:when test="${!empty stdList}">
<h1 style="color: magenta;text-align: center;">Student Report</h1>
<table border="1" align="center" bgcolor="cyan">
    <tr style="color: brown;"><th>Student Id</th><th>Student Name</th><th>Qualification</th><th>Course</th><th>Fee</th><th>Operations</th>
    </tr>
    <c:forEach var="std" items="${stdList}">
        <tr>
        <td>${std.stdId}</td>
        <td>${std.stdName}</td>
        <td>${std.qualification}</td>
        <td>${std.course}</td>
        <td>${std.fee}</td>
        <td><a href="std_edit?stdId=${std.stdId}">Edit</a>
        <a href="std_delete?stdId=${std.stdId}" onclick="return confirm('Do u want to delete the Student')">Delete</a></td>
    </tr>
    </c:forEach>
</table>
</c:when>
<c:otherwise>
    <h1 style="color: darkred;text-align: center;">Student Not Found</h1>
</c:otherwise>
</c:choose> 
    <h2 style="color: black;text-align: center;">${resultMsg}</h2>
<center>
    <a href="std_add"><img src="images/add.png" width="40px" height="50px">Add Student</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="./home"><img src="images/home.png" width="40px" height="50px">Home Page</a>
</center>