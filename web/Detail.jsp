<%-- 
    Document   : Detail
    Created on : Feb 26, 2024, 11:14:43 AM
    Author     : Michael Dang
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
</head>
<body>
    <%@include file="Header.jspf" %>
    <div class="container" style="margin-top: 50px ">
        <%@include file="CategoryBar.jspf" %>
        <div class="col-sm-9">
            <div class="container">
                <div class="card">
                    <div class="row">
                        <aside class="col-sm-5 border-right">
                            <article class="gallery-wrap"> 
                                <div class="img-big-wrap">
                                    <div> <a href="#"><img src=""></a></div>
                                </div> <!-- slider-product.// -->

                            </article> <!-- gallery-wrap .end// -->
                        </aside>
                        <aside class="col-sm-7">
                            <article class="card-body p-5">
                                <h3 class="title mb-3">${p.productName}</h3>

                                <p class="price-detail-wrap"> 
                                    <span class="price h3 text-warning"> 
                                        <span class="currency">VND</span><span class="num">${p.price}</span>
                                    </span> 
                                    <!--<span>/per kg</span>--> 
                                </p> <!-- price-detail-wrap .// -->
                                <dl class="item-property">
                                    <dt>Description</dt>
                                    <dd><p>${p.brief} </p></dd>
                                </dl>
                                <!--                                        <dl class="param param-feature">
                                                                            <dt>Model#</dt>
                                                                            <dd>12345611</dd>
                                                                        </dl>   item-property-hor .// 
                                                                        <dl class="param param-feature">
                                                                            <dt>Color</dt>
                                                                            <dd>Black and white</dd>
                                                                        </dl>   item-property-hor .// 
                                                                        <dl class="param param-feature">
                                                                            <dt>Delivery</dt>
                                                                            <dd>Russia, USA, and Europe</dd>
                                                                        </dl>   item-property-hor .// -->

                                <hr>
                                <div class="row">
                                    <div class="col-sm-5">
                                        <dl class="param param-inline">
                                            <dt>Quantity: </dt>
                                            <dd>
                                                <select class="form-control form-control-sm" style="width:70px;">
                                                    <option> 1 </option>
                                                    <option> 2 </option>
                                                    <option> 3 </option>
                                                </select>
                                            </dd>
                                        </dl>  <!-- item-property .// -->
                                    </div> <!-- col.// -->

                                </div> <!-- row.// -->
                                <hr>
                                <a href="CartControl?pid=${p.productID}" class="btn btn-lg btn-primary text-uppercase"> Buy now </a>
                                <a href="CartControl?pid=${p.productID}" class="btn btn-lg btn-outline-primary text-uppercase"> <i class="fas fa-shopping-cart"></i> Add to cart </a>
                            </article> <!-- card-body.// -->
                        </aside> <!-- col.// -->
                    </div> <!-- row.// -->
                </div> <!-- card.// -->
            </div>
        </div>
    </div>
    <%@include file="Footer.jspf" %> 
</body>
</html>
