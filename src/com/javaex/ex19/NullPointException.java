package com.javaex.ex19;

public class NullPointException {

	public static void main(String[] args) {

		String str = new String("안녕하세요");
	    
		try {
			str=null; //주소를 없애는것 -> 접근할수없게됨 주소가 연결이 안된상태 해결하려고 try catch finall 써줌
		System.out.println(str.toString()); //str.toString해서찍게되어있음
		} catch (Exception e) {
			System.out.println("주소값이 없습니다.");
		}
	    
	}

}
