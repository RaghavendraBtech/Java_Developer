<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
    <head>
        <title>SPRING BOOT CRUD APPLICATION</title>
    </head>
    <body>
        <table style="background-color: beige;",border="2px">
            <h1 style="color: blue;">Edit Form</h1>
            <form action="/edituser" method="GET">
                <tr>
                    <td>Id:</td>
                    <td>
                        <input type="hidden" id="id">
                    </td>
                </tr>
                <tr>
                    <td>Name:</td>
                    <td>
                        <input type="text" name="name">
                    </td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td>
                        <input type="text" name="password">
                    </td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td>
                        <input type="text" name="email">
                    </td>
                </tr>
                <tr>
                    <td>Sex:</td>
                    <td>
                        <input type="radio" name="gender" value="male">male
                        <input type="radio" name="gender" value="female">female
                    </td>
                </tr>
                <tr>
                    <td>Country:</td>
                    <td>
                        <select name="country">
                            <option value="india">india</option>
                            <option value="Ammerica">Ammerica</option>
                            <option value="England">England</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>submit</td>
                    <td>
                        <input type="submit" value="Edit User">
                    </td>
                </tr>

            </form>
        </table>
        <a href="/view">View All User</a>&nbsp;&nbsp;&nbsp;
        <a href="/reg">Add User</a>
    </body>
</html>