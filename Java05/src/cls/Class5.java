package cls;

public class Class5 {
	public static void main(String[] args) {
		MyClass9 m1 = new MyClass9();
		m1.setVar(3, 4, "안녕", 3.14); // this 사용
		m1.정보보기();
		
		MyClass9 m2 = new MyClass9();
		
		// 모든 메서드에는 this 변수가 숨겨져있고
		// this.를 통해서 멤버변수와 메서드를 사용할 수 있다
		
		
	}
}

class MyClass9{
	int num1;
	int num2;
	String str;
	double dnum;
	
	void 정보보기() {
		System.out.println(""+num1+num2+str+dnum);
	}
	
	void setVar(int num1, int num2, String str, double dnum) {
		int var = 0;
		// 그래서 맴버변수에 백업
		this.num1 = num1;
		this.num2 = num2;
		this.str = str;
		this.dnum = dnum;
	}
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
}
