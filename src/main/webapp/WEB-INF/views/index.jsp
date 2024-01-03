<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>

    <c:set var="contextPath" value="${pageContext.request.contextPath}"/>
</head>
<body>

<nav class="navbar navbar-expand-md bg-dark navbar-dark">
    <a class="navbar-brand" href="#">Home</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="collapsibleNavbar">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="#">로그인</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">회원가입</a>
            </li>
        </ul>
    </div>
</nav>
<br>
<div class="container">
        <h2>회원목록</h2>
    <div class="container" style="display: flex; justify-content: space-between; flex-wrap: wrap">
        <div class="card" style="width: calc(33.33% - 20px); margin-bottom: 20px;">
            <img class="card-img-top" src="${contextPath}/img/profile_img.png" alt="Card image" style="width:100%">
            <div class="card-body">
                <h4 class="card-title">이름</h4>
                <p class="card-text">5km:</p>
                <p class="card-text">10km:</p>
                <p class="card-text">Half(21km):</p>
                <p class="card-text">Full(42.195km):</p>
                <a href="#" class="btn btn-primary">See Profile</a>
            </div>
        </div>
        <div class="card" style="width: calc(33.33% - 20px); margin-bottom: 20px;">
            <img class="card-img-top" src="${contextPath}/img/profile_img.png" alt="Card image" style="width:100%">
            <div class="card-body">
                <h4 class="card-title">이름</h4>
                <p class="card-text">5km:</p>
                <p class="card-text">10km:</p>
                <p class="card-text">Half(21km):</p>
                <p class="card-text">Full(42.195km):</p>
                <a href="#" class="btn btn-primary">See Profile</a>
            </div>
        </div>
        <div class="card" style="width: calc(33.33% - 20px); margin-bottom: 20px;">
            <img class="card-img-top" src="${contextPath}/img/profile_img.png" alt="Card image" style="width:100%">
            <div class="card-body">
                <h4 class="card-title">이름</h4>
                <p class="card-text">5km:</p>
                <p class="card-text">10km:</p>
                <p class="card-text">Half(21km):</p>
                <p class="card-text">Full(42.195km):</p>
                <a href="#" class="btn btn-primary">See Profile</a>
            </div>
        </div>
        <div class="card" style="width: calc(33.33% - 20px); margin-bottom: 20px;">
            <img class="card-img-top" src="${contextPath}/img/profile_img.png" alt="Card image" style="width:100%">
            <div class="card-body">
                <h4 class="card-title">이름</h4>
                <p class="card-text">5km:</p>
                <p class="card-text">10km:</p>
                <p class="card-text">Half(21km):</p>
                <p class="card-text">Full(42.195km):</p>
                <a href="#" class="btn btn-primary">See Profile</a>
            </div>
        </div>
    </div>
</div>
    <div class="jumbotron text-center" style="margin-bottom: 0">
        <p>Created By 강뀰</p>
        <p>📞Phone 010 - XXXX - XXXX</p>
        <p>🏴서울특별시 XX구 XX로 XXX-X</p>
    </div>
</body>
</html>


