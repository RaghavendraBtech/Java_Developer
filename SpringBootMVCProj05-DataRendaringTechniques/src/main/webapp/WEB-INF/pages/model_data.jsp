<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if test="${!empty studentInfo}">
    <b>Student Information :: ${studentInfo.stdId},${studentInfo.stdName},${studentInfo.course},${studentInfo.fee}</b>
</c:if>