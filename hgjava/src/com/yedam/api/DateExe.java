package com.yedam.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExe {
	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today.toGMTString());
		System.out.println(today.toLocaleString());

//		원하는 양식으로 시간데이터 표시
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//		Date -> String
		System.out.println(sdf.format(today));
//		String -> Date
		try {
			today = sdf.parse("2020/01/05 12:12:12");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(today);

		Date now = new Date();
		System.out.println(today.after(now));
		System.out.println(today.before(now));
		
//		LocalDate, LocalTime, LocalDateTime
		LocalDate ld = LocalDate.now();
		System.out.println(ld.toString());
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt.toString());
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt.toString());
		
//		원하는 양식으로 시간데이터 표시
		String result = ldt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		System.out.println(result);

	}// end of main
}
