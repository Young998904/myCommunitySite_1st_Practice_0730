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
        rq.appendBody("일단 성공");
        String title = rq.getParam("title", "");
        String body = rq.getParam("body", "");
        articleService.add(title, body);
    }

    public void showDetail(Rq rq) {
        long id = Long.parseLong(rq.getPathValueByIndex(1, "0"));

        ArticleDto article = articleService.findById(id);

        if (id == 0) {
            rq.appendBody("번호를 입력해주세요");
            return;
        }

        if (article == null) {
            rq.appendBody("해당 게시글이 존재하지 않습니다.");
            return;
        }

        rq.setAttr("article", article);
        rq.view("usr/article/detail");
    }
}