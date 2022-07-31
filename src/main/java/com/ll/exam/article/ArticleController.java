package com.ll.exam.article;

import com.ll.exam.Rq;

public class ArticleController {
    private Rq rq;
    public ArticleController (Rq rq) {
        this.rq = rq;
    }

    public static void showLIst(Rq rq) {
        rq.view("usr/article/list");
    }
}
