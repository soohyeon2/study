package javastudy0825;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		//�巡�� ���� crt + Alt + ����Ű ���� �ٿ� �ֱ� 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� >> ");
		int num= sc.nextInt();
		sc.close();
		
		switch (num) {
		case 12,1,2:
			System.out.println(num+"���� �ܿ��Դϴ�");
			break;
		case 3,4,5:
			System.out.println(num+"���� ���Դϴ�");
			break;
		case 6,7,8:
			System.out.println(num+"���� �����Դϴ�");
			break;
		case 9,10,11:
			System.out.println(num+"���� �����Դϴ�");
			break;
		default:
			System.out.println("1~12 �Է��ϼ���");
			break;
		}
	}

}
