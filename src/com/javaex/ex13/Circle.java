package com.javaex.ex13;

public class Circle {

	//필드
	private String lineColor;
	private String fillColor;
	private int raidus;
	
	//생성자
	public Circle() {
	}

	
	//메소드 g/s
	public Circle(String lineColor, String fillColor, int raidus) {
		super();
		this.lineColor = lineColor;
		this.fillColor = fillColor;
		this.raidus = raidus;
	}

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

	public int getRaidus() {
		return raidus;
	}

	public void setRaidus(int raidus) {
		this.raidus = raidus;
	}


	//메소드 일반
	
	@Override
	public String toString() {
		return "Circle [lineColor=" + lineColor + ", fillColor=" + fillColor + ", raidus=" + raidus + "]";
	}
	
	public void draw() {
		System.out.println("선색:" + lineColor + "면색:" + fillColor + "반지름:" + raidus); //radius스펠링잘못썼음
	}

	
	
}
