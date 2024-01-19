package com.yedam.classes.friend;

// 친구이름, 연락처, 나이: 관리

public class Friend {
	private String fname;
	private String ftell;
	private int fage;
	
	public Friend(String fname, String ftell, int fage) {
		super();
		this.fname = fname;
		this.ftell = ftell;
		this.fage = fage;
	}
	
	void showInfo() {
		System.out.printf("이름 : %s, 전화번호 : %s, 나이: %d\n", fname, ftell, fage);
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFtell() {
		return ftell;
	}

	public void setFtell(String ftell) {
		this.ftell = ftell;
	}

	public int getFage() {
		return fage;
	}

	public void setFage(int fage) {
		this.fage = fage;
	}
	
}
