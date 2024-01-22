package com.yedam.classes;

// 학생번호, 이름, 점수, 키
// 소개(학생번호, 이름, 점수)
public class Student {
//	필드
//	아래와 같이 변수 선언시 private를 추가하면 해당 클래스만 벗어나면 같은 패키지 안에서도 접근이 불가능. 
//	String sno; // null
//	String sname;
//	int score; // 0 
//	double height; // 0.0
	
	private String sno;
	private String sname;
	private int score;
	private double height; 
	private boolean OnSchool;
	
	public boolean isOnSchool() {
			return OnSchool;
	}
	public void setOnSchool(boolean onSchool) {
		OnSchool = onSchool;
	}
	//	this.sno = "S001"; 같은 값을 미리 입력하는 것으로 초기값 지정 가능.
//	초기값이 없을시 각 타입에 따라 null, 0, 0.0등으로 초기값이 지정됨
//	외부 패키지에서 import를 통해 불러서 사용하기위해서 public 추가.
//	패키지 내부에서만 사용될때는 public 생략가능
//	아래와 같이 속성값 지정방식을 미리 정할수도 있고 인스턴스 생성시 지정할수도 있음
//			ㄴ>StudentExe.java파일 참조
//	생성자: 필수요소이므로 필드변수를 생성자 내에 입력하지 않아도 
//		   컴파일러에서 기본 생성자 호출. new Friend()
//	s1 생성
	public Student(){
		
	}
//	s2 생성
	public Student(String no, String name){
		sno = no;
		sname = name;
	}
//	s3 생성
	public Student(String no, String name, int score){
//		아래와 같이 s2 생성시 쓰였던 메소드를 여기서 호출하여 생성하는것도 가능
//		this(no,name);
//		이 경우 아래의 sno = no; , sname = name;은 필요없음. 
		sno = no;
		sname = name;
		this.score = score;
//		매개변수와 필드변수 이름이 둘다 score이므로 생략된 this.를 추가해서 구별
	}
	
//	우클릭 - Source - Generate Constructor using Fields - 원하는 필드변수 선택후 Generate
//	아래와 같이 생성자 자동으로 작성
public Student(String sno, String sname, int score, double height) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.score = score;
		this.height = height;
	}
	//	메소드
	public void showInfo() {
		System.out.printf("번호는 %s, 이름은 %s, 점수는 %d입니다.\n", sno, sname, score);
//		sno는 정확히는 this.sno지만 같은 이름의 변수가 없는경우엔 생략가능.나머지도 마찬가지.
	}
	
	String showInfoStr() {
		return "번호는 " + sno;
	}
		
//	getter/setter(보호받는 필드 변수에 접근하는 메소드)
//	위의 생성자 자동생성과 같이 자동생성 가능.
//	우클릭 - Source - Generate Getters and Setters - 원하는 옵션 선택후 Generate
//	필드 변수가 private로 보호받고있다면 아래와 같이 메소드를 통해 접근하여 입력 가능.
	public void setHeight(double height) {
//	값이 음수로 입력되었을때 초기값이 160으로 설정.
		if(height < 0 ) {
			this.height = 160;
		}else {
			this.height = height;
		}
	}
	
//	위와 동일하게 출력을 위해 값을 받아올때는 다시 메소드를 통해 접근 가능. 
	public double getHeight() {
		return this.height;
	}
	
//	키를 제외한 나머지 요소 접근용 메소드
//	학생번호
	public void setSno(String sno) {
			this.sno = sno;
	}
	public String getSno() {
		return this.sno;
	}
//	이름
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSname() {
		return this.sname;
	}
//	키
	public void setScore(int score) {
		if(score < 0 || score > 100) {
			this.score = 0;
		}else {
			this.score = score;
		}
	}
	public int getScore() {
		return this.score;
	}
	
}


