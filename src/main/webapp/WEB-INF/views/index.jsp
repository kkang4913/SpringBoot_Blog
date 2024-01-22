<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="layout/header.jsp"%>

<div class="container">
        <h2>회원목록</h2>
    <div class="row">
        <c:forEach var="board" items="${boards}">
            <div class="col-md-3">
                    <div class="card" style="margin-bottom: 20px;">
                        <img class="card-img-top" src="${contextPath}/img/profile_img.png" alt="Card image" style="width:100%">
                        <div class="card-body">
                            <h4 class="card-title" style="white-space: nowrap; overflow: hidden; text-overflow: ellipsis ">${board.title}</h4>
                            <p>5km:</p>
                            <p>10km:</p>
                            <p>Half:</p>
                            <p>Full:</p>
                            <a href="/board/${board.id}" class="btn btn-primary">상세보기${board.id}</a>
                        </div>
                    </div>
                </div>
        </c:forEach>
    </div>
</div>
<!-- 페이징 처리 -->
<nav aria-label="Page navigation example">
    <ul class="pagination justify-content-center">
        <!-- 이전 -->
        <c:if test="${paging.currentPage eq 1}">
            <li class="page-item">
                <a class="page-link no-before" tabindex="-1" aria-disabled="true">이전</a>
            </li>
        </c:if>
        <c:if test="${paging.currentPage ne 1}">
            <c:url var="before" value="/">
                <c:param name="currentPage" value="${paging.currentPage - 1}"/>
            </c:url>

            <li class="page-item">
                <a class="page-link" tabindex="-1" href="${before}" aria-disabled="true">이전</a>
            </li>
        </c:if>

        <!-- 페이지 -->
        <c:forEach var="page" begin="${paging.startPage}" end="${paging.endPage}">
            <c:if test="${page eq paging.currentPage }">
                <li class="page-item"><a class="page-link bg-primary text-light">${page}</a></li>
            </c:if>

            <c:if test="${page ne paging.currentPage }">
                <c:url var="pagination" value="/">
                    <c:param name="currentPage" value="${page}"/>
                </c:url>

                <li class="page-item"><a class="page-link" href="${pagination}">${page}</a></li>
            </c:if>
        </c:forEach>

        <!-- 다음 -->
        <c:if test="${paging.currentPage eq paging.maxPage}">
            <li class="page-item">
                <a class="page-link no-before" tabindex="-1" aria-disabled="true">다음</a>
            </li>
        </c:if>
        <c:if test="${paging.currentPage ne paging.maxPage}">
            <c:url var="after" value="/">
                <c:param name="currentPage" value="${paging.currentPage + 1}"/>
            </c:url>

            <li class="page-item">
                <a class="page-link" tabindex="-1" href="${after}" aria-disabled="true">다음</a>
            </li>
        </c:if>

    </ul>
</nav>

<%@include file="layout/footer.jsp"%>



