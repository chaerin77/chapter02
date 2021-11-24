package com.javaex.ex07;

public class TVApp {

 	//필드 없어서
	
	//생성자
	
	//메소드 g/s 얘도 없고
	
	//메소드 일반
	
	public static void main(String[] args) {

		TV tv = new TV(7, 20 , false);
		System.out.println(tv.toString());

		System.out.println("=====================================");
		
		tv.setPower(true); 
		tv.setVolume(120); 
		System.out.println(tv.toString());
		
		System.out.println("=====================================");
		
		tv.volume(false);
		System.out.println(tv.toString());
		
		System.out.println("=====================================");
	
		tv.setChannel(0); 
		System.out.println(tv.toString());

		System.out.println("=====================================");
		
		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		System.out.println(tv.toString());
		
		System.out.println("=====================================");
		
		tv.setPower(false);
		System.out.println(tv.toString());
		
		tv.showInfo();
	}

}
