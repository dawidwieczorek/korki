package com.korki.lesson3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Console {

    private static final Map<String, Author> authors = new HashMap<String, Author>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose option...");
            System.out.println("1. Add author");
            System.out.println("2. Add book to author");
            System.out.println("3. Print info about the authors");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            scanner.nextLine();

            if (choice == 1) {
                System.out.println("Type in name of the author...");
                if(scanner.hasNext()) {
                    String next = scanner.nextLine();
                    authors.put(next, new Author(next));
                }
            } else if (choice == 2) {
                System.out.println("Type in name of the author...");
                String authorName = scanner.nextLine();
                Author author = authors.get(authorName);
                System.out.println("Now type in name of the book...");
                String bookName = scanner.nextLine();
                author.getBooks().add(bookName);
            } else if (choice == 3) {
                System.out.println(authors);
            } else if (choice == 4) {
                System.exit(0);
            } else {
                System.out.println("Nice try, pick one of the options\n\n");
            }
        }

    }
}
