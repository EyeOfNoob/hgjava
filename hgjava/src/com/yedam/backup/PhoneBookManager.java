package com.yedam.backup;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

// 생성자(초기화), 등록, 검색, 삭제, 종료시(파일저장)
public class PhoneBookManager {

	private File dataFile = new File("c://temp/phonebook.dat");
	// 컬렉션선언.
	HashSet<PhoneInfo> storage = new HashSet<>();

	// 싱글톤.
	private static PhoneBookManager instance; // 초기값: null.

	private PhoneBookManager() {
		// 초기화 작업.
		readFromFile();
	}

	public static PhoneBookManager getInstance() {
		// 인스턴스 값을 반환
		if (instance == null) {
			instance = new PhoneBookManager();
		}
		return instance;
	}

	// 메소드1,2,3
	private PhoneInfo getFriendInfo() {
		System.out.println("이름>>");
		String name = MenuViewer.keyboard.nextLine();
		System.out.println("연락처>>");
		String phone = MenuViewer.keyboard.nextLine();
		return new PhoneInfo(name, phone);
	}

	private PhoneInfo getCompanyFriendInfo() {
		System.out.println("이름>>");
		String name = MenuViewer.keyboard.nextLine();
		System.out.println("연락처>>");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.println("회사>>");
		String company = MenuViewer.keyboard.nextLine();
		return new PhoneCompanyInfo(name, phone, company);
	}

	private PhoneInfo getUnivFriendInfo() {
		System.out.println("이름>>");
		String name = MenuViewer.keyboard.nextLine();
		System.out.println("연락처>>");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.println("전공>>");
		String company = MenuViewer.keyboard.nextLine();
		System.out.println("학년>>");
		int year = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		return new PhoneUnivInfo(name, phone, company, year);
	}

	// 추가.
	public void inputData() {
		System.out.println("구분");
		System.out.println("1.일반 2.회사 3.학교"); // 1번은 두개 2번은 3개 3번은 4개 받음
		System.out.print("선택>> ");
		int choice = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();

		PhoneInfo info = null;

		switch (choice) {
		case InputSelect.NORMAL:
			info = getFriendInfo(); // 변수를 담음
			break;
		case InputSelect.COMPANY:
			info = getCompanyFriendInfo();
			break;
		case InputSelect.UNIV:
			info = getUnivFriendInfo();
			break;
		}

		if (storage.add(info)) {
			System.out.println("등록완료");
		} else {
			System.out.println("등록오류");
		}
	}

	// 삭제.
	public void deleteData() {
		// 이름 검색 후 삭제. Iterator => iter.hasNext, iter.next, itr.remove
		MenuViewer.keyboard.nextLine();
		System.out.println("이름>>");
		String name = MenuViewer.keyboard.nextLine();

		Iterator<PhoneInfo> iter = storage.iterator();
		while (iter.hasNext()) {
			PhoneInfo info = iter.next();
			if (info.getName().equals(name)) {
				iter.remove();
				System.out.println("삭제완료");
				return;
			}
		}

	}

	// 초기화.
	public void readFromFile() {
		if (dataFile.exists() == false) {
			return; // 메소드 종료.
		}
		try {
			// 있으면...파일읽기.
			FileReader fr = new FileReader(dataFile);
			BufferedReader br = new BufferedReader(fr);
			String str = "";
			PhoneInfo info = null;
			while ((str = br.readLine()) != null) {
				String[] record = str.split(",");
				// 컬렉션에 저장.
				int type = Integer.parseInt(record[0]);
				switch (type) {
				case InputSelect.NORMAL:
					info = new PhoneInfo(record[1], record[2]);
					break;
				case InputSelect.COMPANY:
					info = new PhoneCompanyInfo(record[1], record[2], record[3]);
					break;
				case InputSelect.UNIV:
					info = new PhoneUnivInfo(record[1], record[2], record[3], Integer.parseInt(record[4]));
					break;
				}
				storage.add(info);
			} // end of while.

			// 친구에게는 이름 전화번호
			// 회사친구는 이름 전화번호 회사명
			// 학교친구는 이름 전화번호 전공 학년
			// 서로 구별해야해서 친구마다 입력전에 번호 입력받기(1번은 친구 2번은 회사친구 등)
			// 공백 구별대신 콤마로 구별

		} catch (Exception e) {
			e.printStackTrace();
		}
	} // end of readFromFile().
		// 저장.

	public void storeToFile() {
		try {
			FileWriter fr = new FileWriter(dataFile);
			Iterator<PhoneInfo> iter = storage.iterator();

			while (iter.hasNext()) {
				PhoneInfo info = iter.next();
				// toString활용
				fr.write(info.toString() + "\n");
			}
			fr.flush();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
} // end of class.
