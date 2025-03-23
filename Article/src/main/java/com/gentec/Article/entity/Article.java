package com.gentec.Article.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

    @Entity
    @Table(name="tbl_articles")
    public class Article {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Integer articleId;

        @Column(name = "title")
        private String title;
        @Column(name = "author")
        private String author;
        @Column(name = "content")
        private String content;
        @Column(name = "publisher")
        private String publisher;


        @CreationTimestamp
        @Column(name = "created_date")
        private Date createdDate;

        @UpdateTimestamp
        @Column(name = "modified_date")
        private Date modifiedDate;


        public Article()
        {

        }
        public Article(Integer articleId, String title, String author, String content)
        {
            this.articleId = articleId;
            this.title = title;
            this.author = author;
            this.content = content;
            this.publisher = publisher;
            this.createdDate = createdDate;
            this.modifiedDate = modifiedDate;
        }

        public Integer getArticleId() {
            return articleId;
        }
        public void setArticleId(Integer articleId) {
            this.articleId = articleId;
        }
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public String getAuthor() {
            return author;
        }
        public void setAuthor(String author) {
            this.author = author;
        }
        public String getContent() {
            return content;
        }
        public void setContent(String content) {
            this.content = content;
        }
        public String getPublisher() {
            return publisher;
        }
        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }
        public Date getCreatedDate() {
            return createdDate;
        }
        public void setCreatedDate(Date createdDate) {
            this.createdDate = createdDate;
        }
        public Date getModifiedDate() {
            return modifiedDate;
        }
        public void setModifiedDate(Date modifiedDate) {
            this.modifiedDate = modifiedDate;
        }
    }

