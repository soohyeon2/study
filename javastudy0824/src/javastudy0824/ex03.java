package javastudy0824;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("JAVA �����Է� >> ");
			int num1=sc.nextInt();
			System.out.print("Web �����Է� >> ");
			int num2=sc.nextInt();
			System.out.print("Android �����Է� >> ");
			int num3=sc.nextInt();
			
			if(num1==0 && num2==0 && num3==0) {
				break;
			}
			
			int sum = num1+num2+num3;
			int avg = sum/3;
			
			System.out.println("�հ� : "+sum);
			System.out.println("��� : "+avg);
			
			
			
		}
		sc.close();
	}

}
