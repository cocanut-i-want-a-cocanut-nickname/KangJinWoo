package control;

public class Arr3 {
	public static void main(String[] args) {
		// 음식점의 메뉴를 만들어보자 (음식점 - 가격)
		String names[] = {"라면", "김밥", "순대", "떡볶이", "튀김"};
		int prices[] = new int[5];
		
		prices[0] = 3000;
		prices[1] = 2000;
		prices[2] = 4000;
		prices[3] = 3000;
		prices[4] = 3500;
		System.out.println("로동분식 메뉴판");
		
		// 배열 전체 출력 (for문)
		for(int i=0;i<names.length;++i) {
			System.out.println(names[i]+" - "+prices[i]);
		}
	}
}
