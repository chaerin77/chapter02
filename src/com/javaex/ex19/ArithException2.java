package com.javaex.ex19;

import java.util.Scanner;

public class ArithException2 {
	
	//private double num; //문법적으로 아래꺼랑 다름 처음부터 끝까지 계속 있는것
	public static void main(String[] args) {
		
		//어디서 예외가 생겼는지 따져봐야함 
		double result; 
		int num; 
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		
		try { //1. 이게 발생하는 순간을 try로묶음
			result = 100/num; //0. 담긴0이 들어와서 이걸 계산할때 문제가 생긴것
			System.out.println(result);

		}catch(ArithmeticException e) { //()->정의해놓은 클래스 + 임의로정한 이름 e 따라가보면 Arith머시기가 있을것
		    System.out.println("수학적 오류");//예외 발생하면 오게되는영역 try catch finally 안써줬으면 0쓴순간 오류뜨고 강제종료됨 이걸써줘서 정상적으로 처리되게끔 종료되게끔 해주는것
		}finally {	//예외발생하건 안하건 공통으로 오게되는,처리되는 영역
		    System.out.println("finally영역");
		} 
		
		
		sc.close();
	}

}
