package com.yedam.condition;

public class CalendarExe {
	public static void main(String[] args) {
		
		
		//변수 : 4월달까지출력.
		int month = 1;
		//변수: 월의 1이 위치.
		int pos = 1;
		// 변수 : 월의 마지막날짜.
		int lastDate = 31;
		switch(month) {
		case 1: 
			pos = 1; 
			break;
		case 2: 
			pos = 4;
			break;
		case 3: 
			pos = 5; 
			break;
		case 4: 
			pos = 5; 
			break;
		}
		
		// 수정...월의 변경될때마다 마지막날 계산.
		
		// 1 ~ 31까지 반복.
		String[] days = {"Sun", "Mon", "Tue", "Wed", "Thd", "Fri", "Sat"};
		for(int i =0; i < days.length; i++) {
		System.out.printf("%4s", days[i]);
		}	
		System.out.println();
		System.out.println();
//		System.out.println("  Sun Mon Tue Wed Thd Fri Sat");
//			for(int i =0; i < pos; i++) {
//			System.out.printf("%4s","");
//			}
			System.out.printf("%4s","");
			for(int d = 1; d <= 31; d++) {
			System.out.printf("%4d",d);
			if ((pos+d) % 7 == 0) {
				System.out.println("\n");
			}
		}
		System.out.println("\n\n==========end of prog.==========");
	}// end of main.
}//	end of class.
