package com.company.characters;

import com.company.headsOfProject.Book;

import java.util.List;

public class Vendor {
    private String vendorName;
    private String vendorEmail;
    private String phoneNumber;
    private List<Book<?>> booksToSale;
    private int balance;


    public Vendor(String vendorName,
                  String vendorEmail,
                  String phoneNumber,
                  List<Book<?>> booksToSale, int balance) {
        this.vendorName = vendorName;
        this.vendorEmail = vendorEmail;
        this.phoneNumber = phoneNumber;
        this.booksToSale = booksToSale;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorEmail() {
        return vendorEmail;
    }

    public void setVendorEmail(String vendorEmail) {
        this.vendorEmail = vendorEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public List<Book<?>> getBooksToSale() {
        return booksToSale;
    }

    public void setBooksToSale(List<Book<?>> booksToSale) {
        this.booksToSale = booksToSale;
    }

    @Override
    public String toString() {
        return "\nVendor " +
                "vendorName = " + vendorName +
                "  vendorEmail = " + vendorEmail +
                "  phoneNumber = " + phoneNumber +
                "  booksToSale = " + booksToSale +
                ' ';
    }

    public void delete(Book<?> book) {
        this.booksToSale.remove(book);
    }
    public void plusMoney(Book<?>book){
        this.balance=balance+book.getPrice()/ 100 * 75;
    }
}