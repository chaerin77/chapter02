package com.javaex.ex11;

public class PersonApp {

	//필드
	
	//생성자
	
	//메소드 g/s
	
	//메소드 일반
    public static void main(String[]args) {
    	
   /*person테스트
    *   Person p01 = new Person("정우성",45);
    	
    	Person p02 = new Person();
    	p02.setName("이정재");
    	p02.setAge(46);
    	
    	System.out.println(p01.toString());
    	System.out.println(p02.toString());
    	
    	p01.showInfo();
    	p02.showInfo();   */
    	
    	/*이정재 나이를 만약 잘못찍어서 바꾸고싶어
    	 * p02.setAge(47);
    	 * p02.showinfo(); 하면 바꿀수있음
    	 */
    	
   /*Student가 상속받기전 테스트 	
    	Student s01 = new Student();
    	s01.setSchoolName("서울고");
    	
    	System.out.println(s01.toString()); */
    	
    	
    	
    //Student가 Person 상속받고 테스트
    	Student s01=new Student(); //따라가면Student가 있을것 s01은 내가정한이름, 생성자 실행->메모리에올려
    	s01.setName("강호동");
    	s01.setAge(55);
    	s01.setSchoolName("서울고등학교");
    	
    	System.out.println(s01.getName());
    	System.out.println(s01.getAge());
    	System.out.println(s01.getSchoolName());
    	
    	/*
    	Student s02 = new Student("서장훈", 50, "강남고등학교");
    	Student s03 = new Student("강남고등학교");
    	*/
    	s01.showInfo();
    	System.out.println(s01.toString());
    	
    	Student s02 = new Student("서장훈", 50, "강남고등학교");
    	 /* 우리가 Student한테 메모리올라와 시킨건데 얘가 틀만들다가 부모꺼 완성하고 본인꺼 완료하는순서로되는거임 순서중요.
    	 */
        System.out.println(s02.getName());         
    	s02.showInfo();//학교명은 안나오는이유 부모인person에서 sysout에 학교명 안넣어놨으니까. 넣을수가없음.
    	//그래서 학교명까지 합쳐서 출력하고싶다면 Student에서 출력하는거써줘야함
        s02.showInfo2(); //student 파일에있음
        /*근데 이경우 아예 Student랑 여기 PersonApp에있는 showInfo도 이름을 showInfo로해주면
        Student의 showInfo로 적용됨. 내가 부모인 Person에서 쓴 showInfo가맘에안들어서 새로 Student에 showInfo만든걸로 인식함 */
       
        System.out.println(s02.toString());
    }
}
