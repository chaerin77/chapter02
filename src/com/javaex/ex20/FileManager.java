package com.javaex.ex20;

import java.io.IOException; //이거 불러와야 오류안틈

public class FileManager {

	//필드
	
	//생성자
	//public FileManager() {} 안만들어도 자동적으로 있는 디폴트 생성자
	
	//메소드 g/s
	
	//메소드 일반
    public void readFile() throws IOException{ //실행하면 우리가 정한 특정파일을 읽어오는 메소드라고 가정
   //throws IOException 해주면 밑에 try안써줘도 됨  
    	//System.out.println("파일을 읽었습니다.");
    	
    	/*
    	try {
    		System.out.println("강제예외상황발생");
        	throw new IOException(); //파일을 못읽었을 때 예외 발생/ 파일이 없으면 이런 오류가 발생한다고 가정한것
    	} catch (IOException e) {
    		System.out.println("파일이 없습니다.");
    	}*/
    	
    	System.out.println("강제예외상황발생");
    	throw new IOException(); //파일을 못읽었을 때 예외 발생
    }
	
}
