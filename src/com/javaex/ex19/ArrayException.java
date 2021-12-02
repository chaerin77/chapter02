package com.javaex.ex19;

public class ArrayException {

	public static void main(String[] args) {

		//방이3개까지있는데 4번방가서시킬때 발생하는상황 실험
		/*
		int[] intArray=new int[3];
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9; */
		
		int[] intArray = new int[] {3,6,9};
		
		try {
			System.out.println(intArray[3]);//에러남
		/*부모인 Exception
		}catch(Exception e) {
			System.out.println(e.toString());*/
		}catch(ArithmeticException e) {
			System.out.println(e.toString());//주소가들어오면 toString을찾아서 출력하라는 println이가진
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}finally {
			System.out.println("finally 영역");
		}
	}

}
