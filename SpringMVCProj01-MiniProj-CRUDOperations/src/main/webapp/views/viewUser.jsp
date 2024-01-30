<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
    <head></head>
    <body>
        <h1 style="color: deeppink;">User List</h1>
        <table  border="2" width="70%" cellpadding="2">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Password</th>
                <th>Email</th>
                <th>Sex</th>
                <th>Country</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
            <c:forEach var="user" items="${users}">
                <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.password}</td>
                <td>${user.email}</td>
                <td>${user.gender}</td>
                <td>${user.country}</td> 
                 <td><a href="/edit/${user.id}">Edit</a></td>
                <td><a href="/delete/${user.id}">Delete</a></td>
                  
                
            </tr>    
            </c:forEach>
        </table>
        <a href="/reg">Add User</a>
    </body>
</html>