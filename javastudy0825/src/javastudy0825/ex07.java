package javastudy0825;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ݾ��� �Է����ּ��� >> ");
		
		int money = sc.nextInt();
		System.out.println("�޴��� ������");
		System.out.print("1. �ݶ�(800��) 2.����(500��) 3. ��Ÿ�ο���(1500��) >> ");
		int num = sc.nextInt();
		
		switch (num) {
		case 1:
			if(money>=800) {
				System.out.println("���ſϷ�");
				System.out.println("�ܵ� : "+(money-800));
			}
			else {
				System.out.println("���� �����ؿ� �Ф�");
				System.out.println("�ܵ� : "+money);
			}
			
			break;
		case 2:
			if(money>=500) {
				System.out.println("���ſϷ�");
				System.out.println("�ܵ� : "+(money-500));
			}
			else {
				System.out.println("���� �����ؿ� �Ф�");
				System.out.println("�ܵ� : "+money);
			}
			
			break;
		case 3:
			if(money>=1500) {
				System.out.println("���ſϷ�");
				System.out.println("�ܵ� : "+(money-1500));
			}
			else {
				System.out.println("���� �����ؿ� �Ф�");
				System.out.println("�ܵ� : "+money);
			}
			
			break;

		default:
			break;
		}
		sc.close();
	}

}
