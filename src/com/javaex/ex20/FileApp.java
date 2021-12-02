package com.javaex.ex20;

import java.io.IOException;//ctrl shift o 연결해주기

public class FileApp { //사용하는곳에서도 처리 해주는 상황이 있을수있다 

	public static void main(String[] args) {

		FileManager fr = new FileManager();
		
		try {
			fr.readFile();
		} catch (IOException e) {
			System.out.println("error");
		}
		
	}

}
