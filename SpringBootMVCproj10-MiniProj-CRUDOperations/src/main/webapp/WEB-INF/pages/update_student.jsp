<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%> 
<h1 style="color: mediumvioletred; text-align: center;">Update Student</h1> 
<frm:form modelAttribute="std">
    <table align="center" bgcolor="yellow">
        <tr>
            <td>Student Id</td>
            <td><frm:input path="stdId" readonly="true"/></td>
        </tr>
        <tr>
            <td>Student Name</td>
            <td><frm:input path="stdName"/></td>
        </tr>
        <tr>
            <td>Qualification</td>
            <td><frm:input path="qualification"/></td>
        </tr>
        <tr>
            <td>Course</td>
            <td><frm:input path="course"/></td>
        </tr>
        <tr>
            <td>Fee</td>
            <td><frm:input path="fee"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Update Student"></td>
            <td><input type="reset" value="cancel"></td>
        </tr>
    </table>

</frm:form>
