package com.vits.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vits.entity.Album;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {
    // You can add custom queries here if needed
}
