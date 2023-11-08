package com.vits.entity;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Song {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String title;
	    private String artist;
	  
	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String gettitle() {
			return title;
		}

		public void settitle(String title) {
			this.title = title;
		}

		public String getartist() {
			return artist;
		}

		public void setartist(String artist) {
			this.artist = artist;
		}

		

	    public Song() {
			
		}

		public Song(Long id, String title, String artist) {
			super();
			this.id = id;
			this.title = title;
			this.artist = artist;
		}

		@OneToMany(mappedBy = "song")
		
	    private Set<Album> albums;

	    // Constructors, getters, setters, and other fields as needed

	    // Constructors, getters, setters, and other methods can be added here
	}
