package operator;

public class Oper5 {

	public static void main(String[] args) {
		// 누적연산자
		int num = 3;
		
		num = num;		//좌측에 있는 num과 오른쪽에 있는 num은 다르다.
		
		num = 1+2;
		num = num + 2;
		System.out.println(num);
		
		num += 2;
		System.out.println(num);
		
		num -= 2;
		num *= 2;
		num /= 2;
		num %= 2;
		System.out.println(num);
		
	}
}
