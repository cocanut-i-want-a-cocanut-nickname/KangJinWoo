package operator;

public class Oper1 {

	public static void main(String[] args) {
		// 프로그래밍은 기본적으로 위에서 아래, 왼에서 오로 진행.
		
		int 숫자1 = 3;	//대입연산자 = : 오른쪽 값을 왼쪽 공간에 담아라
		int 숫자2 = 2;
		System.out.println(숫자1 - 숫자2 * 숫자2);
		System.out.println((숫자1 - 숫자2) * 숫자2);
		
		System.out.println(8/(4/2));
		
		// 지금 자료형이 int 이기때문에 나누기를 한다음 소수점은 삭제된다.
		
		System.out.println(3/2); //(1.5 X/ 1 O)
		
		System.out.println(3/2.0);
	}

}
