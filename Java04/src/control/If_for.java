package control;

public class If_for {
	public static void main(String[] args) {
		// 조건문 안에 반복문 사용
		int flag = 1;
		
		if(flag != 0) {
			for(int i=1;i<=5;++i) {
				System.out.println("조건문 안에 반복문" + i);
			}
			
			flag = 0;
			
		}
	}
}
