package com.javaex.ex04;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	//생성자
	public Goods() {
	    //메모리에 올리는 작업
		//생성자 하나만 만들거면 이거 안만들어도 딱히 상관없는데 여러개 만들거면 얘도 이렇게 코드로 써줘야함
	    System.out.println("Goods()");
	}
	
	
	public Goods(String name, int price) {
		//메모리에 올리는 작업
	    this.name = name;
	    this.price = price;
	    System.out.println("Goods(String name, int price)"); //어떤 생성자 썼는지 알아보려고 넣어준거임
	}
	/*생성자도 자동으로 만들어주는거 있음 
	 * alt shift s - generate constructor using field- default생성자로 만들고싶으면 체크해제
	   다 체크해놓고 generate -> super는무시하고 지워버리면됨*/
	
	//메소드  g/s


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	
	//메소드 일반  서비스할때 예쁘게 보이게하려구넣는거랑+ 작업하다가 데이터 잘들어갔나 확인용 tostring

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
}
