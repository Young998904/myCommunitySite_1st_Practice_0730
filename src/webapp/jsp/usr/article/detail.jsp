<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ include file="../common/head.jspf" %>

<section>
    <div class="container px-3 mx-auto">
        <h1 class="font-bold text-lg">게시물 상세 페이지</h1>
        <div>
            <div>
                id : ${article.id}
            </div>
            <div>
                제목 : ${article.title}
            </div>
            <div>
                내용 : ${article.body}
            </div>
        </div>
    </div>
</section>

<%@ include file="../common/foot.jspf" %>