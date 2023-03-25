package condition;

import java.util.Scanner;

public class Ifelse3 {
	public static void main(String[] args) {
		int num;
		
		int hak;
		
		int pass;
		
		int year;
		// 1. 20세 이상이면 성인, 14~20세는 청소년, 14세 미만은 어린이로 구분
		
		// 2. 학점 계산(90 이상은 A, 80 이상은 B, 70 이상은 C, 그 미만은 F)
		
		// 3. 비밀번호를 정해놓고 사용자가 비밀번호를 입력해서 맞추면 "비밀번호가 맞습니다"
		// 틀리면 "비밀번호가 다릅니다
		
		// 4. 윤년 판단하기 (년도 입력받아 윤년인지 ㅏㅍㄴ별)
		
		//1
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요.");
		num = sc.nextInt();
		
		if(num >= 20) {
			System.out.println("성인.");
		}else if(num >= 14) {
			System.out.println("청소년.");
		}else if(num < 14) {
			System.out.println("응애");
		}else {
			System.out.println("ㅅ발뭐야.");
		}
		
		//2
		System.out.print("학점을 입력하세요");
		hak = sc.nextInt();
		
		if(hak >= 90) {
			System.out.println("A");
		}else if(hak >= 80) {
			System.out.println("B");
		}else if(hak >= 70) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
		
		//3
		int key = 4796;
		System.out.print("비밀번호를 입력하세요.");
		pass = sc.nextInt();
		
		if(pass == key) {
			System.out.println("비밀번호가 맞았습니다.");
		}else {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		
		//4
		System.out.print("년도를 입력하세요. 윤년을 구해드립니다.");
		year = sc.nextInt();
		
		if(year % 4 == 0) {
			System.out.println("해당 년도는 윤년(2월 29일이 있는 년도)이네요!");
		}else if(year > 9999){
			System.out.println("잘못된 연도입니다.(너무 먼 미래)");
		}else {
			System.out.println("해당 년도는 윤년(2월 29일이 있는 년도)이 아니네요!");
		}
		
		
		sc.close();
	}
}
