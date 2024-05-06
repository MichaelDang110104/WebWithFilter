<%-- 
    Document   : Login
    Created on : Feb 22, 2024, 1:44:27 PM
    Author     : Michael Dang
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css'>
        <script src='https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js'></script>
        <script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js'></script>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            body {
                margin: 0;
                padding: 0;
                background-color: #17a2b8;
                height: 100vh;
            }
            #login .container #login-row #login-column #login-box {
                margin-top: 120px;
                max-width: 600px;
                height: 450px;
                border: 1px solid #9C9C9C;
                background-color: #EAEAEA;
            }
            #login .container #login-row #login-column #login-box #login-form {
                padding: 20px;
            }
            #login .container #login-row #login-column #login-box #login-form #register-link {
                margin-top: -85px;
            }
        </style>
    </head>

    <body>
        <div id="login">
            <h3 class="text-center text-white pt-5">Product Introduction</h3>
            <div class="container">
                <div id="login-row" class="row justify-content-center align-items-center">
                    <div id="login-column" class="col-md-6">
                        <div id="login-box" class="col-md-12">
                            <form id="login-form" class="form" action="LoginControl" method="post">
                                <h3 class="text-center text-info">Login</h3>
                                <div class="form-group">
                                    <label  class="text-info">Account:</label><br>
                                    <input type="text" name="accountLogin" placeholder="Enter username" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label  class="text-info">Password:</label><br>
                                    <input type="password" name="passwordLogin" placeholder="Enter password" class="form-control" required>
                                </div>
                                <c:set var="ERR" value="${ERRO_MESS}"></c:set>
                                <c:if test="${not empty ERR}">
                                    <b style="color:red;">
                                        ${ERR}
                                    </b>
                                </c:if><br>
                                <input type="submit" value="Submit" />
                            </form>
                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>

