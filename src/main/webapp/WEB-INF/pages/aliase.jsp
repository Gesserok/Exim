<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout title="Aliases">

    <h1 class="text-center text-uppercase">Aliases:</h1>
    <div class="jumbotron">
        <table border="2px">
            <tr>
                    <%--<th>Id</th>--%>
                <th> Local_part </th>
                <th> domain </th>
                <th> recipients </th>

            </tr>
            <c:forEach items="${aliase}" var="item">
                <tr>
                        <%--<td><c:out value="${item.id}"/></td>--%>
                    <td><c:out value="${item.localPart}"/></td>
                    <td><c:out value="${item.domain}"/></td>
                        <%--<td><c:out value="${item.name}"/></td>--%>
                    <td><c:out value="${item.recipients}"/></td>

                    <td>
                        <span><a href="update?localPart=${item.localPart}">edit</a></span>
                        <span><a href="delete?localPart=${item.localPart}">delete</a></span>
                    </td>
                        <%--<td><c:out value="${item.domain}"/></td>--%>
                </tr>
            </c:forEach>
        </table>

    </div>


</t:layout>
