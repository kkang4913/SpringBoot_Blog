<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@include file="layout/header.jsp"%>

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
                <a href="#" class="btn btn-primary">상세보기</a>
            </div>
        </div>
    </div>
</div>

<%@include file="layout/footer.jsp"%>



