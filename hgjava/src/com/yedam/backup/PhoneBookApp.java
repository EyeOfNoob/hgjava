package com.yedam.backup;

public class PhoneBookApp {

	public static void main(String[] args) {
		PhoneBookManager manager = PhoneBookManager.getInstance();
//		사용자 권한 체크.
//		UserManager => userCheck(아이디,비번)
//		3번 연속으로 인증이 실패할 경우 프로그램 종료.

		int menu = 1;
		while (true) {
			try {
				MenuViewer.showMenu();
				menu = MenuViewer.keyboard.nextInt();

				if (menu < InitMenu.INPUT || menu > InitMenu.EXIT) { // 1보다 적거나 4보다 적으면
					throw new MenuChoiceException(menu); // 생성자 (예외처리를 반드시 해야함)
				}

				if (menu == InitMenu.INPUT) { //
					manager.inputData();
				} else if (menu == InitMenu.SEARCH) {
					System.out.println("검색");
				} else if (menu == InitMenu.DELETE) {
					System.out.println("삭제");
					manager.deleteData();
				} else if (menu == InitMenu.EXIT) {
					System.out.println("종료");
					manager.storeToFile(); // 폰북 매니저에있는 storeToFile()
					break;
				}
			} catch (MenuChoiceException e) {
				e.showWrongChoice();
			}
		}

		System.out.println("end of prog.");
	}

}
