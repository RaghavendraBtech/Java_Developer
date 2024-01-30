<%@ page isELIgnored="false" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:choose>
    <c:when test="${!empty stdListInfo}">
        <table border="1" style="background-color: aqua; text-align: center">
            <tr><th>stdId</th><th>stdName</th><th>course</th><th>fee</th></tr>
            <c:forEach var="std" items="${stdListInfo}">
                <tr>
                    <td>${std.stdId}</td>
                    <td>${std.stdName}</td>
                    <td>${std.course}</td>
                    <td>${std.fee}</td>
                </tr>
            </c:forEach>
        </table>
    </c:when>
    <c:otherwise>
        <h1 style="color: darkblue;"> Student not found</h1>
    </c:otherwise>

</c:choose>
