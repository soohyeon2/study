package javastudy0824;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("ù��° �����Է� >> ");
			int num1=sc.nextInt();
			System.out.print("�ι�° �����Է� >> ");
			
			int num2=sc.nextInt();
			if(num1==0 && num2==0) {
				break;
			}
			
			int sum = num1+num2;
			int nan=num1-num2;
			int mul=num1*num2;
			float div=(float)num1/num2;
			
			System.out.println("�� ���� ���ϱ� : "+sum);
			System.out.println("�� ���� ���� : "+nan);
			System.out.println("�� ���� ���ϱ� : "+mul);
			System.out.println("�� ���� ������ : "+div);
			
		}
		sc.close();
	}

}
