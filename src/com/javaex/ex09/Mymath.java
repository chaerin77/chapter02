package com.javaex.ex09;

public class Mymath {
	
	//필드 -- 필요x
	private static double PI = 3.14159; //공통으로 쓸거면 필드값을 static으로 선언해줘야한다~
	
	//생성자 -- 디폴트생성자 자동으로생길거라 안써줌
	
	//메소드 g/s -- 필드없어서 g/s도없음
	
	//메소드 일반
	public static int plus(int a, int b) {
	/*	int sum = a+b;
		return sum;*/
		return a+b; //합을 구할거니까 위에것처럼 써도되지만 변수설정안하고 바로 이렇게써도 됨
	}
	
	public static double plus(double a, double b) {
	/*	double sum = a+b;
		return sum;*/
		return a+b;
	}
	
	public static double plus(double a, int b) {
	/*	double sum = a+b; // 3.5+3.0 -->자동형변환
		return sum;  */
		
		return a+b;
	}

	public static double plus(int a, double b) {
		
		return a+b;
	}

	
	public static double circleArea(int radius) {
	//static으로 안써준경우 또 new로 만들어줘야함	
		return radius*radius*PI; //원의 넓이는
	    
	}
	
	public static double circle(int radius) {
		return (radius+radius)*PI;
	}
/*메소드 오버로딩 쓰기전에 이름하나하나 지정해서 썼었지만 메소드명이같아도 파라미터가 다르면 이름을 하나하나 지정해주지않아도 된다
	public int plusInt(int a, int b) {
		/*	int sum = a+b;
			return sum;
			return a+b; //합을 구할거니까 위에것처럼 써도되지만 변수설정안하고 바로 이렇게 써도 됨
		}
		
		public double plusDouble(double a, double b) {
		/*	double sum = a+b;
			return sum;
			return a+b;
		}
		
		public double plusDooubleInt(double a, int b) {
		/*	double sum = a+b; // 3.5+3.0 -->자동형변환
			return sum;  
			
			return a+b;
		}

		public double plusIntDouble(int a, double b) {
			
			return a+b;  
		}  */
}
