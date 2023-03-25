package loop;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		// for문을 통해 구현해보세요!
		
		// 1. 안녕 5번
		for(int hello = 1; hello <= 5; hello++) {
			System.out.println("안녕");
		}
		
		// 2. 1~10까지 합계 구하기
		int sum = 0;
		for(int p = 1; p <= 10; p++) {
			sum = sum + p;
		}
		System.out.println(sum);
		
		// 3. 1~입력값까지 합계 구하기 (예시: 50 => 1~50 = 1275)
		int dan = 0;
		sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("번호를 입력하세요.");
		dan = sc.nextInt();
		for(int g = 1; g <= dan; g++) {
			sum = sum + g;
		}
		System.out.println(sum);
		
	}

}
