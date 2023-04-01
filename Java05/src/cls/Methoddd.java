package cls;

public class Methoddd {
	public static void main(String[] args) {
		// 객체화
		MyClass7 mc7 = new MyClass7();
		int result = mc7.더하기(3, 2);
		System.out.println(result);
		
	}
}

class MyClass7{
	// 더하기 +
	int 더하기(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	// 빼기 - 
	int 빼기(int num3, int num4) {
		int result_min = num3 - num4;
		return result_min;
	}
	
	// 곱하기 *
	int 곱하기(int num5, int num6) {
		int resultmul = num5 * num6;
		return resultmul;
	}
	// 나누기 / (0으로 나누면 결과를 0으로)
	int 나누기(int num7, int num8) {
		double result = 0.0;
		if(num8 == 0) {
			return (int) result;
		}else {
			result = num7/num8;
			return (int) result;
		}
	}
		
}