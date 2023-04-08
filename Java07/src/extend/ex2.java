package extend;

public class ex2 {
	public static void main(String[] args) {
		// 상속 : 내 눈에는 안보이지만 컴퓨터가 클래스를 복붙하게한다
		// 상속 : 물려주다 (어떤 클래스에 있는 변수와 메서드를 다른 클래스에 물려준다)
		// extends
		
		Person p1 = new Person();
		p1.정보입력("홍길동", 19, true);
		p1.정보보기();
		
		
	}
}

// 사람 클래스
class Person{
	// private : 자신 클래스 말고는 다 사용 불가능
	// private -> protected : 상속에 한해서는 허용
	protected String name;
	private int age;
	private boolean gender;
	
	public void 정보입력(String name, int age, boolean gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void 정보보기() {
		System.out.print("이름:"+name+", 나이:"+age+", 성별:");
		if (gender == false) {
			System.out.println("남성");
		}else {
			System.out.println("여성");
		}
	}
}

class Member extends Person{
	// 사람 클래스를 복사해서 회원 클래스에 붙여넣어라
	private String 그룹명 =  "우리그룹";
	
	public void 회원정보() {
		System.out.println(그룹명+"의 회원인 "+name+"입니다.");
	}
	
	// 상속받은 다음 수정하는 법 : 오버라이딩
	// 오버라이딩 : 물려받은 메서드를 재정의
	public void 정보보기() {
		super.정보보기();
		//this. : 나, super. : 부모
		System.out.println("회원 그룹은 "+그룹명);
	}
}