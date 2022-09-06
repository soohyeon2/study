package javastudy0824;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("JAVA 점수입력 >> ");
			int num1=sc.nextInt();
			System.out.print("Web 점수입력 >> ");
			int num2=sc.nextInt();
			System.out.print("Android 점수입력 >> ");
			int num3=sc.nextInt();
			
			if(num1==0 && num2==0 && num3==0) {
				break;
			}
			
			int sum = num1+num2+num3;
			int avg = sum/3;
			
			System.out.println("합계 : "+sum);
			System.out.println("평균 : "+avg);
			
			
			
		}
		sc.close();
	}

}
