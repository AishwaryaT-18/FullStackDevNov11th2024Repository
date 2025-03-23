package com.gentec.Article.serviceimpl;

import com.gentec.Article.entity.Article;
import com.gentec.Article.entity.Author;
import com.gentec.Article.repository.ArticleRepository;
import com.gentec.Article.repository.AuthorRepository;
import com.gentec.Article.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Author getAuthor(Integer id) {
        return authorRepository.findById(id).get();
    }
    public Author updateAuthor(Author author) {
        return authorRepository.save(author);
    }
    public void deleteAuthor(Integer id) {
        authorRepository.deleteById(id);
    }
}
