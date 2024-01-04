<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@include file="../layout/header.jsp"%>

<div class="container">
    <h2>회원가입</h2>
    <form>
        <div class="form-group">
            <label for="username">Username:</label>
            <input type="username" class="form-control" placeholder="Enter username" id="username">
        </div>
        <div class="form-group">
            <label for="password">Password:</label>
            <input type="password" class="form-control" placeholder="Enter password" id="password">
        </div>
        <div class="form-group">
            <label for="email">Email address:</label>
            <input type="email" class="form-control" placeholder="Enter email" id="email">
        </div>
    </form>
        <button id="btn-save" class="btn btn-primary">회원가입</button>
</div>
<br>

<%@include file="../layout/footer.jsp"%>
<script src="/blog/js/user.js"></script>
