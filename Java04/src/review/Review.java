package review;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int pwd = 1234;
		int user_input = 0;

//		for (int i = 0; i < 5; ++i) {
//			System.out.println("비밀번호를 입력하십시오.");
//			user_input = sc.nextInt();
//			if (user_input == pwd) {
//				System.out.println("맞았습니다!");
//				break;
//			}
//			if (i == 4) {
//				System.out.println("비밀번호를 5회 틀리셨습니다. 접속이 불가힙니다.");
//			}
//		}
		
		
		
		
		// 3. 시험 합격 점수는 국어, 영어, 수학이 각각 40점 이상이고 총점수가 150점 이상이면 합격
		// 40점 이하의 점수가 있으면 과락, 각 과목이 40점 이상이나 총점이 미달이라면 총점 미달.
		
		// 테스트케이스
		// 39, 40, 40 ==> 과락
		// 40, 40, 40 ==> 총점미달
		// 40, 40, 100 ==> 합격
		
		int math = 40;
		int kor = 40;
		int eng = 40;
		
		int sum = math + kor + eng;
		
		if (math < 40 || kor < 40 || eng < 40) {
			System.out.println("과락");
		}else if (math >= 40 || kor >= 40 || eng >= 40) {
			System.out.println("과락 없음 확인.");
			System.out.println("총점 : " + sum);
			if (sum < 150) {
				System.out.println("총점미달");
				}else if (sum >= 150) {
					System.out.println("합격");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
