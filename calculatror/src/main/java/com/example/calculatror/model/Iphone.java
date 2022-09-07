package com.example.calculatror.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Iphone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String title, text;
    Integer price, display, number;

    public Iphone() {
    }

    public Iphone(String title, String text, Integer price, Integer display, Integer number) {
        this.title = title;
        this.text = text;
        this.price = price;
        this.display = display;
        this.number = number;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getDisplay() {
        return display;
    }

    public void setDisplay(Integer display) {
        this.display = display;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
