package com.javaex.ex05;

public class Song {

	//필드
	private String title; //거짓말  생성자가 여기 값넣는것까지 하고 사라짐
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	//생성자 default 생성자랑 다른 생성자 하나씩 만들어볼것. 여러개를 만들기때문에 default생성자도 코드로 써줘야함
	
	public Song() {
		
	}
	//getter setter 쓰지 않고..메인에서 s1.setTitle이런거 안쓰고도 데이터값 나오게하려고
	public Song(String title, String artist, String album, String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
		
		
	
	//메소드  - g/s
	
	
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	//메소드 - 일반

	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
	public void showInfo() {
		System.out.println(artist+", "+ title + " ( "+ album + ", "+ year + ", "+ track+"번 track"+ ", "+ composer+" 작곡 )" );
		
	}
	
	
	}

    
