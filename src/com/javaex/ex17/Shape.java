package com.javaex.ex17;

public abstract class Shape {

	//필드
	//protected String lineColor; //자식,상속받은애들은 접근가능하게. 근데 원래private로잘쓰고있던경우 이걸로바꾸면 문제생길수있음
	protected String lineColor;
	protected String fillColor;
	
	//생성자
	public Shape() {
		
	}
	
	public Shape(String lineColor, String fillColor) {
		this.lineColor = lineColor;
		this.fillColor = fillColor;
	}
	
	//메소드 g/s
	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	
	
	//메소드 일반
	@Override
	public String toString() {
		return "Shape [lineColor=" + lineColor + ", fillColor=" + fillColor + "]";
	}

	public void draw() {
		System.out.println("선색: " + lineColor + "면색: " + fillColor + "도형을 그렸습니다.");
	}
	
	//area() 만들지 못함
	public abstract double area();
	//추상메소드가 하나라도 있으면 이 클래스를 메모리에 올리면 안된다
	//오버라이드 되었을때 완성이 되는것. 자식이 완성시켜줘야 완성되는것
}
