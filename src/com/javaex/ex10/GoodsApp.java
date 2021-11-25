package com.javaex.ex10;

public class GoodsApp {

	public static void main(String[] args) {
/*
		int[] intArray = new int[3];
		intArray[0] = 34;
		intArray[1] = 99;
*/		
		
		Goods[]goodsArray =new Goods[3]; 
		//따라가보면 Goods라는 주소. 
	
		/*
		 camera를 메모리에 올려줘야함
		 */
		Goods camera = new Goods("니콘", 400000);
	    
		goodsArray[0] = camera;//여기에다가 0x222를넣어줄것 
	

		Goods cup = new Goods("머그컵", 2000);
		
		goodsArray[1] = cup; //goodsArray1번에다가 cup을 넣은것. 
	
	    Goods computer = new Goods("LG그램", 900000);
	    goodsArray[2] = computer; //computer를 goodsArray[2]에다가 넣은거
	    
	    System.out.println(camera.toString());
	    
	    //이번에는 배열에있는 0x222주소를 이용해 들어가보겠음 0x222 주소지금 goodsArray[0]에 들어가있음
	    System.out.println(goodsArray[0]); 
	
	    /*이렇게 담아놓으면 뭐가 좋을까? 상품이 천개일때 출력어떻게할겨 빼먹는것도있을텐데
	     *  배열 이용해서 for문으로 돌리기
	    */
	    
	    System.out.println("================================");
	     
	     int count = 0; 
	     for(int i=0; i<goodsArray.length; i++) {
	    	 System.out.println(goodsArray[i].toString());
	         count++;
	     }
	      System.out.println(count);
	
	    //이름만 출력하기
	  	for(int i=0; i<goodsArray.length; i++) {
	  	   //if(goodsArray[i] !=null) { 여기에 밑에두줄들어가는거, 공간3개 만들어놨는데 2개만 값을 넣었을경우 주소가 있는 경우에만 출력,count++하겠단얘기 }
	  	   //  System.out.println(goodsArray[i].getName());//이름만필요하니까 getname필요하네 	
	           goodsArray[i].showInfo(); //showInfo에다가 출력어떻게할지 써놨으니까 위랑겹쳐서 위에꺼 막아놧음
	    
	  		
	  	}
	
	}
	

}
