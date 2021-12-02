package com.javaex.ex19;

import java.util.Scanner;

public class ArithException {
	
	//private double num; //문법적으로 아래꺼랑 다름 처음부터 끝까지 계속 있는것
	public static void main(String[] args) {
		
		double result; //메소드 안의 result 변수. {} 가 끝나면 사라지는녀석
		int num; //생각을 하다가 중간에 변수가 필요해서 사용했으면 보통 맨위에다가 변수들을 모아놓음 중간에 껴있으면 어딨는지 모르기때문에 괄호 안에서 생긴게 아니면 모아준다
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		result = 100/num;
		System.out.println(result);
		
		sc.close();
	}

}
