package com.company.books;

import com.company.interfaces.BookType;
import com.company.headsOfProject.FileInfo;

import java.time.LocalTime;

public class AudioBook implements BookType {
    private FileInfo fragment;
    private LocalTime duration;
    private FileInfo audioFile;

    public AudioBook() {
    }

    public AudioBook(FileInfo fragment, LocalTime duration, FileInfo audioFile) {
        this.fragment = fragment;
        this.duration = duration;
        this.audioFile = audioFile;
    }

    public FileInfo getFragment() {
        return fragment;
    }

    public void setFragment(FileInfo fragment) {
        this.fragment = fragment;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    public FileInfo getAudioFile() {
        return audioFile;
    }

    public void setAudioFile(FileInfo audioFile) {
        this.audioFile = audioFile;
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "fragment=" + fragment +
                ", duration=" + duration +
                ", audioFile=" + audioFile +
                '}';
    }
}
