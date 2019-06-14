package com.chidrome1.lab11.Songr.Repositories;

import com.chidrome1.lab11.Songr.Models.Album;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

// This sets up how Spring will interact with the database to retrieve/save/etc Albums
public interface AlbumRepository extends CrudRepository<Album, Long> {
}
