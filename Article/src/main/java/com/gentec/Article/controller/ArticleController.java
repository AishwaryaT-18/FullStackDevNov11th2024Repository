package com.gentec.Article.controller;


import com.gentec.Article.entity.Article;
import com.gentec.Article.service.ArticleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ArticleController {

    private ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @PostMapping("/article")
    public ResponseEntity<Article> saveArticle(@RequestBody Article article) {
        Article savedArticle = articleService.createArticle(article);
        return new ResponseEntity<>(savedArticle, HttpStatus.OK);
    }
    @GetMapping("/article/{id}")
    public ResponseEntity<Article> getArticleById(@PathVariable Integer id){
        return new ResponseEntity<>(articleService.getArticle(id),HttpStatus.OK);
    }
    @GetMapping("/articles")
    public ResponseEntity<List<Article>> displayAllArticles(){
        return new ResponseEntity<>(articleService.getAllArticles(),HttpStatus.OK);
    }
    @DeleteMapping("/art/{id}")
    public ResponseEntity<String> deleteArticleById(@PathVariable Integer id){
        articleService.deleteArticle(id);
        return new ResponseEntity<>("Article deleted",HttpStatus.OK);
    }
}
