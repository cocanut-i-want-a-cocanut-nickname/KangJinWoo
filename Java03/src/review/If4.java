package review;

import java.text.NumberFormat;
import java.util.Scanner;

public class If4 {

	public static void main(String[] args) {
		int money = 1000;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요.");
		money = sc.nextInt();
		
		String commaNum = NumberFormat.getInstance().format(money);
		System.out.println(commaNum);
	}

}
