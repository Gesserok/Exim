
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout title="Update Aliase">
    <form:form id="addAliaseForm" modelAttribute="updateAliase" method="post" action="submitUpdate">
        Enter Aliase Name
        <form:input path="localPart"/>
        <%--Enter Email password--%>
        <%--<form:password path="decrypt" title="password"/>--%>
        <%--<form:hidden path="id"/>--%>
        <form:button value="submit">Save</form:button>
    </form:form>
    <span><a href="/list">Cancel</a></span>
    <span><a href="/delete?localPart=${updateAliase.localPart}">Delete</a></span>

</t:layout>

