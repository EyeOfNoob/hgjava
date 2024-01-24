package com.yedam.api;

public class StringTest {
	public static void main(String[] args) {
//		1번 문제의 데이터
		String[] jumins = { "970101-1234567", "970101-2234567", 
				"9701011234567", "970101 1234567", "030101 4234567" };
//		, "030101 1234567"};
//		남여남남여/오

		for (String ssn : jumins) {
//			System.out.println(ssn);
			checkGender(ssn);
//			char chr = ssn.charAt(7);
//			System.out.println(chr);
		}

//		2번 문제의 데이터 길동이라는 이름이 몇번 나오는지?
		String[] names = { "김길동", "홍길동", "이상민", "김민수", "길동이" };
		int count = 0;
		for(String gildong : names) {
			String cutName = gildong.substring(1); 
//			System.out.println(cutName);
			int index = cutName.indexOf("길동");
			if(index != -1) {
				count++;
			}
		}
		System.out.println("길동이라는 이름이 나오는 횟수는 " + count + "회 입니다.");

	}// end of main.
	
	
	static void checkGender(String ssn) {
		if (ssn.length() == 14) {
			char chr = ssn.charAt(7);
			if (chr == '1' || chr == '3') {
				System.out.println("남자입니다.");
			} else if (chr == '2' || chr == '4') {
				System.out.println("여자입니다.");
			}
		}else if(ssn.length() == 13) {
			char chr = ssn.charAt(6);
			if (chr == '1' || chr == '3') {
				System.out.println("남자입니다.");
			} else if (chr == '2' || chr == '4') {
				System.out.println("여자입니다.");
			}
		}
	}// end of checkGender.

}// end of class.
