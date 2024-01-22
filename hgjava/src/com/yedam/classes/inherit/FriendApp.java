package com.yedam.classes.inherit;

// 친구정보저장, 조회, 수정, 삭제
public class FriendApp {
	private Friend[] friends;

	public FriendApp() {
		friends = new Friend[10];
	}

//	CRUD
//	등록
	public boolean add(Friend frd) {
		for (int i = 1; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = frd;
				return true;
			}
		}
		return false;
	}

//	목록 조회(이름(name)으로 검색)
	private int idx = 0;

	public Friend[] list(String name) {
		Friend[] list = new Friend[10];
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				if (name == "") {
					return friends;
				} else if (friends[i].getFname().equals(name)) {
					list[idx++] = friends[i];
				}
			}
		}
		return list;
	}

//	단건 조회(전화번호(phone)로 검색)
	public Friend getFriend(String phone) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				if (friends[i].getPhone().equals(phone)) {
					return friends[i];
				}
			}
		}
		return null;
	}

//	수정	(전화번호 - 회사:회사,부서 / 학교:학교,전공)
	public boolean modify(String phone, String info1, String info2) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				if (friends[i].getPhone().equals(phone)) {
					friends[i].changeInfo(info1, info2);
					return true;
				}
			}
		}
		return false;
	}

//	삭제
	public boolean remove(String phone) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				if (friends[i].getPhone().equals(phone)) {
					friends[i] = null;
					return true;
				}
			}
		}
		return false;
	}
}
