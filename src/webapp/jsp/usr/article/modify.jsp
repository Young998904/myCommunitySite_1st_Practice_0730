<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<%@ include file="../common/head.jspf" %>

<script>
    function ArticleSave__submitForm(form) {
        form.title.value = form.title.value.trim();
        if (form.title.value.length == 0) {
            alert('제목을 입력해주세요.');
            form.title.focus();
            return;
        }
        form.body.value = form.body.value.trim();
        if (form.body.value.length == 0) {
            alert('내용을 입력해주세요.');
            form.body.focus();
            return;
        }
        form.submit();
    }
</script>

<section>
    <div class="container px-3 mx-auto">
        <h1 class="font-bold text-lg">게시물 수정</h1>

        <form method="POST" onsubmit="ArticleSave__submitForm(this); return false;">
            <div class = "flex">
                <span class = "w-[40px]">번호</span>
                <div>
                    ${article.id}
                </div>
            </div>
            <div>
                <span>제목</span>
                <div>
                    기존 제목 : ${article.title}
                </div>
                <div>
                    <input name="title" type="text" maxlength="50" placeholder="제목을 입력해주세요."/>
                </div>
            </div>

            <div>
                <span>내용</span>
                <div>
                    기존 내용 : ${article.body}
                </div>
                <div>
                    <input name="body" type="text" maxlength="300" placeholder="내용을 입력해주세요."/>
                </div>
            </div>

            <div>
                <div>
                    <input class = "hover:underline hover:text-[red] cursor-pointer" type="submit" value="수정"/>
                </div>
            </div>
        </form>
    </div>
</section>

<%@ include file="../common/foot.jspf" %>