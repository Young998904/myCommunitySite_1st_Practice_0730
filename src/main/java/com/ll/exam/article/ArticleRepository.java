package com.ll.exam.article;

import com.ll.exam.article.dto.ArticleDto;

import java.util.ArrayList;
import java.util.List;

public class ArticleRepository {
    private static List<ArticleDto> articleDtos;
    private static int lastId;

    static {
        articleDtos = new ArrayList<>();
        lastId = 10;

        for (int i=1; i <= 10; i++) {
            long id = i;
            String title = "제목" + i;
            String body = "내용" + i;
            articleDtos.add(new ArticleDto(title, body, id));
        }
    }

    public ArticleRepository () {

    }

    public void delete(long id) {
        ArticleDto article = findById(id);
        articleDtos.remove(article);
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

    public void modify(long id, String title, String body) {
        ArticleDto article = findById(id);
        article.setTitle(title);
        article.setBody(body);
    }
}
