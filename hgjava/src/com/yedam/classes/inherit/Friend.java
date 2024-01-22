package com.yedam.classes.inherit;

import lombok.Data;

// 이름, 연락처 (Friend)
// 이름, 연락처, 학교, 전공 (UnivFriend)
// 이름, 연락처, 회사, 부서	(CompFriend)

//@Data - Ctrl+space - lombok 
@Data
//extends Object는 기본설정이므로 생략가능
public class Friend extends Object {
	private String fname;
	private String phone;

	public void changeInfo(String info1, String info2) {
		return;
	}

	@Override
	public String toString() {
		return "이름은 " + fname + ", 연락처는 " + phone;
	}
}
