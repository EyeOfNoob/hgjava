package com.yedam.phonebook;

import java.io.File;
import java.util.HashSet;

public class UserManager {
	private String id;
	private String password;
	
	private File userFile = new File("c://temp/userList.dat");
	HashSet<UserManager> storage = new HashSet<>();
	
//	private String name;

	public void userCheck() {
		int ckCt = 0;
		for(int i=0; i<3; i++) {
			System.out.println("아이디>>");
			id = MenuViewer.keyboard.nextLine();
			System.out.println("비번>>");
			password = MenuViewer.keyboard.nextLine();
			
		}
//		System.out.println("1.로그인 2.아이디생성");
//		int menu = MenuViewer.keyboard.nextInt();
//		switch (menu) {
//		case 1:
//			로그인기능
//			break;
//		case 2:
//			아이디생성기능
//			break;
//		default:
//			break;
//		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	public UserManager() {
		System.out.println("사용하실 아이디>>");
		id = MenuViewer.keyboard.nextLine();
		System.out.println("사용하실 비번>>");
		password = MenuViewer.keyboard.nextLine();
//		System.out.println("사용자 명>>");
//		name = MenuViewer.keyboard.nextLine();

		UserManager User = new UserManager(id, password);
//		UserManager User = new UserManager(id, password, name);
	}

//	private UserManager(String id, String password, String name) {
	private UserManager(String id, String password) {
		super();
		this.id = id;
		this.password = password;
//		this.name = name;
	}

}
