package javastudy0824;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
//		int num=5;
//		if(num==3) {
//			System.out.println("���� 3�Դϴ�");
//		}
//		else {
//			System.out.println("���� 3�� �ƴմϴ�");
//		}
//		System.out.println("���α׷� ��!");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է� ���ּ��� >> ");
		int age = sc.nextInt();
		
		if(age>=20) {
			System.out.println("���� �Դϴ�");
		}
		else {
			System.out.println("�̼����� �Դϴ�");
		}
		System.out.println("���α׷� ��!");
		sc.close();
	}

}
