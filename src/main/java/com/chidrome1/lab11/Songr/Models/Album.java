package com.chidrome1.lab11.Songr.Models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// title
// artist
// songCount
// length(in seconds)
// imageUrl

// Album model
@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String title;
    String artist;
    short songCount;
    long length;
    String imageUrl;

    public Album(){}
    public Album(String title, String artist, short songCount, long length, String imageUrl){
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

    // getters
    public String getTitle() {
        return this.title;
    }

    public String getArtist() {
        return this.artist;
    }

    public short getSongCount() {
        return this.songCount;
    }

    public long getLength() {
        return this.length;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    // setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setSongCount(short songCount) {
        this.songCount = songCount;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


}
