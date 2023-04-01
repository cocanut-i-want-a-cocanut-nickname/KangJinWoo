package functon;

public class Function1 {
//	main(){} : main에서도
	//메서드(함수) : 코드를 저장해놓고 사용할때 그 코드들을 실행
	// main 함수에 코딩을 하면 ==> 프로그램 실행시 main 함수 실행
	public static void main(String[] args) {
		System.out.println();
	}
	static void 함수명(int num1, int num2, int num3) {
		// 함수라는 것은 사용자가 직접 만드는 연산자 (코드 저장)
		// 숫자 3개를 한번에 더할 수 있는 연산자로 만들게요.
		// A + B
		// 함수명(A, B, C);
		System.out.println(num1+num2+num3);
	}
}
