package control;

public class If_if {
	public static void main(String[] args) {
		// 제어문은 중첩해서 사용할 수 있음
		// if안에 if, if안에 for, fo안에 if, for안에 for
		int i=0;
		int j=0;
		
		if(i < 0) {
			if(j < 0) {
				System.out.println("i는 0보다 작다, j는 0보다 작다");
			}else if(j == 0) {
				System.out.println("i는 0보다 작다, j는 0과 같다");
			}else {
				System.out.println("i는 0보다 작다, j는 0보다 크다");
			}
			
		}else if(i == 0) {
			if(j < 0) {
				System.out.println("i는 0과 같다, j는 0보다 작다");
			}else if(j == 0) {
				System.out.println("i는 0과 같다, j는 0과 같다");
			}else {
				System.out.println("i는 0과 같다, j는 0보다 크다");
			}
		}else {
			if(j < 0) {
				System.out.println("i는 0보다 크다, j는 0보다 작다");
			}else if(j == 0) {
				System.out.println("i는 0보다 크다, j는 0보다 같다");
			}else {
				System.out.println("i는 0보다 크다, j는 0보다 크다");
			}
			
		}
		
	}

}
