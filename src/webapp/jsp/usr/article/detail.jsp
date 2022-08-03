<%@ page import="java.util.List" %>
<%@ page import="com.ll.exam.article.dto.ArticleDto" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%
    ArticleDto article = (ArticleDto) request.getAttribute("article");
%>

<%@ include file="../common/head.jspf" %>

<section>
    <div class="container px-3 mx-auto">
        <h1 class="font-bold text-lg">게시물 상세 페이지</h1>

        <ul>
            <li>id : <%=article.getId()%>
            </li>
            <li>제목 : <%=article.getTitle()%>
            </li>
            <li>내용 : <%=article.getBody()%>
            </li>
        </ul>
    </div>
</section>

<%@ include file="../common/foot.jspf" %>