package javastudy0825;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ��� >> ");
		int grade = sc.nextInt();
		
		if(grade>=90) {
			System.out.println("A�����Դϴ�.");
		}
		else if(grade>=80) {
			System.out.println("B�����Դϴ�.");
		}
		else if(grade>=70) {
			System.out.println("C�����Դϴ�.");
		}
		else {
			System.out.println("������õ�մϴ�!");
		}
		
		switch (grade/10) {
		case 9,10:
			System.out.println("a");
			break;
		case 8:
			System.out.println("b");
			break;
		case 7:
			System.out.println("c");
			break;
		
		default:
			System.out.println("����");
			break;
		}
		
		
		
		
		sc.close();
	}

}
