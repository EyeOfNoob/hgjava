package com.yedam.collection;

public class Box<T> {
//public class Box {
	T obj;
//	Object obj;
	
	void setObj(T obj) {
//	void setObj(Object obj) {
		this.obj = obj;
	}
	
	T getObj() {
//	Object getObj() {
		return obj;
	}
	
}
