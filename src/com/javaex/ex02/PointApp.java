package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {

		Point p01 = new Point();    //따라가면 포인트라는 클래스가 있을거야 그거 메모리에 땅 찍을겨
		                            //p01이라고 이름지어줌.
		//Point p01 = new Point(3,6); 이라면 -> //Point(2) 이 생성자 사용되었을것
		//p01.setX(3);
		//p01.setY(6);
		//p01.draw();
		//sysout p01.getX() 따라가면Point가 나오는곳을 p01과 p02라는 곳으로 나눠놔야하는데 저건 그냥 place안으로 퉁쳐놓은거네..
	
	    p01.setX(5);
        p01.setY(5);	
	    
	    p01.draw();//파라미터가 point파일에 draw메소드 두개중에 draw() draw(boolean action) 전자에 해당하는거라 점그렸습니다 출력될거임
	    
	    Point p02 = new Point();
	    p02.setX(10);
	    p02.setY(23);
	    p02.draw();
	    //Point p02 = new Point(); // Point()생성자 사용되었을것
	    //p02.setX(10);
	    //p02.setY(23);
	    //sysout p02.draw()
	    
	 /* Point p03 = new Point (100); //Point(1) 생성자 사용되었을것
	    p03.setY(101);
	    p03.draw(); */
	    
	    Point p03 = new Point(55,65);
	    p03.draw(true);
	    p03.draw(false); //괄호 안에 boolean action쓰는거아님..그 결과값을 넣어주는느낌 전자저첢쓰는건 int x쓴거랑똑같음
	    p03.draw(); //메소드 같은이름으로 이런애랑 저 위에 true/false 써준 boolean action얘 이런식으로 여러개를 쓸수있다 오버로딩.
	}

}
