package javastudy0829;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// ������ �Է¹޾� 1���� �Է¹��� ���������� ���ʴ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		Scanner sc= new Scanner(System.in);
		System.out.print("���� �Է� >> ");
		int num=sc.nextInt();
		sc.close();
		
		//1~ �Է¹��� ���ڱ��� ���!
		for(int i=1;i<=num;i++) {
			System.out.print(i + " ");
		}
		
	}

}
