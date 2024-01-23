package com.yedam.interfaces;

//	인터페이스
public interface DAO {
	int VER = 1;
//	규칙.
	public void insert();
	public void update();
	public void delete();
	public void list();
}
