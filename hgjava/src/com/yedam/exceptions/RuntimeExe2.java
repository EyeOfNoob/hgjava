package com.yedam.exceptions;

public class RuntimeExe2 {
	public static void main(String[] args) {

//		실행예외.
		String str = "10";

		str = null;
		try {
//		NullPointer 오류 발생
			System.out.println(str.toString());
//		NumberFormat 오류 발생
			int num = Integer.parseInt(str);
		} catch (NullPointerException ne) {
//			오류로그 출력
//			ne.printStackTrace();
			System.out.println("참조값이 없음.");
		} catch (NumberFormatException ne2) {
//			오류로그 출력
//			ne2.printStackTrace();
			System.out.println("숫자값이 아님.");
		} catch (Exception ne2) {
			System.out.println("알수없는 예외.");
		}

		System.out.println("end of prog.");
	}
}
