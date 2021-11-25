package com.javaex.ex09;

public class MymathApp {
	
	//필드
	
	//생성자 - 디폴트
		
	//메소드 g/s
		
	//메소드 일반
	public static void main(String[] args) {
		
		Mymath.plus(3, 2); //static에 있는 public static int puls(int a,int b) 사용한것
		int sum01 = Mymath.plus(3, 6); //int sum01 -> sum01이라는공간잡힌거에다가 우변꺼를 넣어줄거임
		System.out.println(sum01);
		
		double sum02 = Mymath.plus(4.3, 5.5);
		System.out.println(sum02);
		
		double sum03 = Mymath.plus(5.5, 9);
		System.out.println(sum03);
		
		double sum04 = Mymath.plus(20, 99.9);
		System.out.println(sum04);
		//new Mymath 해서 쓰면 메모리에 올라갔다가 끝나면 바로 없어지는데 static에 올라간건 계속 남아있는다는 단점이있다~
	
		double sum05 = Mymath.circleArea(5);
		System.out.println(sum05);
		
		double sum06 = Mymath.circle(5); //오른쪽먼저쓴담에 이거를 sum06에다 담는데 자료형은 double일거임
		System.out.println(sum06);
		
	/* 기껏 4가지메소드 static에 올려놓고(static머시기로써놓고) new Mymath 하면 이 밑에메소드들 다 메모리에 올려주는 거라 낭비. 올려놓고 new Mymath쓰고있다면 뭔가 이해못한거..
		
		Mymath mymath = new Mymath(); //Mymath클래스를 메모리에 올리고 그안에있는 plus메소드들 사용하려고 Mymath에서 틀만든거니까 써야지
	//클래스명 따라가보면Mymath있을것
    //Mymath() 생성자 호출했으니까 메모리 올리고 생성자역할은끝		 
	
		int sum01 = mymath.plus(3, 6); //sum01이라는 변수에 담으려면 앞에 자료형 써줘야함
		System.out.println(mymath.plus(0, 0) ); //Mymath파일에 써준 순서대로만 써야하는건 아님 위아래있고 그런게 아니고 그냥 저런4가지경우를 만들어준것
		
		double sum02 = mymath.plus(4.3, 5.5);
	    System.out.println(sum02);
	
	    //더블이랑 인트 합쳐서 써야해 더해야할경우가생겼을때.
	    double sum03 = mymath.plus(5.5, 9);
	    System.out.println(sum03);
	
	    double sum04 = mymath.plus(20, 99.9);
	    System.out.println(sum04);
	
	    /*이름을 이렇게 4개나 지어놨어 만약 float도 받아야해 그럼 이름에 float넣고 계속 이름지어야겠지
	     * 그런데 방법이 있음 이걸 같은이름으로 퉁칠수있음 --> 메소드 오버로딩
	     */
	}

}
