<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@include file="../layout/header.jsp"%>

<div class="container">
    <h2>회원정보 수정</h2>
    <form>
        <input type="hidden" id="id" value="${principal.user.id}">
                <div class="form-group">
                    <label for="username">Username:</label>
                    <input type="username" value="${principal.user.username}" class="form-control" placeholder="Enter username" id="username" readonly>
                </div>
              <c:choose>
                  <c:when test="${empty principal.user.oauth}">
                        <div class="form-group">
                            <label for="password">Password:</label>
                            <input type="password" class="form-control" placeholder="Enter password" id="password">
                        </div>
                          <div class="form-group">
                              <label for="email">Email address:</label>
                              <input type="email" value="${principal.user.email}" class="form-control" placeholder="Enter email" id="email">
                          </div>
                  </c:when>
                  <c:otherwise>
                        <div class="form-group">
                            <label for="email">Email address:</label>
                            <input type="email" value="${principal.user.email}" class="form-control" placeholder="Enter email" id="email" readonly>
                        </div>
                  </c:otherwise>
              </c:choose>
    </form>
        <button id="btn-update" class="btn btn-primary">수정</button>
</div>
<br>

<%@include file="../layout/footer.jsp"%>
<script src="/js/user.js"></script>
