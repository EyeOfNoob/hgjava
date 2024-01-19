package com.yedam.classes.friend;

import java.util.Scanner;

public class FriendExe {
	public static void main(String[] args) {
//		메뉴: 1.등록 2.목록 3.수정 4.삭제 9.종료
//		사용자의 입력 / 처리결과 콘솔
//		다른기능이 필요한경우
//		로그인 기능.(id,pw,name)
		Scanner scn = new Scanner(System.in);
		
		UserApp uapp = new UserApp();
		
		while(true) {
			System.out.println("id>>> ");
			String id = scn.nextLine();
			System.out.println("pw>>> ");
			String pw = scn.nextLine();
			
//			if(uapp.login(id, pw)) {
//				System.out.println("로그인 성공...");
//				break;
//			}
			User user = uapp.login(id, pw);
			
			if(uapp.login(id, pw) != null) {
				System.out.printf("%s 님, 환영합니다\n", user.getName());
				break;
			}
			
			System.out.println("id와 pw를 확인!!");
		}
		
		FriendApp app = new FriendApp(); 
		boolean run = true;
		
		String fname = "", ftell = "";
		int fage = 0;
		
		while(run) {
			System.out.println("===========M=E=N=U===========");
			System.out.println("1.등록 2.목록 3.수정 4.삭제 9.종료");
			int menu = Integer.parseInt(scn.nextLine());
			
			switch(menu) {
			case 1: //등록
				System.out.println("친구 이름>>> ");
				fname = scn.nextLine();
				System.out.println("친구 전화번호>>> ");
				ftell = scn.nextLine();
				System.out.println("친구 나이>>> ");
				fage = Integer.parseInt(scn.nextLine());
				
				Friend frd = new Friend(fname, ftell, fage);
				
				if(app.add(frd)) {
					System.out.println("==입력완료==");
				}else {
					System.out.println("[알림]입력값에 오류가 있습니다. 다시 확인해주세요.");
				}
				break;
			case 2: //목록조회
				Friend[] list = app.list();
				for(int i=1;i<list.length;i++) {
					if(list[i]!=null) {
						list[i].showInfo();
					}
				}
				System.out.println("==조회완료==");
				break;
			case 3: //수정
				System.out.println("전화번호를 수정할 친구이름 : ");
				fname = scn.nextLine();
				if(app.get(fname) == null) {
					System.out.println("[알림]존재하지 않는 이름입니다. 메뉴선택으로 돌아갑니다.");
					break;
				}
				while(true) {
					System.out.println("수정할 전화번호 : ");
					ftell = scn.nextLine();
					if(ftell.equals("")) {
						System.out.println("[알림]전화번호가 공백으로 입력되었습니다. 다시 입력해주세요.");
						continue;
					}
					break;
				}
				if(app.modify(fname, ftell)) {
					System.out.println("==수정완료==");
				}else {
					System.out.println("[알림]입력 오류입니다. 이름을 확인해주세요.");
				}
				break;
			case 4: //삭제
				System.out.println("삭제할 친구이름 : ");
				fname = scn.nextLine();
				if(app.get(fname) == null) {
					System.out.println("[알림]존재하지 않는 이름입니다. 메뉴선택으로 돌아갑니다.");
					break;
				}
				if(app.remove(fname)) {
					System.out.println("==삭제완료==");
				}else {
					System.out.println("[알림]입력 오류입니다. 이름을 확인해주세요.");
				}
				break;
			case 9: //종료
				run = false;
				System.out.println("==프로그램 종료==");
				break;
			} //end of switch
		}//end of while
		
	}//end of main
}//end of FriendExe
