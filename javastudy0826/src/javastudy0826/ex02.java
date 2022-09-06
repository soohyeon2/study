package javastudy0826;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		Scanner sc = new Scanner(System.in);
		int [] a = new int[10];
		while(num<=10) {
			System.out.print("정수 입력 >> ");
			int number= sc.nextInt();
			a[num-1]=number;
			num++;
		}
		sc.close();
	}

}
