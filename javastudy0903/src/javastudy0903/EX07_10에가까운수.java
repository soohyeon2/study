package javastudy0903;

import java.util.Scanner;

public class EX07_10에가까운수 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("첫번째 정수  >>  ");
		int num1= sc.nextInt();
		
		System.out.print("두번째 정수   >>   ");
		int num2 = sc.nextInt();
		
		int result=close10(num1,num2);
		System.out.println("10에 가까운 수  :  "+result);
	}

	public static int close10(int num1, int num2) {
		int res = Math.abs(num1)-10>Math.abs(num2)-10?num2:num1;
		return  res;
	}

}
