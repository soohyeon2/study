package javastudy0825;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		int money = 5000;
		Scanner sc = new Scanner(System.in);
		System.out.print("���ҽð��� �Է��ϼ��� : ");
		int time= sc.nextInt();
		
		if(time>8) {
			int sum = money*8 + (time-8)*money*3/2;
			System.out.println("�� �ӱ��� "+sum+"�� �Դϴ�.");
		}
		else {
			System.out.println("�� �ӱ��� "+money*time+"�� �Դϴ�.");
		}
		sc.close();
	}

}
