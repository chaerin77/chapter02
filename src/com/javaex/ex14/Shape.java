package com.javaex.ex14;

public class Shape {

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

	
}
