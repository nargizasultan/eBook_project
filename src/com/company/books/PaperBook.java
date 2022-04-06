package com.company.books;

import com.company.interfaces.BookType;

public class PaperBook implements BookType {
    private String fragment;
    private int pageSize;
    private String publishingHouse;

    public PaperBook() {
    }

    public PaperBook(String fragment, int pageSize, String publishingHouse) {
        this.fragment = fragment;
        this.pageSize = pageSize;
        this.publishingHouse = publishingHouse;
    }

    public String getFragment() {
        return fragment;
    }

    public void setFragment(String fragment) {
        this.fragment = fragment;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "fragment='" + fragment + '\'' +
                ", pageSize=" + pageSize +
                ", publishingHouse='" + publishingHouse + '\'' +
                '}';
    }
}
