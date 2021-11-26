package com.javaex.ex11;

public class Student extends Person{ //자식임 부모꺼 갖고올거임 -->extends Person
	
	//필드
	private String schoolName;
	
	//생성자
	public Student() {
		//메모리에 올리는 일
		System.out.println("Student()");
	}
	
	public Student(String schoolName) {
		this.schoolName=schoolName;
	    System.out.println("Student(1)");
	}

	public Student(String name, int age, String schoolName) {
		/*
		super.name=name;//name,age 마음대로쓸순있지만 부모쪽에 있는거기때문에 super를사용해줌
		super.age=age;
		*/
		
		//부모생성자 실행 - 안써줘도 이거 실행된거임
		//super(); ->부모쪽에 있는 생성자 뜻하는것 얘가 디폴트생성자 super() 이거자체가 생성자
		super(name,age); 
		super.setName(name);
		super.setAge(age);
		this.schoolName=schoolName;
		System.out.println("Student(3)"); //실행되는순서 실험해보려고만들어준거
		
	}
	
	//메소드 g/s
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	
	//메소드 일반
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + ", name=" + name + ", age=" + age + "]";
	}
	public void showInfo2() {
		System.out.println("***************************");
		System.out.println("이름: "+super.name);
		System.out.println("나이: "+super.age);
	    System.out.println("학교: "+this.schoolName);//이게 부모인person에없어서 여기서 얘까지 더해서써준거임 person에선 schoolName출력못시킴 값이없음 받는곳도없고
	    System.out.println("***************************");
	    System.out.println("");
	}

}
