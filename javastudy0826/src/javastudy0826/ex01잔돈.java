package javastudy0826;

import java.util.Scanner;

public class ex01�ܵ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ݾ��� �Է����ּ��� >> ");
		
		int money = sc.nextInt();
		System.out.println("�޴��� ������");
		System.out.print("1. �ݶ�(800��) 2.����(500��) 3. ��Ÿ�ο���(1500��) >> ");
		int num = sc.nextInt();
		int menupoint=0;
		int result=0;
		switch (num) {
		case 1:
			menupoint=800;
			break;
		case 2:
			menupoint=500;
			break;
		case 3:
			menupoint=1500;
			break;
		default:
			break;
		}
		if(money>=menupoint) {
			result=money-menupoint;	
		}
		else {
			result=money;
		}
		System.out.println("�ܵ� : "+result+"��");
		System.out.print("õ�� : "+result/1000+"��, ");
		System.out.print("����� : "+result%1000/500+"��, ");
		System.out.print("��� : "+result%500/100+"��");
		sc.close();
	}
	
}
