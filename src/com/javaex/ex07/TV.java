package com.javaex.ex07;

public class TV {

	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	
	//생성자
	
	public TV() { //이름은 클래스명이랑 동일하게. +오버로딩해서 같은이름이지만 다르게값주기로 사용가능
		
	}
	
	public TV(int channel,int volume, boolean action) {
		this.channel=channel;
		this.volume=volume;
		this.power=power;
	}
	

	//메소드 g/s
	
	
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if(channel>255) {
			channel=255;
			
		}else if(channel<0){
			channel=0;
		}
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if(volume>100) {
			volume=100;
			
		}else if(volume<0){
			volume=0;
		}
		this.volume = volume;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}
	
	

	
	//메소드 일반
	public int channel(int channel ) {
		
		return channel;
	}
	
	public int channel(boolean action) {
		if(action==true) {
			channel++;
		}else {
			channel--;
		}
		setChannel(channel);
		return channel;
		
	}
	
	
	public int volume(boolean action) {
		if(action==true) {
			volume++;
		}else {
			volume--;
		}
		return volume;
	}
	
	
	public boolean power(boolean action) {
		return power;
	}
	

	@Override
	public String toString() {
		return "TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}
	
	public void showInfo() {
		System.out.println("TV의 채널은 "+channel+ " 볼륨은 " + volume + " 전원은 " + power );
	}
	
	
	//tvstatus 채널몇이고 볼륨몇이고 파워어떤상탠지 써주기
    //999넣어도 100으로 정의되도록. 최대값은 100 
	//저렇게 넣어도 잘 작동하는지 보려고 status넣음
	//볼륨은 true면 1씩 올라가는거
}
