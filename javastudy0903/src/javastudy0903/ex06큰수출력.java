package javastudy0903;

public class ex06ū����� {

	public static void main(String[] args) {
		int num1 =10;
		int num2 = 24;
		int result = largerNumber(num1, num2);
		System.out.println("�� ū �� : "+result);

	}

	private static int largerNumber(int num1, int num2) {
		int large=0;
		if(num1==num2) {
			large=0;
		}
		else {
			large = Math.max(num1, num2);
		}
		
		return large;
	}

}
