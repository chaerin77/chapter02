package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) { //시나리오. 메인메소드의 내용대로 메모리가 움직인다. 출력언제하고 값은 언제넣을지등..

		Goods camera = new Goods(); //틀에 반죽뿌린상태에서 set 팥이고 get 슈크림
		
		camera.setName("니콘"); //셋네임에 니콘이란 값을 넣어준건가?  셋네임을 통해서 굿즈클래스안에있는 name이라는필드의 니콘이라는값을넣어준거
		//String cameraName = camera.getName(); //읽은걸바로출력
		camera.setPrice(400000);
		camera.showInfo();
		
	/*	System.out.println("상품이름 : "+camera.getName());
		System.out.println("가격 :" + camera.getPrice()); //getName 해주면값읽어왔으면좋겠어
		System.out.println("\n");
		
		camera.setName("LG그램");
		camera.setPrice(900000);
		
		System.out.println("상품이름 : "+ camera.getName());
		System.out.println("가격 :" + camera.getPrice());
		System.out.println("\n");
		
		camera.setName("머그컵");
		camera.setPrice(2000);
		
		System.out.println("상품이름 : " + camera.getName());
		System.out.println("가격 :" + camera.getPrice());  */
		
		Goods computer = new Goods();
	//따라가보면goods있지
   //name이 computer에도 camera에도 머그컵에도 name이 다 있어 나는 computer에있는거쓸거야 그러니까
		computer.setName("LG그램");
		computer.setPrice(900000);
		
		computer.showInfo();
		
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		
		cup.showInfo();
		
/*	    camera.name="니콘";
	    camera.price = 400000;
	    
	    Goods computer = new Goods();
	    computer.name = "LG그램";
	    computer.price = 900000;
	    
	    
	    Goods cup = new Goods();
	    /*따라가보면 Goods가 있을거야*/
/*	    cup.name="머그컵";
	    cup.price=20000;
	    
	    
	    
	    System.out.println(camera.name);
	    System.out.println(camera.price);
	    
	    System.out.println(computer.name);
	    System.out.println(computer.price);*/
	   	}

}
