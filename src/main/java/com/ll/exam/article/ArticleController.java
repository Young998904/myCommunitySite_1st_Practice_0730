package com.ll.exam.article;

import com.ll.exam.Rq;
import com.ll.exam.article.dto.ArticleDto;

import java.util.ArrayList;
import java.util.List;

public class ArticleController {
    private List<ArticleDto> articleDtos;
    private Rq rq;
    public ArticleController (Rq rq) {
        this.rq = rq;
        articleDtos = new ArrayList<>();
    }

    public void showLIst(Rq rq) {
        rq.setAttr("articleDtos", articleDtos);

        rq.view("usr/article/list");
    }

    public void showWrite(Rq rq) {
        rq.view("usr/article/write");
    }

    public void doWrite(Rq rq) {
        rq.appendBody("일단 성공");
    }
}