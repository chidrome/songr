package com.chidrome1.lab11.Songr.Repositories;

import com.chidrome1.lab11.Songr.Models.Song;
import org.springframework.data.repository.CrudRepository;

// This sets up how Spring will interact with the database to retrieve/save/etc Songs
public interface SongRepository extends CrudRepository<Song, Long> {
}
