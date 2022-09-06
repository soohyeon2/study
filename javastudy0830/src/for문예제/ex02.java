package for문예제;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 구구단 >> ");
		int num=sc.nextInt();
		sc.close();
		for(int i = 1; i<10;i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		}

	}

}
