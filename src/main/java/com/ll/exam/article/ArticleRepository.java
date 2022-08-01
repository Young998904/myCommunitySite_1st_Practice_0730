package com.ll.exam.article;

import com.ll.exam.article.dto.ArticleDto;

import java.util.ArrayList;
import java.util.List;

public class ArticleRepository {
    private static List<ArticleDto> articleDtos;
    private static int lastId;

    static {
        articleDtos = new ArrayList<>();
        lastId = 0;
    }

    public void add(String title, String body) {
        articleDtos.add(new ArticleDto(title, body, ++lastId));
    }

    public List<ArticleDto> findAll() {
        return articleDtos;
    }

    public ArticleDto findById(long id) {
        for (ArticleDto articleDto : articleDtos) {
            if (articleDto.getId() == id) {
                return articleDto;
            }
        }
        return null;
    }
}
