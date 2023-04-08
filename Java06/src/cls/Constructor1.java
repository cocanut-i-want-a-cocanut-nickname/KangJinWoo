package cls;

public class Constructor1 {
	public static void main(String[] args) {
		// 클래스의 생성자
		// 클래스는 초보자를 위한 문법, 초기에 먼저 해줘야할 작업을 자꾸 빼먹는다.
		// 생성자 : 사람이 초기값을 입력하지 않으면 실행이 안되게끔 해버리는 문법(반드시 초기값을 입력하게끔 하는 문법.
		
		MyClass9 m1 = new MyClass9();
		MyClass9 m2 = new MyClass9();
		
		// 해당 놀이기구는 나이가 13세 이상이면서 키가 160 이상이여야 합니다.
		MyClass9Test mv = new MyClass9Test();
		mv.test(m1);
		mv.test(m2);
	}
}

class MyClass9{
	//생성자 (초기세팅을 빼먹지 못하도록)
	
	// 생성자 오버로딩(매개변수만 바꿔놓기)
	public MyClass9(int age, )
	
	// 멤버변수
	private int age;
	private String name;
	private double height;
	
	
	
	
	//메서드
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	//
	
}

class MyClass9Test{
	public void test(MyClass9 mc) {
		if(mc.getAge() < 13) {
			System.out.println(mc.getName()+"나이가 적습니다. 탑승불가");
		}else if(mc.getHeight() < 150) {
			System.out.println("키 미달 입니다.");
		}else {
			System.out.println(mc.getName()+"은 탑승 가능");
		}
	}
}