package operator;

public class Oper3 {

	public static void main(String[] args) {
		boolean 참거짓 = true;	// 0
		참거짓 = false;			// 1
		
//		참거짓 = 3 > 2; // true
		System.out.println(참거짓);
		
		참거짓 = 3 < 2; // false
		
		// = : 대입연산자 (오른쪽에 있는 값을 왼쪽에 넣는다)
		// == : 같다(수학에서의 =와 같다.)
		// != : 다르다 (수학에서의 ≠)
		
		참거짓 = 2 == 2;
		System.out.println(참거짓);
		참거짓 = 2 != 2;
		System.out.println(참거짓);
	}

}
