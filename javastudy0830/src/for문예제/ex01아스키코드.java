package for������;

import java.util.Scanner;

public class ex01�ƽ�Ű�ڵ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ���ĺ��� �Է��ϼ��� >> ");
		char alpa=sc.next().charAt(0);
		System.out.print("������ ���ĺ��� �Է��ϼ��� >> ");
		char alpa2=sc.next().charAt(0);
		sc.close();
	
		for(char i = alpa;i<=alpa2;i++) {
			System.out.print(i+" ");
		}

	}

}
