package com.vits.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vits.entity.Song;
import com.vits.repository.SongRepository;

@Service
public class SongService {

    @Autowired
    private SongRepository songRepository;

    public List<Song> getAllSongs() {
        return songRepository.findAll();
    }

    public Song getSongById(Long id) {
        Optional<Song> song = songRepository.findById(id);
        return song.orElse(null);
    }

    public Song createSong(Song song) {
        return songRepository.save(song);
    }

    public Song updateSong(Long id, Song updatedSong) {
        Optional<Song> existingSong = songRepository.findById(id);
        if (existingSong.isPresent()) {
            updatedSong.setId(id);
            return songRepository.save(updatedSong);
        } else {
            return null;
        }
    }

    public boolean deleteSong(Long id) {
        Optional<Song> song = songRepository.findById(id);
        if (song.isPresent()) {
            songRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
