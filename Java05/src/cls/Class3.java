package cls;

public class Class3 {
	public static void main(String[] args) {
		Car 아빠 = new Car();
		아빠.주인 = "강호영";
		아빠.차종 = "BMW Z4 Alchemist";
		아빠.색상 = "무광블랙";
		아빠.주인();
	}
}

// class 자동차
// 데이터 : 차주인, 차종, 차색상

class Car{
	// '차량' 클래스
	
	String 주인;
	String 차종;
	String 색상;
	
	// 메서드 == 행위 
	void 주인() {
		System.out.println("이 차량의 주인으로 등록된 사람은 "+주인+"님 입니다.");
	}
	void 차종() {
		System.out.println("이 차량은"+차종+"입니다.");
	}
	void 색상() {
		System.out.println("이 차량의 색은 "+색상+"입니다.");
	}
	
}