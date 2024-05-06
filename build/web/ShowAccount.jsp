<%-- 
    Document   : ShowAccount
    Created on : Feb 25, 2024, 10:20:14 AM
    Author     : Michael Dang
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping site</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <script type="text/javascript" src="Scripts/jquery-2.1.1.min.js"></script>
        <script type="text/javascript" src="Scripts/bootstrap.min.js"></script>
    </head>
    <body>
        <%@include file="Header.jspf" %>
        <h3 style="color: red">${lenhPhanHoi}</h3>
        <div class="container">
            <br>
            <h3>List of Accounts</h3>
            <br>
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>Account</th>
                        <th>Full Name</th>
                        <th>Date of birth</th>
                        <th>Gender</th>
                        <th>Phone Number</th>
                        <th>Is Use</th>
                        <th>Role in system</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listAcc}" var="o">
                        <tr>
                            <td>${o.account}</td>
                            <td>${o.lastName} ${o.firstName}</td>
                            <td>${o.birthday}</td>
                            <td>${o.gender}</td>
                            <td>${o.phone}</td>
                            <td>${o.isUse}</td>
                            <td>${o.roleInSystem}</td>
                            <td style="display: flex;justify-content: center">
                                <form action="AccountManagement" style="margin: 5px">
                                    <input type="hidden" name="lenh" value="Update">
                                    <input type="hidden" name="id" value="${o.account}">
                                    <input type="submit" value="Update" class="btn btn-warning">
                                </form>
                                    <form action="AccountManagement" style="margin: 5px">
                                    <input type="hidden" name="lenh" value="Delete">
                                    <input type="hidden" name="id" value="${o.account}">
                                    <input type="submit" value="Delete" class="btn btn-danger">
                                </form>
                                    <form action="AccountManagement" style="margin: 5px">
                                        <input type="hidden" name="lenh" value="Condition">
                                        <input type="hidden" name="id" value="${o.account}">
                                        <input type="submit" value="${o.isUse?"Active":"Inactive"}" class="btn btn-success">
                                    </form> 
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <a class="btn btn-primary" href="UserControl" role="button">Home</a>
        </div>

    </body><%@include file="Footer.jspf" %>
</html>
