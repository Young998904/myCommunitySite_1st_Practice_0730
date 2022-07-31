package com.ll.exam.article;

import com.ll.exam.article.dto.ArticleDto;

import java.util.List;

public class ArticleService {
    ArticleRepository articleRepository;

    public ArticleService () {
        articleRepository = new ArticleRepository();
    }
    public void add(String title, String body) {
        articleRepository.add(title, body);
    }

    public List<ArticleDto> findAll() {
        return articleRepository.findAll();
    }
}
