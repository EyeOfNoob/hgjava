package com.yedam.variable;

public class VariableExe4 {
	public static void main(String[] args) {
		// true/ false.
		boolean isTrue = true; // 10 > 20;
		
		isTrue = update(10);
				
		if(isTrue) {
			System.out.println("참값.");
		}else {
			System.out.println("거짓값.");
		}
		
		// 객체 생성자 '=. Member = 여러 데이터를 담을수 있는 함수(이름이 달라도 대문자로 시작)
		Member m1 = new Member();
		m1.name = "홍길동";
		m1.age = 20;
		m1.height = 167.8;
		
		Member m2 = new Member();
		m2.name = "홍길동";
		m2.age = 20;
		m2.height = 167.8;
		
		isTrue = m1.height > m2.height;
		isTrue = m1.age == m2.age;
		isTrue = m1 == m2;
		
		System.out.println(m1);
		System.out.println(m2);  //m1과 m2의 내용이 같아도 주소값이 다름.
		System.out.println(isTrue);
		
		byte a = 10;
		int b = (int) a;
		//작은 범위의 타입값은 큰값으로 갈때 타입변환이 자동으로 이뤄진다.
		//큰값은 작은값으로 자동변환 되지않으므로 강제로 변환시켜줘야한다.
		
	}	// end of main.
	
	public static boolean update(int arg) {
		return arg % 2 == 0; // arg가 홀수면 f/arg가 짝수면 t 
	}	// end of update.
}	//	end of class.
