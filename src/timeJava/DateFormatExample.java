package timeJava;

//SimpleDateFormat을 사용하기 위해선 java.text.SimpleDateForamt을 import시켜야 한다.
import java.text.SimpleDateFormat;
//Date 객체 사용시 필요
import java.util.Date;


public class DateFormatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date today = new Date();
		//format 객체를 지정함에 따라 원하는 형식으로 날짜를 출력할 수 있다.
		SimpleDateFormat format1, format2, format3, format4;
		
		
		format1 = new SimpleDateFormat("yyyy-MM-dd");
		format2 = new SimpleDateFormat("yy/MM/dd");
		format3 = new SimpleDateFormat("오늘은 yyyy년의 w주차이며 D번째 날입니다.");
		format4 = new SimpleDateFormat("현재시각 HH:mm:ss 입니다.");
		
		System.out.println(today);
		System.out.println(format1.format(today));
		System.out.println(format2.format(today));
		System.out.println(format3.format(today));	
		System.out.println(format4.format(today));
	}

}
