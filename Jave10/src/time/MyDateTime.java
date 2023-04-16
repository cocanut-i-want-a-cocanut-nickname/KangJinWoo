package time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDateTime {
	public static void main(String[] args) {
		MyTime mt = new MyTime();
		
//		System.out.println(mt.dateTime());
//		System.out.println(mt.date());
//		System.out.println(mt.time());
//		System.out.println(mt.tomorrow());
//		System.out.println(mt.minute30());
		
		// static 으로 물려놓으면
	}
}

// 클래스
class MyTime{
	// 자바 코드로 현재 시간을 가져오는 법
	// Calendar, date, SimpleDateFormat, String
	
	// 멤버변수
	private String str;
	
	// 메서드
	public String dateTime() {
		Calendar cal = Calendar.getInstance();		//객체화
		Date date = cal.getTime();			// 시간을 가져옴
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일"); 	
		str = sdf.format(date);
		return str;
	}
	
	public String date() {
		// 년.월.일 변환
		Calendar cal = Calendar.getInstance();		//객체화
		Date date = cal.getTime();			// 시간을 가져옴
		SimpleDateFormat sdf = new SimpleDateFormat("yy년.MM월.dd일"); 	
		str = sdf.format(date);
		return str;
	}
	
	public String time() {
		Calendar cal = Calendar.getInstance();		//객체화
		Date date = cal.getTime();			// 시간을 가져옴
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss"); 	
		str = sdf.format(date);
		return str;
	}
	
	public String tomorrow() {
		Calendar cal = Calendar.getInstance();		//객체화
		Date date = cal.getTime();			// 시간을 가져옴
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd");
		SimpleDateFormat sdf4 = new SimpleDateFormat("HH");
		SimpleDateFormat sdf5 = new SimpleDateFormat("mm");
		SimpleDateFormat sdf6 = new SimpleDateFormat("ss");
		
		
		String year = sdf1.format(date);
		String month = sdf2.format(date);
		String day = sdf3.format(date);
		String Hour = sdf4.format(date);
		String Minute = sdf5.format(date);
		String second = sdf6.format(date);
		
		str = year + "년-" + month + "월-" + (Integer.parseInt(day)+1) + "일 " + (Integer.parseInt(Hour)+1) + "시:" + Minute + "분:" + second + "초";
		
		return str;
	}
	
	public String minute30() {
		Calendar cal = Calendar.getInstance();		//객체화
		Date date = cal.getTime();			// 시간을 가져옴
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd");
		SimpleDateFormat sdf4 = new SimpleDateFormat("HH");
		SimpleDateFormat sdf5 = new SimpleDateFormat("mm");
		SimpleDateFormat sdf6 = new SimpleDateFormat("ss");
		
		
		String year = sdf1.format(date);
		String month = sdf2.format(date);
		String day = sdf3.format(date);
		String Hour = sdf4.format(date);
		String Minute = sdf5.format(date);
		String second = sdf6.format(date);
		
		str = year + "년-" + month + "월-" + day + "일 " + Hour + "시:" + (Integer.parseInt(Minute)+30) + "분:" + second + "초";
		
		return str;
	}
}