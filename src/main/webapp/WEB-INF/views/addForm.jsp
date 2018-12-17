
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout title="New user">
    <form:form id="addForm" modelAttribute="newUser" method="post" action="submitNew">
        <p><span> Введіть email: <form:input path="login"/>  @cib.com.ua </span></p>
        <p><span> Введіть пароль <form:password path="decrypt" title="password"/> </span>
        <span> <form:button value="submit">Зберегти</form:button> </span></p>
    </form:form>
    <a href="/exim/admin/user/list">Відмінити</a>


</t:layout>

