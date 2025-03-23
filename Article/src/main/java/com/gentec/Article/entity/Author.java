package com.gentec.Article.entity;


import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name="tbl_author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "author_name")
    private String authorName;
    @Column(name = "author_location")
    private String authorLocation;
    @Column(name = "author_email")
    private String authorEmail;
    @Column(name = "author_phone")
    private String authorPhone;
    @Column(name = "author_website")
    private String authorWebsite;
    @Column(name = "author_twitter")
    private String authorTwitter;
    @Column(name = "author_facebook")
    private String authorFacebook;
    @Column(name = "author_instagram")
    private String authorInstagram;
    @Column(name = "author_linkedin")
    private String authorLinkedin;

    @CreationTimestamp
    @Column(name = "created_data")
    private Date createdData;

    @UpdateTimestamp
    @Column(name = "modified_data")
    private Date modifiedData;

    public Author(){}

    public Author(Integer id, String authorName, String authorLocation, String authorEmail, String authorPhone, String authorWebsite, String authorTwitter, String authorFacebook, String authorInstagram, String authorLinkedin, Date createdData, Date modifiedData) {
        this.id = id;
        this.authorName = authorName;
        this.authorLocation = authorLocation;
        this.authorEmail = authorEmail;
        this.authorPhone = authorPhone;
        this.authorWebsite = authorWebsite;
        this.authorTwitter = authorTwitter;
        this.authorFacebook = authorFacebook;
        this.authorInstagram = authorInstagram;
        this.authorLinkedin = authorLinkedin;
        this.createdData = createdData;
        this.modifiedData = modifiedData;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorLocation() {
        return authorLocation;
    }

    public void setAuthorLocation(String authorLocation) {
        this.authorLocation = authorLocation;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public String getAuthorPhone() {
        return authorPhone;
    }

    public void setAuthorPhone(String authorPhone) {
        this.authorPhone = authorPhone;
    }

    public String getAuthorWebsite() {
        return authorWebsite;
    }

    public void setAuthorWebsite(String authorWebsite) {
        this.authorWebsite = authorWebsite;
    }

    public String getAuthorTwitter() {
        return authorTwitter;
    }

    public void setAuthorTwitter(String authorTwitter) {
        this.authorTwitter = authorTwitter;
    }

    public String getAuthorFacebook() {
        return authorFacebook;
    }

    public void setAuthorFacebook(String authorFacebook) {
        this.authorFacebook = authorFacebook;
    }

    public String getAuthorInstagram() {
        return authorInstagram;
    }

    public void setAuthorInstagram(String authorInstagram) {
        this.authorInstagram = authorInstagram;
    }

    public String getAuthorLinkedin() {
        return authorLinkedin;
    }

    public void setAuthorLinkedin(String authorLinkedin) {
        this.authorLinkedin = authorLinkedin;
    }

    public Date getCreatedData() {
        return createdData;
    }

    public void setCreatedData(Date createdData) {
        this.createdData = createdData;
    }

    public Date getModifiedData() {
        return modifiedData;
    }

    public void setModifiedData(Date modifiedData) {
        this.modifiedData = modifiedData;
    }
}

