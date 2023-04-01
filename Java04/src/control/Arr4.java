package control;

import java.util.Scanner;

public class Arr4 {
	public static void main(String[] args) {
		// 국가의 수도 (5개)
		/*
		 * 대한민국의 수도는 서울입니다.
		 * 일본의 수도는 도쿄입니다
		 * 중국의 수도는 베이징입니다.
		 * 미국의 수도는 워싱턴입니다.
		 * 러시아의 수도는 모스크바입니다.
		 */
		
//		String country[] = {"대한민국", "일본", "중국", "미국", "러시아"};
//		String capital[] = new String[5];
//		
//		capital[0] = "서울";
//		capital[1] = "도쿄";
//		capital[2] = "베이징";
//		capital[3] = "워싱턴";
//		capital[4] = "모스크바";
		
		
		// 사용자 입력으로 국가를 받아서 해당 국가의 수도를 알려주는 프로그램을 만들어보세요.
//		수도를 찾을 국가의 이름을 입력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		String search = "";
		
		String country[] = {"대한민국", "일본", "중국", "미국", "러시아"};
		String capital[] = new String[5];
		
		capital[0] = "서울";
		capital[1] = "도쿄";
		capital[2] = "베이징";
		capital[3] = "워싱턴";
		capital[4] = "모스크바";

		for(int i=0;i<country.length;++i) {
			System.out.println(country[i]+"의 수도는 "+capital[i]+"입니다.");
		}
		
		System.out.println("수도를 찾을 국가의 이름을 입력하세요.");
		search = sc.nextLine();
	
		int index = 0;
		
		for (int i = 0; i < country.length; ++i) {
            if (search.equals(country[i])) {
                System.out.println(country[i] + "의 수도는 " + capital[i] + "입니다.");
                return;
            }
        }

        // 배열에 나라 이름이 없으면 메시지 출력
        System.out.println("입력한 나라 이름이 배열에 없습니다.");
		}
	}

