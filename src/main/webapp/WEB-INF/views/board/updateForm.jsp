<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../layout/header.jsp"%>

<div class="container">
    <form>
        <input type="hidden" id="id" value="${board.id}">
        <div class="form-group">
            <label for="title">Title</label>
            <input value="${board.title}" type="text" class="form-control" id="title" placeholder="Enter title">
        </div>
        <div class="form-group">
            <label for="content">Content:</label>
            <textarea  class="form-control summernote" rows="5" id="content" >${board.content}</textarea>
        </div>
    </form>
        <button id="btn-update" class="btn btn-primary">수정</button>
</div>
<br>
<script>
    $('.summernote').summernote({
        tabSize: 2,
        height: 300
    });
</script>

<%@include file="../layout/footer.jsp"%>
<script src="/js/board.js"></script>