package com.ll.exam.article.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ArticleDto {
    private String title;
    private String body;
    private long id;
}
