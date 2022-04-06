package com.company;

import com.company.books.AudioBook;
import com.company.books.ElectronicBook;
import com.company.books.PaperBook;
import com.company.characters.Admin;
import com.company.characters.Client;
import com.company.characters.Vendor;
import com.company.headsOfProject.Application;
import com.company.headsOfProject.FileInfo;
import com.company.headsOfProject.Book;
import com.company.interfaces.Helper;

import java.time.LocalTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Consumer;

import static com.company.enums.FileType.*;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Application application = new Application();

        FileInfo images = new FileInfo("image1.pnj", "12mb", IMAGE);
        FileInfo images2 = new FileInfo("image2.pnj", "23kb", IMAGE);

        FileInfo images3 = new FileInfo("image1.pnj", "12mb", IMAGE);
        FileInfo images4 = new FileInfo("image2.pnj", "23kb", IMAGE);

        FileInfo images5 = new FileInfo("image1.pnj", "12mb", IMAGE);
        FileInfo images6 = new FileInfo("image2.pnj", "23kb", IMAGE);

        PaperBook paperBook = new PaperBook("This a fragment of paper book", 300, "Book House");
        Book<PaperBook> book1 = new Book<>(paperBook, Set.of(images, images2), "Thinks  we never got over", "LUCY SCORE", 400);

        FileInfo audioFragment = new FileInfo("audioFragment.mp3", "43mb", AUDIO_FILE);
        FileInfo audioFile = new FileInfo("audioFile.mov", "200mb", AUDIO_FILE);

        AudioBook audioBook = new AudioBook(audioFragment, LocalTime.of(13, 23, 14), audioFile);
        Book<AudioBook> book2 = new Book<>(audioBook, Set.of(images3, images4), "Reminders od him", "Colleen Hoover", 600);

        FileInfo format = new FileInfo("electronicBook.pdf", "50mb", PDF);
        ElectronicBook electronicBook = new ElectronicBook("This is a electronic book", 300, "Raritet", format);
        Book<ElectronicBook> book3 = new Book<>(electronicBook, Set.of(images5, images6), "The love Hypothesis", "Ali Hazelwood", 500);

        List<Book<?>> books = new ArrayList<>();

        books.add(book1);
        books.add(book2);
        books.add(book3);


        Vendor vendor = new Vendor("Nargiza", "sultanmuratova500@gmail.com", "0706677560", books, 0);

        Client client = new Client("Nurzhan", "nurzhan@gmail.com", 1000);

        Client client1 = new Client("Dinara", "dinara@gmail.com", 1000);

        Admin admin = new Admin("Beksultan", 0);
        ArrayList<Client> clients = new ArrayList<>();
        clients.add(client);
        clients.add(client1);
//
        while (true) {
            Helper.instruction();
            char choice = scanner.next().charAt(0);

            if (choice == 'q') break;

            if (choice == 'l' || choice == 'L') {

                System.out.println("Likes: ");
                System.out.println("[" + book1.getBookName() + "] " + "has " + book1.getLikes() + " --likes");
                System.out.println("[" + book2.getBookName() + "] " + "has " + book2.getLikes() + " --likes");
                System.out.println("[" + book3.getBookName() + "] " + "has " + book3.getLikes() + " --likes");


            }
            if (choice == 'c' || choice == 'C') {
                System.out.println("Money: ");
                System.out.println("[" + client.getClientName() + "] " + "has " + client.getBalance() + " --money");
                System.out.println("[" + client1.getClientName() + "] " + "has " + client1.getBalance() + " --money");
                System.out.println("[" + vendor.getVendorName() + "] " + "has " + vendor.getBalance() + " --money");
                System.out.println("[" + admin.getName() + "] " + "has " + vendor.getBalance() + " --money");
                System.out.println("===========================================================================");

            }
            if (choice == 't' || choice == 'T') {
                System.out.println(Helper.topBook((ArrayList<Book<?>>) books));

            }
            if (choice == 'b' || choice == 'B') {
                System.out.println(books);

//            }if(choice == 'p' || choice == 'P'){
//                System.out.println("write the number");
//                int numberOfChannel = scanner.nextInt();
//                books.


//        System.out.println("=============================[All Information]========================");
//        System.out.println("Clients: ");
//        System.out.println(clients);
//        System.out.println();
//        System.out.println("Vendor: ");
//        System.out.println("[" + vendor + "]");
//        System.out.println();
//        System.out.println("Admin: ");
//        System.out.println("[" + admin + "]");
//        System.out.println("======================================================================");
//        System.out.println("Likes: ");
//        System.out.println("[" + book1.getBookName() + "] " + "has " + book1.getLikes() + " --likes");
//        System.out.println("[" + book2.getBookName() + "] " + "has " + book2.getLikes() + " --likes");
//        System.out.println("[" + book3.getBookName() + "] " + "has " + book3.getLikes() + " --likes");
//
//        System.out.println("=======================================================================");
//        System.out.println("Money: ");
//        System.out.println("[" + client.getClientName() + "] " + "has " + client.getBalance() + " --money");
//        System.out.println("[" + client1.getClientName() + "] " + "has " + client1.getBalance() + " --money");
//        System.out.println("[" + vendor.getVendorName() + "] " + "has " + vendor.getBalance() + " --money");
//        System.out.println("[" + admin.getName() + "] " + "has " + vendor.getBalance() + " --money");
//        System.out.println("===========================================================================");
//        System.out.println("All books: ");
//        System.out.println(books);
//
//
//        application.like(client1, book2);
//
//        System.out.println("======================================================================");
//        System.out.println("Likes: ");
//        System.out.println("[" + book1.getBookName() + "] " + "has " + book1.getLikes() + " --likes");
//        System.out.println("[" + book2.getBookName() + "] " + "has " + book2.getLikes() + " --likes");
//        System.out.println("[" + book3.getBookName() + "] " + "has " + book3.getLikes() + " --likes");
//        System.out.println("===================Top book=================");
//        System.out.println(Helper.topBook((ArrayList<Book<?>>) books));
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println("===================Client bought a Book=============");
//        application.buyABook(client1, book3, vendor, admin);
//        System.out.println("=======================================================================");
//        System.out.println("Money: ");
//        System.out.println("[" + client.getClientName() + "] " + "has " + client.getBalance() + " --money");
//        System.out.println("[" + client1.getClientName() + "] " + "has " + client1.getBalance() + " --money");
//        System.out.println("[" + vendor.getVendorName() + "] " + "has " + vendor.getBalance() + " --money");
//        System.out.println("[" + admin.getName() + "] " + "has " + admin.getBalance() + " --money");
//        System.out.println("===========================================================================");
//        System.out.println("All books: ");
//        System.out.println(books);
//
//
//    }
}}}}

//}

