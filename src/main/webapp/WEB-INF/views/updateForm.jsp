
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout title="Update user">
    <form:form id="updateForm" modelAttribute="updateUser" method="post" action="submitUpdate">
        Введіть email адресу
        <form:input path="login"/>
        Введіть пароль
        <form:password path="decrypt" title="password"/>
        <%--<form:hidden path="id"/>--%>
        <form:button value="submit">Зберегти</form:button>
    </form:form>
    <span><a href="/exim/admin/user/list">Відмінити</a></span>
    <span><a href="/delete?login=${updateUser.login}">Видалити</a></span>

</t:layout>

<%--<html>--%>
<%--<head>--%>
    <%--<title>Create mail</title>--%>
    <%--<meta http-equiv="content-type" content="text/html" charset="utf-8">--%>
<%--</head>--%>
<%--<body>--%>
<%--<form:form id="updateForm" modelAttribute="updateUser" method="post" action="submitUpdate">--%>
    <%--Enter Email address--%>
    <%--<form:input path="login"/>--%>
    <%--Enter Email password--%>
    <%--<form:password path="decrypt" title="password"/>--%>
    <%--&lt;%&ndash;<form:hidden path="id"/>&ndash;%&gt;--%>
    <%--<form:button value="submit">Save</form:button>--%>
<%--</form:form>--%>
<%--<span><a href="/list">Cancel</a></span>--%>
<%--<span><a href="/delete?login=${updateUser.login}">Delete</a></span>--%>

<%--</body>--%>
<%--</html>--%>
