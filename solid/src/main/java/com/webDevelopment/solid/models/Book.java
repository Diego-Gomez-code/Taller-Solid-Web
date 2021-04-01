package com.webDevelopment.solid.models;

public class Book {
    private String title;
    private String author;
    private Integer publishedYear;
    private Double price;
    private String description;

    public Book(String title, String author, Integer publishedYear, Double price, String description) {
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
        this.price = price;
        this.description = description;
    }


    public String createBookCard()
    {
        return "The book " + this.title + " has benn written by " + this.author + " and was " +
                "published in " + this.publishedYear + ". The book's price is " + this.price + this.description;
    }
    public Boolean validate(){
        return this.description.length() < 200 &&
                this.price > 10000 &&
                this.price % 1 == 0 &&
                this.author.contains(" ") &&
                this.publishedYear > 999 &&
                this.publishedYear <= 2021;
    }

    public String titleAndAuthor(){
        return "Title: " + this.title + ", Author: " + this.author + ".\n";
    }

    public String getAuthor(){
        return this.author;
    }
}
