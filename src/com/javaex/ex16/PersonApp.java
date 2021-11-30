package com.javaex.ex16;

public class PersonApp {

	public static void main(String[] args) {

		Person p01 = new Person("정우성",45);
		
		p01.showInfo();
		
		
		Student s01 = new Student("이정재", 46, "강남고등학교");
		s01.showInfo(); //재정의 한거 결과 어떻게 나오는지 
		//s01.getSchoolName(); 얘는 이거 됨
		
		
		Person ps01 = new Student("강호동", 50, "마산고등학교");
		//ps01은 임의로 내가 정한 이름  메모리에는 Person,Student가 올라가있지만 Person만 보이는 상태
		// ps01.getSchoolName 얘는 이거 안됨. 자식인 Student는 가려져 있어서 자식의 코드는 사용할수 없다
	    ps01.showInfo(); //이건 자식껄로 나옴 왜지
	    System.out.println(ps01.toString());//얘도..안보이는데 자식껄로 작동했음
	    //이름이 겹치는 애들은 규칙이 또 다르다. 
	    /*Person만 쓸거면 이렇게 섞어쓰기 하지 않았을것. 그냥 Person p01이렇게 객체로만들어서
	     * 올렸으면 그만인데 이렇게 쓴건 .. 부모자식을 둘다 올려서 자식을 가리고 부모만쓰려고해 
	     * 메모리에 올려서 자식(Student)을 가리면 부모만(Person)만 보이게됨 
	     * 부모의 toString과 showInfo가 자식의 toString과 showInfo를 덮어쓰게된거임 그래서 Person의 showInfo,toString을 실행했으나
	     * 자식의 코드로 getSchoolName까지 보이게 된거임   이게 오버라이딩
	     */
	
	}

}
