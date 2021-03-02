package timeJava;

import java.time.*;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//현재 날짜를 저장하는 객체 생성 (컴파일 실행 순간의 날짜 저장 2021-03-02)
		LocalDate date = LocalDate.now(); 
			System.out.println(date);
		
		//현재 시간을 저장하는 객체 (컴파일할 때의 시간이 저장된다 00:00:00.000)
		LocalTime time = LocalTime.now();
			System.out.println(time);
		
		//현재 날짜와 시간을 저장하는 객체를 생성 (2021-03-02T21:41:16.459 T)
		LocalDateTime dateTime = LocalDateTime.now();
			System.out.println(dateTime);
		
		//지정한 날짜를 저장하는 객체 생성
		LocalDate birth = LocalDate.of(1995,01,23);
			System.out.println(birth);
		
		//지정한 시간을 저장하는 객체 생성
		LocalTime studytime = LocalTime.of(22, 0,0);
			System.out.println(studytime);
	
		//날짜 비교 .isAfter(), .isBefore(), isEqual()
		LocalDate date1 = LocalDate.of(2020,01,01);
		LocalDate date2 = LocalDate.of(2020,01,02);
		
		//date1이 지난 후 date2가 출력되기 때문에 comparison2의 값이 true가 출력된다.
		boolean comparison1 = date1.isAfter(date2);
		boolean comparison2 = date1.isBefore(date2);
		boolean comparison3 = date1.isEqual(date2);
		
		System.out.println(comparison1);
		System.out.println(comparison2);
		System.out.println(comparison3);
		
	}
	
	
	
	

}
