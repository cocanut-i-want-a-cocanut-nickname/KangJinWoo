package operator;

public class Oper6 {

	public static void main(String[] args) {
		//관계연산자
		// &&, ||, !
		// true 혹은 false에 영향을 줌
		
		// && : and 그리고 (앞 뒤 모두 true)
		System.out.println(2>1 && 2==2);
		
		int 키 = 120;
		int 나이 = 14;
		// 키는 130 이상이고 나이는 13살 이상이어야 한다.
		boolean 참거짓 = 키 >= 130 && 나이 >= 13;//
		// && 기호는 잎과 뒤 모두 맞아야 맞다고 알려줌
		참거짓 = 키 >= 130 || 나이 >= 13; // || : or (혹은), 앞 또는 뒤가 true면 true
		System.out.println(참거짓);
		
		// ! : not (결과 뒤집개)
		System.out.println(!참거짓);
		

	}

}