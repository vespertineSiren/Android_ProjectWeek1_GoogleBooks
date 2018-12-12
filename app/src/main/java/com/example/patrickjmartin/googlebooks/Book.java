package com.example.patrickjmartin.googlebooks;

import android.graphics.Bitmap;

import org.json.JSONObject;

//Should I make this parcelable?
public class Book {

    private String title, author, review, publishDate, googleBooksID, image, bookshelfHomes;
    private Boolean isRead;

    public Book(String title, String author, String review, String publishDate, String googleBooksID, String image) {
        this.title = title;
        this.author = author;
        this.review = review;
        this.publishDate = publishDate;
        this.googleBooksID = googleBooksID;
        this.image = image;
    }



    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getReview() {
        return review;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getGoogleBooksID() {
        return googleBooksID;
    }

    public String getImage() {
        return image;
    }

    public String getBookshelfHomes() {
        return bookshelfHomes;
    }

    public Boolean getRead() {
        return isRead;
    }

    public void setBookshelfHomes(String bookshelfHomes) {
        this.bookshelfHomes = bookshelfHomes;
    }

    public void setRead(Boolean read) {
        isRead = read;
    }
}
