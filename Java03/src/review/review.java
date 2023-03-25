package review;

import java.util.Scanner;

public class review {
	public static void main(String[] args) {
		// if문
		// if ~ else if ~ else
		// 조건이 맞으면 실행, 조건이 틀리면 무시
		// if(){} : ()에는 조건식을, {}에는 코드를 넣는다
		
		// 예제 : 버스카드 (20세 이상이면 성인입니다. 1200원 결제됨, 14세~19세면 청소년입니다 700원
		// 13세 이하면 400원)
		
		int age = 19;
		int money = 0;
		
		if(age > 19) {
			// 나이가 19보다 크면 실행할 코드
			System.out.println("성인입니다.");
			money = 1200;
		}else if(age > 13) {
			// 나이가 19보다는 크지않고 13보다는 크면 실행할 코드
			System.out.println("청소년입니다.");
			money = 700;
		}else {
			System.out.println("어린이 입니다.");
			money = 400;
		}
		
		System.out.println(money+"원");
		
		// 윤년 구하기
		
		int year = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요");
		year = sc.nextInt();
		if((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
			System.out.println("윤년 입니다.");
		}else {
			System.out.println("윤년이 아니거나, 잘못된 숫자를 입력했을수도 있습니다.");
		}
		
		sc.close();
	}
}
