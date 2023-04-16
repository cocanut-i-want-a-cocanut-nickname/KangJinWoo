package time;

public class StaticVar {
	// 이렇게 하심 안됩니다. 싱글턴 패턴으로 해주세요.
	
	static String str1 = "안녕하세요";
	static String str2 = "반갑습니다";
	static int num1 = 314;
	static int nums[] = new int[100];			// 성능 ㅈㄴ 느려짐
	
	public static void main(String[] args) {
		Test1.print();
		
		Singleton singleton = Singleton.getInstance();
		singleton.setStr("안녕하세요 심굴현 입니다.");
		System.out.println(singleton.getStr());
		
	}

}

class Test1{
	public static void print() {
		System.out.println(StaticVar.str1);
		StaticVar.nums[0] = 0;
		StaticVar.nums[1] = 1;
		StaticVar.nums[2] = 2;
	}
}