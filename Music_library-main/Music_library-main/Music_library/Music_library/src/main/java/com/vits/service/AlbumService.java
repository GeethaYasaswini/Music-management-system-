package com.vits.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vits.entity.Album;
import com.vits.repository.AlbumRepository;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public List<Album> getAllAlbums() {
        return albumRepository.findAll();
    }

    public Album getAlbumById(Long id) {
        Optional<Album> album = albumRepository.findById(id);
        return album.orElse(null);
    }

    public Album createAlbum(Album album) {
        return albumRepository.save(album);
    }

    public Album updateAlbum(Long id, Album updatedAlbum) {
        Optional<Album> existingAlbum = albumRepository.findById(id);
        if (existingAlbum.isPresent()) {
            updatedAlbum.setal_Id(id);
            return albumRepository.save(updatedAlbum);
        } else {
            return null;
        }
    }

    public boolean deleteAlbum(Long id) {
        Optional<Album> album = albumRepository.findById(id);
        if (album.isPresent()) {
            albumRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
