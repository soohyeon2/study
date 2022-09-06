
public class Person {

	// 내가 원하는 사람을 만들 수 있는 설계도!
	
	// 클래스의 구조 : 필드, 메소드
	// 사람의 특징 : 나이, 이름, 성별, 키 ...	
	String name;
	int age;
	String gender;
	int height;
	
	// 생성자
	// 단축키 : 우클릭 -> source -> Generator Constructor using Fields
	// 		: 우리가 선언해둔 필드를 이용해서 생성자 만들기
	// 생성자 특징
	// 1. 리턴타입 없음(void자체도 없음)
	// 2. 생성자 메소드 이름은 클래스 이름과 동일
	public Person(String name, int age, String gender, int height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}
	
	// 4. 생성자 메소드는 오버로딩(중복정의)이 가능
	// 기본생성자, default 생성자
	// 객체 생성 시, 생성자가 없는경우 compile 할 때 기본 생성자가 자동 생성
	// But, 생성자가 하나 이상이 존재하면 기본생성자는 자동 생성X
	public Person() {
		
	}
	
	// 사람의 행동 : 말하기, 먹기, 걷기, 자기...
	public void talk() {
		System.out.println("재잘재잘 말하다!");
	}
	public void eat() {
		System.out.println("냠냠 먹기~");
	}
	public void walk() {
		System.out.println("뚜벅뚜벅 걷기..헥헥");
	}
	public void sleep() {
		System.out.println("쿨쿨자기Zzzzz");
	}
	
	
	
	
}
