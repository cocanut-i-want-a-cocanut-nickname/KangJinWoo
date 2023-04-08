package cls;

public class Class6 {
	public static void main(String[] args) {
		Car 아빠차 = new Car();
		// 아빠차.name = "";        //private 하면 직접 사용이 불가능해짐
		// System.out.println(아빠차.name);
	}
}

// 멤버변수는 private, 메서드는 public
/*
 접근권한 제어자
 private : 다른 클래스에서 접근 불가능
 아무것도 안적으면(default) : 다른 패키지에서 접근 불가능
 protected : 다른패키지에서 접근 불가능하지만 상속했을 경우에는 가능
 public : 접근가능 (같은 프로젝ㅇ트 내에서)_
 */
// 캡슐화 : 멤버변수를 private로 만들어서 외부 클래스로부터 데이터를 보호하고 public 메서드로 제공한다.
class Car{
	// 제조사, 색상, 차번호(뒷자리)
	String name;
	String color;
	int num;
	
	// 대입을 위해선 set
	public void setName(String name) {			// public메서드로 제공되지 않는 private 변수는 대입이나 사용이 불가능
		this.name = name;
	}
	public void setcolor(String color) {
		this.color = color;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	// 사용을 위해서는 get
	public String getName() {
		return name;
	}
//	public String getcolor() {
		
	}
//} 