<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<body>
<h2>Hello, ${db}</h2>
<table border="2px">
    <tr>
        <th>Id</th>
        <th> Login </th>
        <th> Encrypt </th>
        <th> Decrypt </th>
    </tr>
    <c:forEach items="${list}" var="item">
        <tr>
            <td><c:out value="${item.id}"/></td>
            <td><c:out value="${item.login}"/></td>
            <%--<td><c:out value="${item.name}"/></td>--%>
            <td><c:out value="${item.encrypt}"/></td>
            <td><c:out value="${item.decrypt}"/></td>
            <%--<td><c:out value="${item.domain}"/></td>--%>
        </tr>
    </c:forEach>
</table>


</body>
</html>
