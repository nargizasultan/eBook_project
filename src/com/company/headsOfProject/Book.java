package com.company.headsOfProject;

import com.company.exceptions.InvalidNumberOfBookException;
import com.company.headsOfProject.FileInfo;
import com.company.interfaces.BookType;

import java.util.Set;

public class Book <T extends BookType> {
    private Set<FileInfo> images;
    private String bookName;
    private String bookAuthor;
    private int price;
    private int likes;

    private T book;

    public Book(T book, Set<FileInfo> images, String bookName, String bookAuthor, int price) {
        this.book = book;
        this.images = images;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.price = price;
        this.likes = 0;
    }

    public Book() {

    }

    public Set<FileInfo> getImages() {
        return images;
    }

    public void setImages(Set<FileInfo> images) {
        this.images = images;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public T getBook() {
        return book;
    }

    public void setBook(T book) {
        this.book = book;
    }

    public void like() {
        this.likes++;
    }

    public void dislike() {
        this.likes--;
    }
    @Override
    public String toString() {
        return "\nbook : " + bookName;
    }
    public void switchByNumberOfChannel(int a){
        try{
            if(a<1){
                throw new InvalidNumberOfBookException();
            }
            switch (a) {
                case 1 -> {
                    bookName="Thinks  we never got over";

                    System.out.println("Book number: 1");
                    System.out.println("Book name: "+bookName);
                    System.out.println("+==========================+");
                }


                case 2 -> {
                    bookName="Thinks  we never got over";

                    System.out.println("Book number: 2");
                    System.out.println("Book name: "+bookName);
                    System.out.println("+==========================+");
                }
                case 3 -> {
                    bookName="The love Hypothesis";

                    System.out.println("Book number: 3");
                    System.out.println("Book name: "+bookName);
                    System.out.println("+==========================+");
                }

                default -> System.out.println("We could not find book by this number");
            }
        }catch (InvalidNumberOfBookException exception){
            exception.getMessage();
        }
}}