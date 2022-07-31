package com.ll.exam.article;

import com.ll.exam.Rq;
import com.ll.exam.article.dto.ArticleDto;

import java.util.ArrayList;
import java.util.List;

public class ArticleController {
    private static List<ArticleDto> articleDtos;
    private Rq rq;
    public ArticleController (Rq rq) {
        this.rq = rq;
        articleDtos = new ArrayList<>();
    }

    public static void showLIst(Rq rq) {
        articleDtos.add(new ArticleDto("제목3", "내용3", 3));
        articleDtos.add(new ArticleDto("제목2", "내용2", 2));
        articleDtos.add(new ArticleDto("제목1", "내용1", 1));

        rq.setAttr("articleDtos", articleDtos);

        rq.view("usr/article/list");
    }
}