package com.javaex.ex04;

public class GoodsApp {

	public static void main(String[] args) {

		//필드 얘는 필드가없셈
		
		//생성자 디폴트생성자
		
		//메소드 - g/s  메소드 이름중에 main이라는 이름갖고있는 메소드하나임 얘도 setName이거 메소드처럼 비슷한 구조임
		
		//메소드 - 일반
		
		Goods camera = new Goods("니콘",400000);
		System.out.println(camera.toString()); //두번째 생성자들어갔음
		
		//이렇게 쓸거면 세터는필요없지않나요? 근데 운영하다보면 가격 50만으로 바꿔야할경우가 있어 setprice가 없으면 가격을 바꿔줄수가 없어
		
		Goods cup = new Goods();
		cup.setName("머그컵");
	    cup.setPrice(2000);
	    System.out.println(cup.toString()); //생성자 Goods()쓴거 맞나 확인하려고
	}

}
