package com.example.calculatror.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class news {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String title, tetx, author;
    Integer view, likes;

    public news(String title, String tetx, String author, Integer view, Integer likes) {
        this.title = title;
        this.tetx = tetx;
        this.author = author;
        this.view = view;
        this.likes = likes;
    }

    public news() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTetx() {
        return tetx;
    }

    public void setTetx(String tetx) {
        this.tetx = tetx;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getView() {
        return view;
    }

    public void setView(Integer view) {
        this.view = view;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
}
