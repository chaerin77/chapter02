package com.javaex.ex06;

public class Math {
	
	//필드
	//수학관련된거 만들건데 아무리 생각해도 넣을거 없어 그러면 안넣어도 됨
	
	
	//생성자
	//얘도 초기화하면좋은데 특별히만들거없어서 암것도 안쓰면 -> default사용자 쓰겠다는뜻
	/*
	public Math() {   얘가 안만들어도 생기는 default생성자
		
	} */
	
	//메소드 g/s
	//여기도 필요없어서 생략
	
	
	//메소드 일반
	public int plus(int num01, int num02) {   //plus라고 하는 메소드 하나 만듦 숫자 두개를 받아서-> int num01, int num02
        int sum = num01+num02;
        return sum; //합계를 구하는 
	} 
    public double plus(double num01, double num02) {   //plus라고 하는 메소드 하나 만듦 숫자 두개를 받아서-> int num01, int num02
        double sum = num01+num02;
        return sum;     
	}	
    
    public double plus(int num01, double num02) {
    	double sum= num01 + num02;
    	return sum;
    }
    
    public double plus(double num01, int num02) {
    	double sum= num01+num02;
    	return sum;
    }
}
