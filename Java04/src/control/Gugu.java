package control;

public class Gugu {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {  // 1단부터 9단까지 반복
		    for (int j = 1; j <= 9; j++) {  // 각 단의 1부터 9까지 반복
		        System.out.println(i + " x " + j + " = " + (i * j));  // 구구단 출력
		    }
		    System.out.println();  // 한 단 출력이 끝나면 빈 줄 출력
		}
		
	}
}
