package loop;

public class While3 {
	public static void main(String[] args) {
		// while문의 플래그를 활용하여
		// 1~10의 합계를 구해보세요. (정답은 55)
		int sum = 0;
		int i = 1;
		while(i <= 10) {
			// 반복수행할 코드
			sum = sum + i;
			++i;
		}
		System.out.println(sum);
		
		
		
		// 사용자에게 정수값을 입력받아서 
		// 1 ~ 입력값까지 모두 합한 결과를 출력
		// 예를 들어 50을 입력하면 1~50까지 각각 다 더해서 답은 1275가 나와야합니다.
	}

}
