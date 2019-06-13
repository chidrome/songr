package com.chidrome1.lab11.Songr;

import com.chidrome1.lab11.Songr.Models.Album;
import org.springframework.data.repository.CrudRepository;

// This sets up how Spring will interact with the database to retrieve/save/etc Greetings
public interface AlbumRepository extends CrudRepository<Album, Long> {
}
