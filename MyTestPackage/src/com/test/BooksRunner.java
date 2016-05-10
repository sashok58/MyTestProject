package com.test;


import java.util.ArrayList;
import java.util.List;

import static com.test.Utils.getDate;
import static com.test.Utils.getTime;

public class BooksRunner {
    public static void main(String[] args) {
        List<Books> books = new ArrayList<>();
        books.add(new Books(0, "Azbuka", "ya", "Hz", getTime("dd.mm.yyyy", "14.04.2014"), 100, 20, "Obichnoye"));
        books.add(new Books(0, "Voyna i mir", "Kiev", "Hz", getTime("dd.mm.yyyy", "14.04.2010"), 150, 20, "Tverdoe"));
        books.add(new Books(0, "Alfavit", "Odessa", "Hz", getTime("dd.mm.yyyy", "14.04.1985"), 300, 20, "Obichnoye"));

        for (Books book : BooksUtils.findByAuthor(books,"ya")) {
            System.out.println("book = " + book);
        }

        for (Books book : BooksUtils.findByPublishingHouse(books, "Hz")) {
            System.out.println("book = " + book);
        }

        for (Books book : BooksUtils.findByYearPublishing(books, getTime("dd.mm.yyyy","14.01.1986"))) {
            System.out.println("book = " + book);
        }
    }
}
