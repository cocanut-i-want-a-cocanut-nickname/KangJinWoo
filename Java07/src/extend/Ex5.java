package extend;

public class Ex5 {
	public static void main(String[] args) {
		
	}
}

class MyStr{
	// 멤버변수
	protected String str;

	// 생성자
	public MyStr(String str) {
		this.str = str;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public void printStr() {
		System.out.println(str);
	}
	
	
}
// MyStr 클래스를 상속받고 출력이 둘다 꾸며진체로 출력될 수 있게 변경

class MyStrEx extends MyStr{
	
	public MyStrEx(String str) {
		super(str);
	}
	
	public void printStr() {
		System.out.println("=="+str+"==");
	}
}