package cls;

public class Constructor2 {
	public static void main(String[] args) {
		
	}
}

class Person{
	// 멤버변수 : 이름, 나이
	// 생성자 (생성자 통해서 멤버변수 초기화)
	// 게터세터
	String 이름;
	int 나이;
	
	
	public String getName() {
		return 이름;
	}
	public void setName(String 이름) {
		this.이름 = 이름;
	}
	public int getAge() {
		return 나이;
	}
	public void setAge(int 나이) {
		this.나이 = 나이;
	}
	
}

class PersonView{
	Person person;
	// 생성자 : 받아온 객체를 멤버변수에 백업
	
	// 메서드(멤버변수 출력용)
	public void info() {
		System.out.println("이름"+"person.getName()"+", 나이: "+person.getAge());
	}
	
	// 메서드 오버로딩
	public void info(Person person) {
		this.person = person;
		System.out.println("이름: "+person.getName()+", 나이: "+person.getAge());
	}
}