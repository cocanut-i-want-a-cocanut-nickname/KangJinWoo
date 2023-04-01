package cls;

public class Method1 {
	public static void main(String[] args) {
		int result = 3+4;
		
		MyClass4 mc4 = new MyClass4();
		
//		int err = 3+;
	}
}

	// 메서드 : 클래스 안에 있는 함수,

class MyClass4{
	// 메서드 : 클래스 안에 있는 함수, this를 갖고있음
	// 메서드를 만든 이유 : 함수에 포인터 사용을 생략하기 위해서
	
	int 더하기(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
}