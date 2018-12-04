
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout title="New aliase">
    <form:form id="addAliaseForm" modelAttribute="newAliase" method="post" action="submitNew">
        Enter Aliase Name
        <form:input path="localPart"/>
        Enter recipients line
        <form:input path="recipients"/>
        <%--Enter Email password--%>
        <%--<form:password path="decrypt" title="password"/>--%>
        <form:button value="submit">Save</form:button>
    </form:form>
    <a href="/aliase">Cancel</a>


</t:layout>

