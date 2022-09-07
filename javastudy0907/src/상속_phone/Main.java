package 상속_phone;

public class Main {

	public static void main(String[] args) {
		FeaturePhone fp = new FeaturePhone();
		fp.call();
		
		smartphone sp = new smartphone();
		sp.wifi();
		sp.call();
		
		
		// 2. 상속관계에서 하위클래스 객체는 상위클래스 타입으로 형변환이 가능함
		// => 업캐스팅
		// 스마트폰을 보고 휴대폰이라고 할수있지만 핸드폰보고 스마트폰이라고 할수없다.
		phone p = new FeaturePhone();
		p.sms();
		
	}

}
