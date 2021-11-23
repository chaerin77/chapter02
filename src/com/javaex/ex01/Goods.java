package com.javaex.ex01;

public class Goods { //상품이라는 뜻
	
	//필드
	private String name; 
	private int price; 

	//메소드                          
	public void setName(String n) {  //name
		name = n;       //this.name = name;  메모리에 올라간 다음에 사용될거니깐 틀자체에서 p01.x 이런식으로 써놓으면안됨 this자체가 메모리올라가면 자기들 네모안에있는 필드를 의미하는거.            
	}                               
	
	public String getName() { 
		return name; 
	}
	
	public void setPrice(int p) {  //price
		price = p; //this.price = price;
	}
		
	public int getPrice() {
		return price;
		
	}
	
	public void showInfo() {
		System.out.println("상품명:" + name);
	    System.out.println("가격: " + price);
	    System.out.println("--------------");
	}
	
	
}
