package for문예제;

import java.util.Scanner;

public class ex01아스키코드 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 알파벳을 입력하세요 >> ");
		char alpa=sc.next().charAt(0);
		System.out.print("마지막 알파벳을 입력하세요 >> ");
		char alpa2=sc.next().charAt(0);
		sc.close();
	
		for(char i = alpa;i<=alpa2;i++) {
			System.out.print(i+" ");
		}

	}

}
