package com.yedam.reference;

public class ArrayExe1 {
	public static void main(String[] args) {
//		선언
//		int=정수타입 != int[]=배열타입
//		intAry[0] === int
//		intAry는 int가 아니지만 intAry[0]와 같이 intAry내의 각각의 값들은 int타입이다.
		int[] intAry = {10, 20, 30};
//		intArray[0]은 다중배열이므로 각 위치의 값은 배열이다 따라서 int타입이 아님.
//		intArray[0] === int[], intArry[0] !== int
//		intArray[0][0]의 경우는 배열안 배열의 각 값이므로 int타입이다.
		int[][] intArray= {	{10,20}, {30,40}, {50} };
		
//		크기선언
		String[] strAry = new String[5];
		strAry = new String[] {"Hello","world","Nice"};
		
//		자바스크립트의 for(let A of B)와 같음
		for(String elem : strAry) {
			System.out.println(elem);
		}
	}
}
