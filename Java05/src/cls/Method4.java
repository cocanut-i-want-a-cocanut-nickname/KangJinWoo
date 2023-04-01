package cls;

public class Method4 {
	public static void main(String[] args) {
		// 객체화
		MyClass5 mc5 = new MyClass5();
		mc5.메서드1();
		mc5.메서드1();
		System.out.println("끼어들기");
		mc5.메서드1();
		
		// 입력값O, 반환값X
		mc5.메서드2("안녕하세요", "감사해요.");
		
		// 반환값이 있으면 변수로 담는 형태로 사용한다
		// 메서드3이 String으로 반환해주기 때문에
		String result3 = mc5.메서드3();
		System.out.println(result3);
		
		// 입력값O, 반환값O
		// () 안을 채워줘야하고, 반환값을 받을 변수를 만들어야한다
		// 메서드4는 int형태로 반환하고, 입력값은 실수1개
		int result4 = mc5.메서드4(3.7);
		System.out.println(result4);
	}
}

class MyClass5{
	// 메서드1 : 반환값X, 입력값X (오로지 코드 저장, 가독성
	void 메서드1() {
		// 입력값이 없으면 ()를 비워놓습니다.
		
		int num = 1;
		System.out.println("나는 메서드"+num+"에 저장된 코드다");
	}
	
	// 코드 재활용 (입력되는 값만 변경하면서 재활용)
	void 메서드2(String str1, String str2) {
		System.out.println("소괄호로 넘어오는 값만 변경"+str1+str2);
		System.out.println("코드 재활용"+str2);
	}
	
	String 메서드3() {
		String result = "반갑습니다.";
		System.out.println("메서드3을 사용!");
		
		return result;
	}
	
	int 메서드4(double dnum) {
		System.out.println("실수 자료형을 반올림 합니다");
		double result = dnum - (int)dnum;
		if(dnum >= 0.5) {
			dnum += 1;
		}
		
		return (int)dnum;
	}
}

