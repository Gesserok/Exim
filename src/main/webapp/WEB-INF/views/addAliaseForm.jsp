
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout title="New aliase">
    <form:form id="addAliaseForm" modelAttribute="newAliase" method="post" action="submitNew">
        <p><span>Введіть адресу групової розсилки
            <form:input path="localPart"/>  @cib.com.ua </span> </p>
        <p><span>Введіть отримувачів через "," (без @cib.com.ua)
        <form:textarea path="recipients"/>
        <%--Enter Email password--%>
        <%--<form:password path="decrypt" title="password"/>--%>
            <form:button value="submit">Save</form:button></span> </p>
    </form:form>
    <a href="/exim/admin/aliase/list">Cancel</a>


</t:layout>

