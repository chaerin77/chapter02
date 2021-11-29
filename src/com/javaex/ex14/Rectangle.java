package com.javaex.ex14;

public class Rectangle extends Shape {

	//필드
	//private String lineColor;
	//private String fillColor;
	
	private int width;
	private int height;
	
	
	//생성자
	public Rectangle() {
	    super();//Shape 기본생성자 Shape();
	}
	/* 부모를 고려해서 생성자를 만든다*/
	public Rectangle(String lineColor, String fillColor, int width, int height) {
		super(lineColor, fillColor); //생성자 사용한것  부모쪽의 저 파라미터 생성자. 이거 안쓰면 부모쪽의디폴트생성자 사용됨
		this.width = width;
		this.height = height;
	}
	
	
	
	//메소드 g/s
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	//부모쪽에도 같은 메소드가 있다 부모쪽의 메소드 사용 못하게 하려고 이름 "재정의"
	//메소드 일반
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", lineColor=" + lineColor
				+ ", fillColor=" + fillColor + "]";
	} //모쪽에있는 라인컬러. super.lineColor
	
	/*
	public String toString2() {
		return "Rectangle [width=" + width + ", height=" + height + ", getLineColor()=" + getLineColor()
				+ ", getFillColor()=" + getFillColor() + "]";
    	이상태에서 ShapeApp에서 r01.toString 해주면 부모인 Shape의 toString이 나오게됨.여기엔 toString2밖에없으니까.
    	부모의 toString을 쓰고싶지 않으면 자식인 Rectangle의 toString이름을 같게 만들어 주면 됨*/
   
	public void draw() {
		System.out.println("선색:" + super.lineColor + " 면색:" + super.fillColor + " 가로:"+ this.width + " 세로:" + this.height + " 사각형을 그렸습니다.");
	}


}
