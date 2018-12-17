<%@tag pageEncoding="UTF-8" description="Base layout" %>

<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>



<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@attribute name="title" type="java.lang.String" required="true"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="<c:url value="/assets/css/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="/assets/css/style.css" />" rel="stylesheet">
    <link href='https://fonts.googleapis.com/css?family=Oxygen:400,300,700' rel='stylesheet' type='text/css'>
    <title><c:out value="${title}"/></title>
</head>
<body>

<security:authorize access="hasRole('ROLE_GO')">
<header class="navbar navbar-default">
    <div class="container">
        <ul class="nav navbar-nav navbar-left">
            <li>
                <a href="/exim/user/aliase/list"><span class="glyphicon glyphicon-list-alt"></span>Переадресация и группы рассылки</a>
            </li>
            <li>
                <a href="/exim/user/changepassword"><span class="glyphicon glyphicon-plus"></span>Изменить пароль на EMAIL</a>
            </li>
        </ul>
    </div>
</header>
</security:authorize>

<security:authorize access="hasRole('ROLE_ADMIN')">
<header class="navbar navbar-default">
    <div class="container">
        <ul class="nav navbar-nav navbar-left">
            <li>
                <a href="/exim/admin/user/list"><span class="glyphicon glyphicon-list-alt"></span>Список email</a>
            </li>
            <li>
                <a href="/exim/admin/user/create"><span class="glyphicon glyphicon-plus"></span>Створити новий email</a>
            </li>
            <li>
                <a href="/exim/admin/aliase/list"><span class="glyphicon glyphicon-plus"></span>Групові email</a>
            </li>
            <li>
                <a href="/exim/admin/aliase/create"><span class="glyphicon glyphicon-plus"></span>Створити новий груповий email</a>
            </li>
            <%--<li>--%>
            <%--<a href="register"><span class="glyphicon glyphicon-user"></span> Зарегистрироваться</a>--%>
            <%--</li>--%>
        </ul>
    </div>
</header>
</security:authorize>

<security:authorize access="hasRole('ROLE_MODERATOR')">
    <header class="navbar navbar-default">
        <div class="container">
            <ul class="nav navbar-nav navbar-left">
                <li>
                    <a href="/exim/admin/user/create"><span class="glyphicon glyphicon-plus"></span>Створити новий email</a>
                </li>
                <li>
                    <a href="/exim/admin/aliase/create"><span class="glyphicon glyphicon-plus"></span>Створити новий груповий email</a>
                </li>
                <li>
                    <a href="/exim/admin/aliase/deleteone"><span class="glyphicon glyphicon-plus"></span>Видалити груповий email</a>
                </li>
                    <%--<li>--%>
                    <%--<a href="register"><span class="glyphicon glyphicon-user"></span> Зарегистрироваться</a>--%>
                    <%--</li>--%>
            </ul>
        </div>
    </header>
</security:authorize>



<div class="container">
    <jsp:doBody/>
</div>

<a href="<c:url value="/logout" />">Вихід</a>

<footer class="panel-footer">
    <div class="container">
        <div class="row">
            <div class="text-center">&copy; Created by Anton </div>
        </div>
    </div>
</footer>

</body>
<script src="<c:url value="/assets/js/jquery-3.3.1.min.js" />"></script>
<script src="<c:url value="/assets/js/bootstrap.min.js" />"></script>
</html>
