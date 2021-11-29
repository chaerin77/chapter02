package com.javaex.ex13;

public class ShapeApp {

	public static void main(String[] args) {

		//메모리가 움직이는 스토리
		
		//사각형 3개를 만든다(메모리에 올린다)
		Rectangle r01 =new Rectangle("빨강","노랑",5,5);
		Rectangle r02 =new Rectangle("파랑","노랑",10,20);
		Rectangle r03 =new Rectangle("빨강","빨강",55,77);

		
		//사각형 관리를 위해서 배열을 만든다
		Rectangle[] rArray = new Rectangle[3];
		
		//사각형을 배열에 넣는다 (주소를 넣는것)
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		//모두 그리시오 (draw 하기)
		for(int i=0; i<rArray.length; i++) {
			
			rArray[i].draw();
		}
		/*	r01.draw();
			r02.draw();
			r03.draw(); */
		
		/*
		//모든 사각형에 선색만 출력
		for(int i=0; i<rArray.length; i++) {
			//아 이럴때 getlinecolor써줘야하는구나 나는 draw같은 메소드 또만드려고했는데 저 틀클래스에 있는 값 갖고오려는건데 그 틀에 접근제한되어있으니까 다른 클래스인 이 실행 클래스에선 get으로 받아오는거
			System.out.println(rArray[i].getLineColor());
		}
		*/
		
		/////////////////////////////////////////////////////////
		
		//원을 관리할 배열
		Circle[] cArray = new Circle[3];
		
		//원 3개를 만들었음
		Circle c01 = new Circle("보라","빨강",15);
		Circle c02 = new Circle("검정","노랑",5);
		Circle c03 = new Circle("파랑","초록",7);
		
		//원을 배열에 넣기
		cArray[0] =c01;
		cArray[1] =c02;
		cArray[2] =c03;
		
		
		//모든 원 그리기
		for(int i=0; i<cArray.length;i++) {
			cArray[i].draw();
		}
		
		///////////////////////////////////////////////////////////
		
		
		//삼각형을 3개 만들었음
		Triangle t1 = new Triangle("초록","주황",3,6);
		Triangle t2 = new Triangle("노랑","연두",7,2);
		Triangle t3 = new Triangle("파랑","보라",10,10);
		
		//삼각형을 관리할 배열
		Triangle[] tArray = new Triangle[3];
		
		tArray[0] =t1; //t1의 주소를 tArray0번방에 넣어준것
		tArray[1] =t2;
		tArray[2] =t3;
		
		for(int i=0; i<tArray.length; i++) {
			tArray[i].draw();
		}
		//도형이 늘어나면 또 좀 문제가.. 틀이 계속늘어나게됨 오각형..팔각형.. 어쩔것인가
		//도형이라고 하는 상위개념을 만들것임 삼각형 사각형 원으로 따로관리하지않고 도형이라는곳에서 관리할것 ->부모 만들것
		
		
	}

}
