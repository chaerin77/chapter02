package com.javaex.ex06;

public class MathApp {

	public static void main(String[] args) {

		Math math = new Math();
		//메모리에올려야해. 따라가보면 Math가 있을거야 math이건 임의로 지은 이름  = new Math(); ->디폴트생성자부른거
	
		
		//math.plus(4, 10); 얘 바로출력한게 밑에꺼
	    System.out.println(math.plus(2,3));
	    
	    
	    //3.2+2.7이런값은 지금 .plus써도 안나올거임 왜냐 Math파일(붕어빵틀)에 파라미터가 int num01 이렇게 int라서 실수형표현불가 
	   //메소드 오버로딩을 이용해서 이름이 plus로 같아도 사용가능 - 붕어빵틀Math파일에선 대신 int말고 double로 잘 정의해놓고써야함
	    System.out.println(math.plus(34.2,27.4));
	
	    System.out.println(math.plus(4, 5.6));
	    System.out.println(math.plus(89.2, 5));
	}

}
