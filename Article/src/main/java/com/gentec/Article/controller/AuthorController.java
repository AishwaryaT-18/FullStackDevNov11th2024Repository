package com.gentec.Article.controller;

import com.gentec.Article.entity.Article;
import com.gentec.Article.entity.Author;
import com.gentec.Article.service.ArticleService;
import com.gentec.Article.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AuthorController {
@Autowired
    private AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping("/author")
    public ResponseEntity<Author> saveAuthor(@RequestBody Author author) {
        Author savedAuthor = authorService.createAuthor(author);
        return new ResponseEntity<>(savedAuthor, HttpStatus.OK);
    }
    @GetMapping("/author/{id}")
    public ResponseEntity<Author> getAuthorById(@PathVariable Integer id){
        return new ResponseEntity<>(authorService.getAuthor(id),HttpStatus.OK);
    }
    @GetMapping("/authors")
    public ResponseEntity<List<Author>> displayAllAuthor(){
        return new ResponseEntity<>(authorService.getAllAuthors(),HttpStatus.OK);
    }
    @DeleteMapping("/auth/{id}")
    public ResponseEntity<String> deleteAuthorById(@PathVariable Integer id){
        authorService.deleteAuthor(id);
        return new ResponseEntity<>("Author deleted",HttpStatus.OK);
    }

}
