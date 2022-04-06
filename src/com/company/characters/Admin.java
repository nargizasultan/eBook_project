package com.company.characters;

import com.company.headsOfProject.Book;

public class Admin {
    private final String name;
    private int balance;

    public Admin(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public void incrementBalance(Book<?> book, Admin admin){
        this.balance=balance+book.getPrice()/ 100 * 15;
    }

    @Override
    public String toString() {
        return "\nAdmin{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
