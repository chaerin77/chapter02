package com.javaex.ex15;

public class ShapeApp {

	public static void main(String[] args) {
        
		//도형(Shape, 모든도형)을 관리하는 배열을 만든다.
		Shape[] sArray = new Shape[3];
		//sArray[0]=r01; r01만들어지기 전이라 여기서 쓰면 담을수가 없음
		
		
		Shape r01=new Rectangle("빨강","빨강",5, 5);//부모 자식간이라서 가능한것 rectangle가려질거임
		//s01.getwidth(); shape밖에 안보이는 상태라서 width는 쓸수가 없음
		
		r01.draw();
		//부모와 자식의 메소드가 이름이 같으면 자식의 메소드가 부모의 메소드에 덮어씌워져서 shape의 draw가 아니라 Rectangle의 draw가 실행된다. -오버라이딩
		
		Shape c01=new Circle("노랑","노랑",100);//따라가보면 shape있다고 속일것, 시선이 shape에게 가게됨
		c01.draw();
		
		Shape t01=new Triangle("파랑","파랑",30,30);
		t01.draw();//부모인Shape의 draw는 선색+면색+그렸습니다 까지만 있지만 자식인Triangle에 같은이름의 draw메소드가 있어서 자식의 코드가 부모에게 덮어씌워져 Triangle의 draw가 실행된다.
		
		/*
		Rectangle s011 = new Rectangle("빨강","빨강",5,5);
		s011.getWidth(); 따라가면 rectangle이 있을거라고 해놓으면 이렇게 width도 보이고 height도 보임
	    */
	
		sArray[0]=r01;
		sArray[1]=c01;
		sArray[2]=t01;
		
		for(int i=0; i<sArray.length;i++) {
			sArray[i].draw();
		}
		
		System.out.println(((Circle)c01).getRadius());
		//캐스팅 - 다운캐스팅
		//얘지금 Shape인데 Circle로 임시로 다시 바꿔주는거. 우리 앞에서 형변환할때 (double)써줬던것처럼.
	}
	

}
