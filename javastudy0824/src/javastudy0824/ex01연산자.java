package javastudy0824;

public class ex01연산자 {

	public static void main(String[] args) {
		int orange=3729;
		int number=52;
		int box;
		
		box=orange%number==0?orange/number:orange/number+1;
		System.out.println("필요한 박스 수 : "+box+"개");

	}

}
