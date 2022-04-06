package com.company.characters;

import com.company.headsOfProject.Application;
import com.company.headsOfProject.Book;

import java.util.HashSet;
import java.util.Set;

public class Client extends Application {
    private String clientName;
    private String clientEmail;
    private int balance;
    private Set<Book<?>> likedBooks;
    private Set<Book<?>> dislikedBooks;
    private Set<Book<?>> purchasedBooks;

    public Client(String clientName,
                  String clientEmail, int balance) {
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.likedBooks =new HashSet<>();
        this.purchasedBooks =new HashSet<>();
        this.balance=balance;
        this.dislikedBooks=likedBooks;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public Set<Book<?>> getLikedBooks() {
        return likedBooks;
    }

    public void setLikedBooks(Set<Book<?>> likedBooks) {
        this.likedBooks = likedBooks;
    }

    public Set<Book<?>> getPurchasedBooks() {
        return purchasedBooks;
    }

    public Set<Book<?>> getDislikedBooks() {
        return dislikedBooks;
    }

    public void setDislikedBooks(Set<Book<?>> dislikedBooks) {
        this.dislikedBooks = dislikedBooks;
    }

    public void setPurchasedBooks(Set<Book<?>> purchasedBooks) {
        this.purchasedBooks = purchasedBooks;
    }

    public void likedABook(Book<?> book) {
        this.likedBooks.add(book);
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void dislikedBook(Book<?> book) {
        this.likedBooks.remove(book);
        this.dislikedBooks.add(book);
    }

    public void buyABook(Book<?> book) {
        this.purchasedBooks.add(book);
    }
    public void decrementBalance(Book<?>book, Client client){
        this.balance=balance-book.getPrice();
    }

    @Override
    public String toString() {
        return "\nClient{" +
                "clientName='" + clientName + '\'' +
                ", clientEmail='" + clientEmail + '\'' +
                ", likedBooks=" + likedBooks +
                ", purchasedBooks=" + purchasedBooks +
                '}';
    }
}
