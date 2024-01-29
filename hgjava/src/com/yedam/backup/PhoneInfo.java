package com.yedam.backup;

public class PhoneInfo {
	private String name;
	private String phone;
	
	public PhoneInfo(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public void showPhoneInfo() {
		System.out.println("name: " + name);
		System.out.println("phone: " + phone);
	}
	// getter추가.
	
	@Override
	public String toString() {
		// 1,홍길동,010-1111 
		return InputSelect.NORMAL + "," + name + "," + phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
