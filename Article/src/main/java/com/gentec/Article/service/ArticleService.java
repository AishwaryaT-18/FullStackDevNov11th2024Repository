package com.gentec.Article.service;

import com.gentec.Article.entity.Article;

import java.util.List;

public interface ArticleService {

    Article createArticle(Article article);

    List <Article> getAllArticles();

    Article getArticle(Integer id);

    Article updateArticle(Article article);

    void deleteArticle(Integer id);
}
