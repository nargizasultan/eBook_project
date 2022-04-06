package com.company.interfaces;

import com.company.headsOfProject.Book;

import java.util.ArrayList;
import java.util.Collections;

public interface Helper {
    static Book<?> topBook(ArrayList<Book<?>> list) {
        Book<?> maximum = null;
        for (Book<?> book : list) {
            if (maximum == null) {
                maximum = book;
                continue;
            }
            if (maximum != null) {
                if (maximum.getLikes() < book.getLikes()) {
                    maximum = book;
                }
            }

        }
        return maximum;
    }

    static void instruction() {
        System.out.println("                      INSTRUCTION                     ");
        System.out.println("+=======================================================+");

        System.out.println("Enter (b)  to see books ");
        System.out.println("Enter (l)  to see likes of the books ");
        System.out.println("Enter (c)  to see the cash of characters");
        System.out.println("Enter (t)  to see a top book");
        System.out.println("Enter (p) to buy a exact book");
        System.out.println("+=======================================================+");
    }

    static void likes() {
    }
}
