package control;

public class ArrArr {
	public static void main(String[] args) {
		// 2차원 배열
		int second_arr[][] = {{10, 20}, {100, 200}};
		
		for(int i=0;i<second_arr.length;++i) {
			for(int j=0;j<second_arr[i].length;++j) {
				System.out.println(second_arr[i][j]);
			}
		}
		System.out.println(second_arr);
	}
}
