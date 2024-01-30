package com.yedam.phonebook;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class MediaThread extends Thread {
	@Override
	public void run() {
		while(true)	{
			File file =new File("c:/temp/example.wav");
			try {
//				Audio 입력스트림 생성.
				AudioInputStream ais = AudioSystem.getAudioInputStream(file);
//				실행할 clip 획득
				Clip clip = AudioSystem.getClip();
				clip.open(ais); // 스트림을 clip 메소드의 open에 전달.
				clip.start(); // 미디어 실행.
				System.out.println("음악재생 시작.");
//				일시정지 호출을 해야 실행이 됨.
				Thread.sleep(clip.getMicrosecondLength() / 1000);
			}catch (Exception e){
//				예외는 미디어 실행을 중단하기 위한 조건.
//				e.printStackTrace();
				System.out.println("음악재생 종료.");
				break;
			}
		} //end of while
	}//end of run
}//end of MediaThread
