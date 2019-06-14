package com.chidrome1.lab11.Songr.Models;

import javax.persistence.*;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @ManyToOne
    Album album;

    String title;
    long length;
    short trackNumber;

    public Song(){}

    public Song(String title, long length, short trackNumber, Album album){
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
        this.album = album;
    }

    // getters
    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public long getLength() {
        return length;
    }

    public short getTrackNumber() {
        return trackNumber;
    }


    // setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public void setTrackNumber(short trackNumber) {
        this.trackNumber = trackNumber;
    }

}
