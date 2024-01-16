package com.yedam.variable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;


public class VariableExe6 {
	public static void main(String[] args) throws FileNotFoundException {
//		표준입출력 : 키보드, 모니터(System.out).
//		Scanner scn = new Scanner(System.in);
//		Scanner scn = new Scanner(new File("test.txt"));
		
		InputStream is = new FileInputStream("test.txt");
//		D:\git\hgjava\hgjava\test.txt = test.txt
		Scanner scn = new Scanner(is);
		
		String name = scn.nextLine(); 
//		int age = scn.nextInt(); <--텍스트 내용값이 한줄일때 이렇게 추출할수도있지만 타입이 섞이는경우 복잡하게 처리해야함.
		int age = Integer.parseInt(scn.nextLine()); 
//		String phone = scn.NextLine();
		Double height = Double.parseDouble(scn.nextLine()); 
//		나이(int:age), 키(double:height)
//		System.out.println(": " + name);
//		System.out.println(": " + age);
//		System.out.println(": " + height);
		
		scn.close();
		// 이름은 홍길동, 나이는 20세, 키는 178.9 입니다. 
//		System.out.printf("이름은 " + name + ", 나이는 " + age + "키는 " + height + "입니다");
		
		String str = "이름은 %s, 나이는 %d세, 키는 %.2f 입니다 ";
		System.out.printf(str, name, age, height);
	}
}
