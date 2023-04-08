package extend;

public class ex1 {
	public static void main(String[] args) {

		
		// 대충 복붙을 여러개 하면 하나 수정에 너무 힘들어지니 상속 사용
	}
}

// 사람(Human) 클래스
class Human{
	// 이름, 나이, 성별, 키, 몸무게
	private String name;
	private int age;
	private boolean gender;
	
	Human(String name, int age, boolean gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	// 말하기, 걷기, 밥먹기
	public void 말하기() {
		System.out.println(name+"(이)가 말합니다.");
	}
	public void 걷기() {
		System.out.println(name+"(이)가 걷습니다.");
	}
	public void 밥먹기() {
		System.out.println(name+"(이)가 먹습니다.");
	}
}
// Human 클래스에서 이름 옆에 나이를 추가한 클래스
class HumanEX{
	// 이름, 나이, 성별, 키, 몸무게
	private String name;
	private int age;
	
	HumanEX(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	// 말하기, 걷기, 밥먹기
	public void 말하기() {
		System.out.println(name+"("+age+"세)"+"(이)가 말합니다.");
	}
	public void 걷기() {
		System.out.println(name+"("+age+"세)"+"(이)가 걷습니다.");
	}
	public void 밥먹기() {
		System.out.println(name+"("+age+"세)"+"(이)가 먹습니다.");
	}
}