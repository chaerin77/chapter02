package com.javaex.ex14;

public class ShapeApp {

	public static void main(String[] args) {
		/*
		Shape s01 = new Shape("빨강","빨강");
		System.out.println(s01.toString());
		*/
		
		
		//사각형을 관리할 배열을 만든다
		Rectangle[] rArray = new Rectangle[3];//배열에 미리 담을계획이라 맨위에써줬다고 해보자
		
		//사각형을 만든다
		Rectangle r01 = new Rectangle("빨강","빨강",5,5);//Rectangle두번째생성자 사용, 파라미터 맞춰주기
		//System.out.println(r01.toString());
		
		Rectangle r02 = new Rectangle("노랑","노랑",7,7);
		Rectangle r03 = new Rectangle("파랑","파랑",10,10);

		//사각형을 배열에 넣는다
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r02;
		
		//배열을 순회하면서 출력한다
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		//////////////////////////////////////////////////
		//원
		Circle[] cArray = new Circle[3];
		
		Circle c01 = new Circle("빨강","빨강",5);
		Circle c02 = new Circle("파랑","파랑",10);
		Circle c03 = new Circle("노랑","노랑",15);
		
		cArray[0]=c01;
		cArray[1]=c02;
		cArray[2]=c03;
		
		for(int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
		
		//////////////////////////////////////////////////
		//삼각형
		
		Triangle[] tArray = new Triangle[3];
		
		Triangle t01 = new Triangle("보라","보라",3,3);
		Triangle t02 = new Triangle("주황","주황",6,6);
		Triangle t03 = new Triangle("하늘","하늘",8,8);
		
		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;
		
		for(int i=0; i<tArray.length; i++) {
			tArray[i].draw();
		}
		
		/*설명하려고해본것
		Shape[] sArray = new Shape[9];
		sArray[0] = r01;
		sArray[1] = c01;
		sArray[2] = t01;
	    */   
	}

}
