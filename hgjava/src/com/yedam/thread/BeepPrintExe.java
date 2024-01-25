package com.yedam.thread;

//import java.awt.Toolkit;

// 소리출력 & 문자출력.
public class BeepPrintExe {
	public static void main(String[] args) {

//		메인쓰레드의 진행과 동시에 실행(멀티쓰레드).
//		Thread thread = new Thread(new BeepTask());
//		쓰레드 병렬처리
		Thread thread = new BeepThread();
		thread.start(); //start 호출하면 run()에 정의된 메소드 실행.
		
//		Toolkit toolkit = Toolkit.getDefaultToolkit();
//		for (int i = 0; i < 5; i++) {
//			toolkit.beep();
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		
//		메인쓰레드가 실행.
		for (int i = 0; i < 5; i++) {
			System.out.println("print");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
