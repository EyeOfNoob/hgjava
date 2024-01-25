package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExe {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("홍길동");
		names.add("김민석");
		names.add("박민석");
//		특정 인덱스에 추가(기존 위치 객체를 뒤로 밀어냄)
		names.add(1, "이만수");
		names.add(1, "이만우");
//		특정 인덱스에 할당(추가가 아니고 할당이므로 기존 객체가 수정되서 대체됨)
		names.add(1, "김만우");
//		특정 인덱스 객체 삭제(추가처럼 뒷번호부터 앞자리로 이동하며 해당 인덱스를 채움)
		names.remove(1);
//		모든 객체 삭제
//		names.clear();

//		통상 배열에서는 names[1]로 호출
//		저장된 객체가 없는경우에 인덱스 호출시 런타임에러 발생
//		System.out.println(names.get(1));

//		런타임 에러를 방지하기위해 try로 예외처리를 하거나 if로 조건부 실행
//		if (names.size() > 2) {
//			System.out.println(names.get(1));
//		}

//		크기확인
		System.out.println(names.size());

//		반복문
		for (String name : names) {
			System.out.println(name);
		}

//		for (int i = 0; i < names.size(); i++) {
//			System.out.println(names.get(i));
//		}

		List<Member> members = new ArrayList<>();
		members.add(new Member(1, "홍길동"));
		members.add(new Member(2, "김민석")); // 4:김길동.
		members.add(new Member(3, "이충희"));
		
		System.out.println(members.toString());
		
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).getName().equals("김민석")) {
				members.set(i, new Member(4, "김길동"));
//				members.get(i).setMid(4);
//				members.get(i).setName("김길동");
			}
		}
		
		System.out.println(members.toString());
		
//		에러
//		members.add("김민석");

		for (int i = 0; i < members.size(); i++) {
			String name = members.get(i).getName();
			int id = members.get(i).getMid();
//			System.out.printf("이름: %s, 아이디 : %d\n", name, id);
			System.out.printf("%s\n", members.get(i).toString());
		}

	}
}
