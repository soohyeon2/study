package javastudy0903;

import java.util.Scanner;

public class ex05calculator {

	public static void main(String[] args) {
		int num1=50;
		int num2=15;
		Scanner sc= new Scanner(System.in);
		System.out.print("사칙연산 입력 >>");
		String op=sc.next();
		
		System.out.println(cal(num1,num2, op));

	}

	private static int cal(int num1, int num2, String op) {
		int result=0;
//		if(op.equals("+")) {
//			result=num1+num2;
//		}
//		else if(op.equals("-")) {
//			result=num1-num2;
//		}
//		else if(op.equals("*")) {
//			result=num1*num2;
//		}
//		else if(op.equals("/")) {
//			result=num1/num2;
//		}
		switch (op) {
		case "+":
			result=num1+num2;
			break;
		case "-":
			result=num1-num2;
			break;
		case "*":
			result=num1*num2;
			break;
		case "/":
			result=num1/num2;
			break;
		default:
			break;
		}
		
		return result;
	}

}
