package javastudy0825;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력: ");
		int age= sc.nextInt();
		
		if(age>=40) {
			System.out.println("40대 이상입니다!");
		}
		else if(age>=30) {
			System.out.println("30대입니다!");
		}
		else if(age>=20) {
			System.out.println("20대입니다");
		}
		else {
			System.out.println("10대입니다!");
		}
		sc.close();
	}

}
