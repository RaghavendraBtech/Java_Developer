<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="frm"  %>  
<h1 style="color: rgb(255, 0, 119);text-align: center;">Student Registration Form</h1>
<frm:form action="register" method="POST" modelAttribute="std">
<table border="0" bgcolor="pink" align="center">
     <tr>
        <td>Student Id</td>
        <td><frm:input path="stdId"></frm:input></td>
     </tr>
     <tr>
        <td>Student Name</td>
        <td><frm:input path="stdName"></frm:input></td>
     </tr>
     <tr>
        <td>Student Branch</td>
        <td><frm:input path="branch"></frm:input></td>
     </tr>
     <tr>
        <td>Student Avg</td>
        <td><frm:input path="avg"></frm:input></td>
     </tr>
     <tr>
        <td>
            <input type="submit" value="register">
        </td>
        <td>
            <input type="reset" value="cancle">
        </td>
     </tr>
</table>

</frm:form>