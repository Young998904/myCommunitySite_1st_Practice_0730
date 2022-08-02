<%@ page import="java.util.List" %>
<%@ page import="com.ll.exam.article.dto.ArticleDto" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%
    List<ArticleDto> articleDtos = (List<ArticleDto>) request.getAttribute("articleDtos");
%>

<script src="https://cdn.tailwindcss.com"></script>

<section>
    <div class = "container px-3 mx-auto">
        <h1 class = "font-bold text-lg">게시물 리스트</h1>

        <ul class = "mt-5">
            <% for (ArticleDto articleDto : articleDtos) { %>
            <li class = "flex">
                <a class="w-[50] hover:underline hover:text-[blue]" href="/usr/article/detail/free/<%=articleDto.getId()%>"><%=articleDto.getId()%></a>
                <a class="flex-grow hover:underline hover:text-[blue]" href="/usr/article/detail/free/<%=articleDto.getId()%>"><%=articleDto.getTitle()%></a>
                <a onclick="if(!confirm('정말로 삭제하시겠습니까?')) return false;" class="w-[100] hover:underline hover:text-[red]" href="/usr/article/delete/free/<%=articleDto.getId()%>">삭제</a>
            </li>
            <% } %>
        </ul>
    </div>
</section>



