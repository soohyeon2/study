package javastudy0829;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 >> ");
		int num= sc.nextInt();
		sc.close();
		
		for(int i = 1;i<11;i++) {
			System.out.print(num*i+" ");
		}

	}

}
