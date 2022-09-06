package javastudy0903;

public class ex04method {

	public static void main(String[] args) {
		add(3,5);
		sub(3,5);
		mul(3,5);
		dev(3,5);
	}

	public static void add (int a, int b) {
		int result = a+b;
		System.out.println(result);
	}

	public static void sub (int a, int b) {
		int result = a-b;
		System.out.println(result);
	}
	public static void mul (int a, int b) {
		int result = a*b;
		System.out.println(result);
	}
	public static void dev (int a, int b) {
		System.out.println((double)a/b);
	}

}
