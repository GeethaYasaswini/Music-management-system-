package com.vits.entity;

import javax.persistence.*;
@Entity
public class Album {

    public Album() {
		
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long al_id;
    private String title;
    private String artist;

    @ManyToOne
    @JoinColumn(name = "id")
    private Song song;

    @Override
	public String toString() {
		return "Album [id=" + al_id + ", song=" + song + ", title=" + title + ", Artist=" + artist +"]";
	}
	public Album(Long al_id, Song song, String title, String artist) {
		super();
		this.al_id = al_id;
		this.song = song;
		this.title = title;
		this.artist = artist;
	}
	public Long getal_Id() {
		return al_id;
	}
	public void setal_Id(Long id) {
		this.al_id = id;
	}
	public Song getSong() {
		return song;
	}
	public void setSong(Song song) {
		this.song = song;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

}
