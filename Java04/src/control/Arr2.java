package control;

public class Arr2 {
	public static void main(String[] args) {
		// 배열
		// 하나의 주제로 여러 변수를 뭉치기 위해 만듦
		
		// 카페에서 커피메뉴를 전시해야한다
		String menu1 = "에스프레소";
		
		// 일반 변수로 나열했을때의 문제점
		// 1. 메뉴가 총 몇개인지 바로 알 수 없음
		// 2. 전체 출력이 불가능(메뉴 전시를 하려면 일일히 다 적어줘야함, 왜냐하면 반복문 사용이 안되기 때문이다.)
		
		// ==> 같은 주제로 이루어진 변수들은 '배열' 이라는 문법을 통해서'변수를 나열'을 한다.
		
		String menus[] = {"에스프레소", "아메리카노", "카페라떼", "오렌지주스"};
		
		int arr_size = menus.length;
		System.out.println("메뉴의 총갯수: "+arr_size);
		
		for(int i=0;i<menus.length;++i) {
			System.out.println(menus[i]);
		}
		
		// 첫번째 메뉴를 보고 싶다 ==> 0번방을 출력
		// 변수명[번호]
		System.out.println("=="+menus[0]+"==");
		
		menu1 = "일반변수 바꾸기";
		menus[0] = "배열요소 바꾸기";
		
		System.out.println("=="+menus[0]+"==");
		
		//배열을 만들고 값을 채워넣고 싶다
		int nums[];
		nums = new int[3]; 
		
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		
	}
}
