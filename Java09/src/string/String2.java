package string;

public class String2 {
	public static void main(String[] args) {
		MyClass9 mc = new MyClass9();
		// 카페 포스기와 키오스크와 모바일간 통신(보안)
		String order1 = "name=001price=2000type=0";
		System.out.println(mc.info(order1));
	}
}


class MyClass9{
	public String info(String str) {
		// 001: 에스프레소, 002: 아메리카노, 003: 카페라떼, 004: 딸기라떼, 005: 케모마일 티
		
		// price
		
		// type 0 : 뜨거운, 1 : 차가운
		String result = "";
		// 구현
		String name = str.substring(5,8);
		String price = str.substring(14,18);
		String type = str.substring(23,24);
		
		if(name.equals("001")) {
			name = "에스프레소";
		} else if (name.equals("002")) {
			name = "아메리카노";
		} else if (name.equals("003")) {
			name = "카페라떼";
		} else if (name.equals("004")) {
			name = "딸기라떼";
		} else if (name.equals("005")) {
			name = "케모마일티";
		}
		// name이 이름으로 변환되어 있을 것
		
		if (type.equals(1))
		
		
		
		return result;
		
	}
}