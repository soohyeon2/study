package 상속_업캐스팅;

public class Main {

	public static void main(String[] args) {
		// 목표 - 업캐스팅을 사용하면 왜 좋은지 체감해보자!
		// 인형뽑기 기계
		// 기계 - Main 클래스내에 machine 메소드 구현! (원래는 클래스로)
		// 인형들 - 각가의 클래스로 구현!
		machine(new Pika());
		machine(new Pari());
		machine(new Kko());

	}
	
	// machine의 매개변수는 인형이다!
	public static void machine(pokemon doll) {
		//추상 클래스
		doll.pick();
		//다운캐스팅
//		if(doll instanceof Pika)
//			((Pika)doll).pick();//아무때나 pika로 바꾸면 안되겠다.
//		else if(doll instanceof Pari)
//			((Pari)doll).pick();
//		else if(doll instanceof Kko)
//			((Kko)doll).pick();
		
		
		
	}
	

}
