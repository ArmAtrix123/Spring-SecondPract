package com.example.calculatror.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MacBook {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String title, text, color;
    Integer price, size;

    public MacBook() {
    }
    public MacBook(String title, String text, String color, Integer price, Integer size) {
        this.title = title;
        this.text = text;
        this.color = color;
        this.price = price;
        this.size = size;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}