
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout title="New aliase">
    <form:form id="addAliaseForm" modelAttribute="deleteAliase" method="post" action="submitDelete">
        <p><span>Видалити адресу групової розсилки<form:input path="localPart"/>  @cib.com.ua </span>
            <form:button value="submit">Save</form:button></span> </p>
    </form:form>
    <a href="/exim/admin/aliase/list">Cancel</a>


</t:layout>

