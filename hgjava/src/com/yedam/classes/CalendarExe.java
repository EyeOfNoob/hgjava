package com.yedam.classes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExe {
	public static void main(String[] args) {
//		final int num = 10;
//		num = 20;
//		Calendar cal = Calendar.getInstance();
//		cal.set(2024, 1, 1);
//
//		System.out.println(Calendar.YEAR);
//		System.out.println("year: " + cal.get(1));
//		System.out.println("year: " + cal.get(Calendar.YEAR));
//		System.out.println("month: " + (cal.get(Calendar.MONTH) + 1));
//		System.out.println("date: " + cal.get(Calendar.DATE));
//		System.out.println("day of week: " + cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println("last Date: " + cal.getActualMaximum(Calendar.DATE));

//		drawCalendar(2024, 2);
//		System.out.println("==");
//		drawCalendar(2024, 4);

		Date date = new Date(); // 1900년에서 시작
		date.setYear(123);
		date.setMonth(1);

//		2024-10-5
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		try {
			date = sdf.parse("2024-01-01"); // String -> Date
		} catch (Exception e) {
			e.printStackTrace();
		}

//		숙제
		drawCalendar(date);
//		System.out.println(date);
//		date.setDate(32);

//		System.out.println(date.getYear()+1900);
//		System.out.println(date.getDate());
	}

	static void drawCalendar(Date date) {
		int year = date.getYear() + 1900;
		int month = date.getMonth() + 1;

		System.out.printf("\t%d년 %d월 달력\n", year, month);
		System.out.print("Sun Mon Tue Wed Thd Fri Sat\n");
		int startDay = date.getDay();
		int lastDay = 0;
//		int ckMonth = month;
		for (int i = 1; i < 40; i++) {
			date.setDate(i);
			int ckMonth = date.getMonth() + 1;
			if (ckMonth != month) {
				lastDay = i - 1;
				break;
			}
		}
//        if (startDay == 0) {
//            startDay = 7;
//        }
		for (int i = 0; i < startDay; i++) {
			System.out.print("    ");
		}
		for (int i = 1; i <= lastDay; i++) {
			if (i <= lastDay) {
				System.out.printf("%3d ", i);
			}
			if ((startDay + i) % 7 == 0) {
				System.out.println();
			}
		}

	}

	static void drawCalendar(int year, int month) {
//		(2024, 1)
		Calendar cal = Calendar.getInstance();
		int today = 1;
		cal.set(year, month - 1, 1);
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		int startDay = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(cal.getActualMaximum(Calendar.DATE));

		System.out.printf("\t%d년 %d월 달력\n", year, month);
		System.out.print("Sun Mon Tue Wed Thd Fri Sat");

		for (int i = 0; i < lastDay; i++) {
			if (i < startDay) {
				System.out.print("    ");
				lastDay++;
			} else if (i <= lastDay) {
				System.out.printf("%3d ", today);
				today++;
			}
			if (i % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
	
}
