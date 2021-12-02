package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {
		//내가 왜 이난리 폈는지 생각 - 원래 shape로 잘 묶여있던애들이 point가 낌으로써 하나의 단위로 부르기엔 무리가 생겨서 새로운 묶음 만들어주기로-Drawable
     
		Drawable[] dArray = new Drawable[4];
		
		/*
		Point p01 = new Point(5,7); 
		p01.draw();
		System.out.println(p01.getX());
		
		Drawable p02 = new Point(114,117);//메모리엔 부모자식다올렸는데 Drawable밖에없다고 속인것
	    p02.draw();
	    //p02.get머시기 안보임 가려져있어서. 임시적으로 풀려면 형변환하기
	    ((Point)p02).getX();//다운캐스팅 해서 사용하면 됨*/
		
		/*
		Drawable r01 = new Rectangle("빨강","빨강",5,7);
		r01.draw();
		System.out.println(((Rectangle)r01).getWidth());
		System.out.println(((Rectangle)r01).getHeight());*/
		
		Drawable r01 = new Rectangle("빨강","빨강",5,7);
		Drawable c01 = new Circle("파랑","파랑",12);
		Drawable t01 = new Triangle("노랑","노랑",22,55);
		Drawable p01 = new Point(1,1);
		
		dArray[0]=r01;
		dArray[1]=c01;
		dArray[2]=t01;
		dArray[3]=p01;
		
		//그리기
		for(int i=0; i<dArray.length; i++) {
            dArray[i].draw();
		}
		
		
		//면적출력
		for(int i=0; i<dArray.length; i++) {
			//((Shape)dArray[i]).area();//Point는 Shape에 없어서 이거 오류남
		  if(dArray[i] instanceof Shape) { //dArray[i]->지금주소. 가 Shape틀에서 태어난 애냐?
			  System.out.println(((Shape)dArray[i]).area());
		  }
		}
	}
	

}
