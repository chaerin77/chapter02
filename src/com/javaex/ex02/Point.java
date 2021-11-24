package com.javaex.ex02;

public class Point {  //틀부터 만들기
	
	//필드
	private int x; //x
    private int y; //y
    
    //생성자
    public Point() {
    	//메인업무 -> 해당클래스를 메모리에 올리는 일
        System.out.println("Point()");
    }
    
    public Point(int x) {
    	//해당클래스를 메모리에 올리는 일
        this.x = x;
        System.out.println("Point(1)");
    }
    
    /*public Point(int y){
           바로 위에 있는애랑 컴터가 구별을 못해 구조가 똑같아서. 
           만약 자료형이라도 달랐다면 다르게인식함 순서가 바뀌거나. 변수이름만으로는 구분을 못하고 같은걸로 보는거야
           원하는걸 다 만들순 없고 컴터가 안헷갈리게 만들어줘야한다~
    }  */
    
    
    public Point(int x, int y) {
    	this.x = x;
    	this.y = y;
    	System.out.println("Point(2)");
    }
    
    //메소드
    public void setX(int x) { //접근할수있어야하니까 public. x y값 넣어줘야하는데 위에서 막아놨으니까 setX를 통해 저 필드에 있는 intX에 값을 넣어줄거임  int n이렇게썼었는데  d일단 저기써진걸로치면(int x) 메인에서 setX에3을 넣으면(p01.setX(3);) 여기서 x에3이들어가는거고 이 밑에서 우변이3이되고 그3을 좌변의x에대입하는게되는데
    	                      //지금 의도한대로안됨    int xx로바꾸기
    	this.x=x;    //x=x 이거하니까 오류나와서 우변 xx라고 바꿈. 저 위에필드값은x고..   x=xx;로써야함. x=x; 오류나오는이유 다 x로써있으니까 얘가 저x인지 저x인지 헷갈려서그럼 그래서 다른이름으로 지정해줘야함
    }
    
    public int getX() {
    	return x; //x
    }
    
    public void setY(int y) {//int yy
    	this.y = y; //y = yy
    }
    
    public int getY() {
    	return y;  //y
    }
    
    
    
    
    public void draw() {
    	System.out.println("점[x=" +x+","+" y=" +y+"]을 그렸습니다.");
    	               //            x               y
    }
    //action 에 true가 오면 그리는기능, action에 false가 오면 지우는 기능 action=true면 위에꺼랑 똑같이 실행
    public void draw(boolean action) {
    	if(action == true) {
    		System.out.println("점[x=" +x+","+" y=" +y+"]을 그렸습니다.");
    	}else if(action==false) {
    		System.out.println("점[x=" +x+","+" y=" +y+"]을 지웠습니다.");
    	}else {
    		System.out.println("잘못된 입력"); //else if로 끝나는거 좀 찝찝해서 써준것뿐. 얘는 이상태로는 오른쪽에 출력될수가없음 () 안에 ture/false써있는게 아니라서
    	}
    	
    } //오버로딩. 같은이름으로 여러개사용가능 여기서 이름은draw
}
