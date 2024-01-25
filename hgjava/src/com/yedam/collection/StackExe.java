package com.yedam.collection;

import java.util.Stack;

public class StackExe {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("홍길동");
		stack.push("김민석");
		stack.push("최만석");
		
		stack.pop();
		while(!stack.isEmpty()) {
			String result = stack.pop();
//			String result = stack.peek(); <- stack에서 제거하지 않으므로 while 조건이 종료되지 않아 무한반복됨.
			System.out.println(result);
		}
		
//		home->product->sell->시점.
		
	}// end of main
}
