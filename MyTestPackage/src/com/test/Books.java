package com.test;


import static com.test.Utils.getDate;

public class Books {
    private int id;
    private String name;
    private String authors;
    private String publishingHouse;
    private long yearOfPublishing;
    private int countOfPages;
    private long price;
    private String bindingType;


    public Books(int id, String name, String authors, String publishingHouse, long yearOfPublishing, int countOfPages, long price, String bindingType) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.countOfPages = countOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public long getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(long yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authors='" + authors + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", yearOfPublishing=" + getDate(yearOfPublishing, "dd.mm.yyyy") +
                ", countOfPages=" + countOfPages +
                ", price=" + price +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }
}
