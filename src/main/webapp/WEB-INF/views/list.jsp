<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout title="List of emails">

    <h1 class="text-center text-uppercase">Поштові скриньки:</h1>
    <div class="jumbotron">
        <table border="2px">
            <tr>
                    <%--<th>Id</th>--%>
                <th> Логін </th>
                <th> ГО </th>
                <th> Шифр  </th>
                <th> Пароль </th>
                <th> uid </th>
                <th> gid </th>
                <th> Домен </th>
                <th> quota </th>
                <th> copy_mail </th>
                <th> Status </th>
                <th> Дії </th>
            </tr>
            <c:forEach items="${list}" var="item">
                <tr>
                        <%--<td><c:out value="${item.id}"/></td>--%>
                    <td><c:out value="${item.login}"/></td>
                    <td><c:out value="${item.name}"/></td>
                        <%--<td><c:out value="${item.name}"/></td>--%>
                    <td><c:out value="${item.password}"/></td>
                    <td><c:out value="${item.decrypt}"/></td>
                    <td><c:out value="${item.uid}"/></td>
                    <td><c:out value="${item.gid}"/></td>
                    <td><c:out value="${item.domain}"/></td>
                    <td><c:out value="${item.quota}"/></td>
                    <td><c:out value="${item.copyMail}"/></td>
                    <td><c:out value="${item.status}"/></td>
                    <td>
                        <span><a href="update?login=${item.login}">Редарувати</a></span>
                        <%--<span><a href="delete?login=${item.login}">Видалити</a></span>--%>
                    </td>
                        <%--<td><c:out value="${item.domain}"/></td>--%>
                </tr>
            </c:forEach>
        </table>
    </div>


</t:layout>
