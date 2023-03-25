package loop;

public class For1 {
	public static void main(String[] args) {
		// 반복문 : while, or
		// for : while이 가독성이 떨어져서
		
		// 0~9까지 출력 while
		int i = 0;
		while(i<10) {
			// 반복할 코드
			System.out.println("while: ");
			i++;
		}
		// while 단점 : 바깥의 플래그를 만들어줘야함, {}안에서 플래그를 증감, 결론적으로 가독성 떨어짐.
		
		// 0~9까지 출력 for
		// for문 : 플래그 관련 코드는 ()에 몰아버리자 반복할 코드만 {}에 남기자.
		for(int j = 0; j < 10; j++) {
			System.out.println("for: "+j);
		}
		// for(초기값;조건식;증감량){ 반복할 코드; }
		// for문의 장점 : while에 비해 가독성이 좋고 개발이 편리
		// for문의 단점 : while에 비해 자유롭지 못함.
	}

}
