package com.javaex.ex01;

public class Goods { //상품이라는 뜻
	
	//필드
	private String name; 
	private int price; 

	//메소드                          
	public void setName(String n) {  //name
		name = n;       //this.name = name;  메모리에 올라간 다음에 사용될거니깐 틀자체에서 p01.x 이런식으로 써놓으면안됨 this자체가 메모리올라가면 자기들 네모안에있는 필드를 의미하는거. 아주편하네            
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
	
	//필드에 값을 넣고 읽어오는애
	//point에서는 setx getx sety gety  보통 필드 하나당 두개씩생겨 값 넣고 읽어오고
	//게터 세터 라고 부름 getter setter    인스턴스=객체?? 인스턴스가 힙의하얀네모 ,, 직접접근못하게함 private 우리가원하는범위의값. 
	
}
