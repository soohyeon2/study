package for������;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� >> ");
		int num=sc.nextInt();
		sc.close();
		System.out.print(num+"�� ��� : ");
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+"  ");
			}
		}
						

	}

}
