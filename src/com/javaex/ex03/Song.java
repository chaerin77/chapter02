package com.javaex.ex03;

public class Song {

	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private String track;
	
	//생성자
	
	
	//메소드
	public void setTilte(String title) {
		this.title = title;
	}

    public String getTitle() {
    	return title;
    }
    
    public void setArtist(String artist) {
    	this.artist = artist;
    }
    
    public String getArtist() {
    	return artist;
    }

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getTrack() {
		return track;
	}

	public void setTrack(String track) {
		this.track = track;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public void showInfo() {
		System.out.println(artist+", "+title+" ( "+album+", "+year+", "+track+"번 track, "+composer+" 작곡 )");
	}

	@Override //alt shift s - generate toString
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
	
	



}  
