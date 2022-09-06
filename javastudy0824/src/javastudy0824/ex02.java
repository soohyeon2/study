package javastudy0824;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("첫번째 정수입력 >> ");
			int num1=sc.nextInt();
			System.out.print("두번째 정수입력 >> ");
			
			int num2=sc.nextInt();
			if(num1==0 && num2==0) {
				break;
			}
			
			int sum = num1+num2;
			int nan=num1-num2;
			int mul=num1*num2;
			float div=(float)num1/num2;
			
			System.out.println("두 수의 더하기 : "+sum);
			System.out.println("두 수의 빼기 : "+nan);
			System.out.println("두 수의 곱하기 : "+mul);
			System.out.println("두 수의 나누기 : "+div);
			
		}
		sc.close();
	}

}
