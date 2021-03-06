
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout title="Update Aliase">
    <form:form id="updateAliaseForm" modelAttribute="updateAliase" method="post" action="submitUpdate">
        <p><span>Введіть адресу групової скриньки
            <form:input path="localPart"/></span></p>>
        <p><span>Введіть отримувачів
        <form:textarea path="recipients"/>
        <%--<form:hidden path="id"/>--%>
            <form:button value="submit">Зберегти</form:button> </span></p>>
    </form:form>
    <span><a href="/exim/admin/aliase/list">Відмінити</a></span>
    <span><a href="/delete?localPart=${updateAliase.localPart}">Видалити</a></span>

</t:layout>

