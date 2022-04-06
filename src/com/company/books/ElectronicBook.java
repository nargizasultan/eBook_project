package com.company.books;

import com.company.interfaces.BookType;
import com.company.headsOfProject.FileInfo;

public class ElectronicBook implements BookType {
    private String fragment;
    private int pageSize;
    private String publishingHouse;
    private FileInfo ebook;

    public ElectronicBook() {
    }

    public ElectronicBook(String fragment, int pageSize, String publishingHouse, FileInfo ebook) {
        this.fragment = fragment;
        this.pageSize = pageSize;
        this.publishingHouse = publishingHouse;
        this.ebook = ebook;
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

    public FileInfo getEbook() {
        return ebook;
    }

    public void setEbook(FileInfo ebook) {
        this.ebook = ebook;
    }

    @Override
    public String toString() {
        return "ElectronicBook{" +
                "fragment='" + fragment + '\'' +
                ", pageSize=" + pageSize +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", ebook=" + ebook +
                '}';
    }
}
