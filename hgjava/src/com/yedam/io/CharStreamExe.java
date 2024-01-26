package com.yedam.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharStreamExe {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
//		문자기반 입출력.
		try {
			FileReader fr = new FileReader("c:/temp/text.dat");
			BufferedReader br = new BufferedReader(fr);
			while (true) {
				String read = br.readLine(); // 한라인씩 읽기.
				if(read == null) { // eof(end of file) => null 반환.
					break;
				}
				System.out.println(read);
			}
			br.close();
			fr.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("end of prog.");
	}

//	문자기반 입력
	static void read() {
		Class cls = CharStreamExe.class;
		String path = cls.getResource("ByteStreamExe.class").getPath();
		System.out.println(path);

//		클래스 주소는 bin으로 받아지므로 src로 변경해야함.
//		확장자는 class에서 java로 변경
		path = "D:/git/hgjava/hgjava/src/com/yedam/io/ByteStreamExe.java";
		try {
			FileReader fr = new FileReader(path); // int값 반환.
			while (true) {
				int read = fr.read();
				if (read == -1) {
					break;
				}
				System.out.print((char) read);
			}
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	문자기반 출력(입력받아 출력)
	static void write() {
		try {
			FileWriter fw = new FileWriter("c:/temp/text.dat");
			while (true) {
				System.out.println("입력>> ");
				String str = scn.nextLine();
				if (str.equals("stop")) {
					break;
				}
				fw.write(str + "\n");
			}
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
