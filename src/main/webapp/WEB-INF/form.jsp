
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Create mail</title>
    <meta http-equiv="content-type" content="text/html" charset="utf-8">
</head>
<body>
<form:form id="formCreate" modelAttribute="newUser" method="post" action="submit">
    Enter Email address
    <form:input path="login"/>
    Enter Email password
    <form:password path="decrypt" title="password"/>
    <form:button value="submit">Save</form:button>
</form:form>

</body>
</html>
