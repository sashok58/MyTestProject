package com.test;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BooksUtils {
    public static List<Books> findByAuthor(List<Books> books, String author) {
        List<Books> result = new ArrayList<>();
        for (Books book : books) {
            if (Objects.equals(book.getAuthors(), author)) {
                result.add(book);
            }
        }
        return result;
    }

    public static List<Books> findByPublishingHouse(List<Books> books, String publishingHouse) {
        List<Books> result = new ArrayList<>();
        for (Books book : books) {
            if (Objects.equals(book.getPublishingHouse(), publishingHouse)) {
                result.add(book);
            }
        }
        return result;
    }

    public static List<Books> findByYearPublishing(List<Books> books, long yearOfPublishing) {
        List<Books> result = new ArrayList<>();
        for (Books book : books) {
            if (book.getYearOfPublishing() > yearOfPublishing) {
                result.add(book);
            }
        }
        return result;
    }
}
