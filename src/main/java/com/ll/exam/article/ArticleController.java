package com.ll.exam.article;

import com.ll.exam.Rq;
import com.ll.exam.article.dto.ArticleDto;

import java.util.ArrayList;
import java.util.List;

public class ArticleController {
    private List<ArticleDto> articleDtos;
    ArticleService articleService;
    private Rq rq;
    public ArticleController (Rq rq) {
        this.rq = rq;
        articleDtos = new ArrayList<>();
        articleService = new ArticleService();
    }

    public void showLIst(Rq rq) {
        articleDtos = articleService.findAll();
        rq.setAttr("articleDtos", articleDtos);

        rq.view("usr/article/list");
    }

    public void showWrite(Rq rq) {
        rq.view("usr/article/write");
    }

    public void doWrite(Rq rq) {
        rq.println("일단 성공");
        String title = rq.getParam("title", "");
        String body = rq.getParam("body", "");
        articleService.add(title, body);
    }

    public void showDetail(Rq rq) {
        long id = Long.parseLong(rq.getPathValueByIndex(1, "0"));

        ArticleDto article = articleService.findById(id);

        if (id == 0) {
            rq.println("번호를 입력해주세요");
            return;
        }

        if (article == null) {
            rq.println("해당 게시글이 존재하지 않습니다.");
            return;
        }

        rq.setAttr("article", article);
        rq.view("usr/article/detail");
    }

    public void doDelete(Rq rq) {
        long id = Long.parseLong(rq.getPathValueByIndex(1, "0"));

        ArticleDto article = articleService.findById(id);

        if (id == 0) {
            rq.println("번호를 입력해주세요");
            return;
        }

        if (article == null) {
            rq.println("해당 게시글이 존재하지 않습니다.");
            return;
        }

        articleService.delete(id);
        rq.println("<div>삭제가 완료되었습니다.<div>");
        rq.println("<div><a href=\"/usr/article/list/free\">리스트로 이동</a></div>");
    }

    public void showModify(Rq rq) {
        long id = Long.parseLong(rq.getPathValueByIndex(1, "0"));

        ArticleDto article = articleService.findById(id);

        if (id == 0) {
            rq.println("번호를 입력해주세요");
            return;
        }

        if (article == null) {
            rq.println("해당 게시글이 존재하지 않습니다.");
            return;
        }

        rq.setAttr("article", article);
        rq.view("/usr/article/modify");
    }

    public void doModify(Rq rq) {
        long id = Long.parseLong(rq.getPathValueByIndex(1, "0"));

        ArticleDto article = articleService.findById(id);

        if (id == 0) {
            rq.println("번호를 입력해주세요");
            return;
        }

        if (article == null) {
            rq.println("해당 게시글이 존재하지 않습니다.");
            return;
        }

        String title = rq.getParam("title", "");
        String body = rq.getParam("body", "");

        articleService.modify(id, title, body);

        rq.println("<div>수정이 완료되었습니다</div>");
        rq.println("<div><a href=\"/usr/article/list/free\">게시물 리스트로 이동</a></div>");
    }
}