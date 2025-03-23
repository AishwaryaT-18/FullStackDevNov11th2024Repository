package com.gentec.Article.service;

import com.gentec.Article.entity.Article;
import com.gentec.Article.entity.Author;

import java.util.List;

public interface AuthorService {

    Author createAuthor(Author author);

    List<Author> getAllAuthors();

    Author getAuthor(Integer id);

    Author updateAuthor(Author author);

    void deleteAuthor(Integer id);
}
