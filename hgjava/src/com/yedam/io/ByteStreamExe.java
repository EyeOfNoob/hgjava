package com.yedam.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.IOException;

public class ByteStreamExe {
	public static void main(String[] args) {
//		입력+출력 => 복사.
		try {
			FileInputStream fis = new FileInputStream("c:/temp/mbi.exe");
			FileOutputStream fos = new FileOutputStream("c:/temp/copy2.exe");
//			배열을 생성하여 처리하는 양을 1바이트에서 100바이트로 변경. => 처리속도 향상
//			byte[] byteAry = new byte[100]; 
			
//			보조스트립. Buffered...
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			while (true) {
//				int buf = fis.read(byteAry);
				int buf = bis.read();
				if(buf == -1) {
					break; // buf에서 더이상 읽을 값이 없을때 종료.
				}
//				fos.write(byteAry);
				bos.write(buf);
			}
			bos.flush(); bos.close();
			bis.close();
			fos.flush(); fos.close();
			fis.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end of file");
	}

// 바이트 입력 스트림.
	static void read() {
		try (FileInputStream fis = new FileInputStream("c:/temp/sample.dat")) {
			while (true) {
				int bytes = fis.read(); // eof(end of file) => -1 반환.
				if (bytes == -1) {
					break;
				}
				System.out.println(bytes);
			}
			fis.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	바이트 출력 스트림.
	static void wirte() {
		try {
			FileOutputStream fos = new FileOutputStream("c:/temp/sample.dat");
			fos.write(10);
			fos.write(20);
			fos.write(30);
			fos.flush();
			fos.close(); // 자원환원.

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
