package com.gentec.Article.serviceimpl;

import com.gentec.Article.entity.Article;
import com.gentec.Article.repository.ArticleRepository;
import com.gentec.Article.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public Article createArticle(Article article) {
        return articleRepository.save(article);
    }

    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    public Article getArticle(Integer id) {
        return articleRepository.findById(id).get();
    }
    public Article updateArticle(Article article) {
        return articleRepository.save(article);
    }
    public void deleteArticle(Integer id) {
        articleRepository.deleteById(id);
    }
}
