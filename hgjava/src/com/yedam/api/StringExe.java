package com.yedam.api;

public class StringExe {
	public static void main(String[] args) {
		String str = "Hello";
		str = new String("Hello");
		str.getBytes();
		byte[] bytes = str.getBytes();
		for (byte b : bytes) {
			System.out.println(b);
		}
		str = new String(new byte[] { 72, 101, 108, 108, 111 });

		int pos = str.indexOf("l");
		System.out.println("l은 " + pos + "위치에 있음.");

		char chr = str.charAt(0);
		System.out.println(chr);

//		for(int i =1;i<27;i++) {
//			System.out.printf("%4d",i);
//		}
//		System.out.println();
////		97~122
//		int countN = 1;
//		String count = "";
//		String apb = "";
//		for (int i = 97; i < 123; i++) {
//			apb = new String(new byte[] { (byte) i });
//			System.out.printf("%4s", apb);
//			count += countN++;
//		}
//		System.out.println();
////		65~90
//		String apb2 = "";
//		for (int i = 65; i < 91; i++) {
//			apb2 = new String(new byte[] { (byte) i });
//			System.out.printf("%4s", apb2);
//		}

	}
}
