package com.company.headsOfProject;

import com.company.characters.Admin;
import com.company.characters.Client;
import com.company.characters.Vendor;
import com.company.exceptions.AlreadyDislikedException;
import com.company.exceptions.AlreadyLikedException;

public class Application{
    public static void like(Client client, Book<?> book) {
        try {
            if (client.getLikedBooks().contains(book)) {
                throw new AlreadyLikedException();
            }
            client.likedABook(book);
            book.like();
        } catch (AlreadyLikedException exception) {
            String message = String.format("client [%s] already liked book [%s]",
                    client.getClientName(),
                    book.getBookName());
            System.err.println(message);
        }
    }


    public static void dislike(Client client, Book<?> book) {
        try{
            if(client.getDislikedBooks().contains(book)){
                throw new AlreadyDislikedException();
            }
            client.dislikedBook(book);
            book.dislike();
        }catch (AlreadyDislikedException exception){
            String message = String.format("client [%s] already disLiked book [%s]",
                    client.getClientName(),
                    book.getBookName());
            System.err.println(message);

        }


    }

    public static void buyABook(Client client,
                                Book<?> book,
                                Vendor vendor,
                                Admin admin) {
        client.buyABook(book);
        client.decrementBalance(book, client);
        vendor.delete(book);
        admin.incrementBalance(book, admin);
        vendor.plusMoney(book);
    }
}
