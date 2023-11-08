package com.vits.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vits.entity.Song;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
    // You can add custom queries here if needed
}
