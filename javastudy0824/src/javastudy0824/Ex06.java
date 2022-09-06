package javastudy0824;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
//		int num=5;
//		if(num==3) {
//			System.out.println("숫자 3입니다");
//		}
//		else {
//			System.out.println("숫자 3이 아닙니다");
//		}
//		System.out.println("프로그램 끝!");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력 해주세요 >> ");
		int age = sc.nextInt();
		
		if(age>=20) {
			System.out.println("성인 입니다");
		}
		else {
			System.out.println("미성년자 입니다");
		}
		System.out.println("프로그램 끝!");
		sc.close();
	}

}
