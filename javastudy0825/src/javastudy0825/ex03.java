package javastudy0825;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int age= sc.nextInt();
		
		if(age>=40) {
			System.out.println("40�� �̻��Դϴ�!");
		}
		else if(age>=30) {
			System.out.println("30���Դϴ�!");
		}
		else if(age>=20) {
			System.out.println("20���Դϴ�");
		}
		else {
			System.out.println("10���Դϴ�!");
		}
		sc.close();
	}

}
