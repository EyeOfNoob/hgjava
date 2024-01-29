package com.yedam.backup;

// 사용자메뉴를 비정상적으로 처리.
public class MenuChoiceException extends Exception { // Runtime가 없으면 예외처리 안해도됨
	int wrongChoice;

	public MenuChoiceException(int wrongChoice) {
		super("없는 메뉴번호입니다");
		this.wrongChoice = wrongChoice;
	}

	public void showWrongChoice() {
		System.out.println(wrongChoice + "는 없는 메뉴번호입니다.");

	}
}
