package com.chidrome1.lab11.Songr.Controllers;

import com.chidrome1.lab11.Songr.Models.Album;
import com.chidrome1.lab11.Songr.Models.Song;
import com.chidrome1.lab11.Songr.Repositories.AlbumRepository;
import com.chidrome1.lab11.Songr.Repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ShowSongsController {

    @Autowired
    SongRepository songRepository;
    @Autowired
    AlbumRepository AlbumRepository;


    @GetMapping("/albums/{id}")
    public String getAlbumSong(@PathVariable long id, Model m){
        Album theAlbum = AlbumRepository.findById(id).get();
//        Iterable<Song> songs = theAlbum.getSongs();
//        m.addAttribute("songs", songs);
        m.addAttribute("album", theAlbum);
        m.addAttribute("addSong", new Song());
        return "songs";
    }

    @PostMapping("/albums/{id}")
    public String songSubmit(@RequestParam String title, @RequestParam long length, short trackNumber, @PathVariable long id){
        Album a = AlbumRepository.findById(id).get();
        Song newSong = new Song(title, length, trackNumber, a);
        songRepository.save(newSong);
        return "redirect:/albums/{id}";
    }

}
