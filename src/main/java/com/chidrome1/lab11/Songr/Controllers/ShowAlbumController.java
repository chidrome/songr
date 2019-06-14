package com.chidrome1.lab11.Songr.Controllers;

import com.chidrome1.lab11.Songr.Repositories.AlbumRepository;
import com.chidrome1.lab11.Songr.Models.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ShowAlbumController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/albums")
    public String getAllAlbums(Model m) {
        m.addAttribute("newAlbum", new Album());

        Iterable<Album> albums = albumRepository.findAll();
        m.addAttribute("albums", albums);
        return "albums";
    }

    @PostMapping("/albums")
    public String albumSubmit(@ModelAttribute Album addAlbum) {
        albumRepository.save(addAlbum);
        return "redirect:/albums";
    }

}
