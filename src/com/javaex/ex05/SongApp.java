package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {

		Song s1 = new Song();
		s1.setTitle("좋은날");
		s1.setArtist("아이유");
		s1.setAlbum("real");
		s1.setComposer("이민수");
		s1.setTrack(3);
		s1.setYear(2010);
		
		s1.toString();
		s1.showInfo();
		
		Song s2 = new Song( "거짓말", "BiGBANG", "Always", "G-DRAGON", 5,2007); 
		
		s2.showInfo();	
		
		
		Song s3 = new Song();
		s1.setTitle("벚꽃엔딩");
		s1.setArtist("버스커버스커");
		s1.setAlbum("버스커버스커1집");
		s1.setComposer("장범준");
		s1.setTrack(4);
		s1.setYear(2012);
		
		s3.showInfo();
	}

}
