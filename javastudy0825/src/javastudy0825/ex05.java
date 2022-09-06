package javastudy0825;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~5숫자를 입력해주세요>> ");
		int num= sc.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("1를 입력했습니다");
			break;
		case 2:
			System.out.println("2를 입력했습니다");
			break;
		case 3:
			System.out.println("3를 입력했습니다");
			break;
		case 4:
			System.out.println("4를 입력했습니다");
			break;
		case 5:
			System.out.println("5를 입력했습니다");
			break;

		default:
			System.out.println("숫자를 잘못 입력해줬습니다");
			break;
		}
		
		sc.close();
		///////////
		if(num==1) {
			System.out.println("1를 입력했습니다.");
		}
		else if(num==2) {
			System.out.println("2를 입력했습니다");
		}
		else if(num==3) {
			System.out.println("3를 입력했습니다");
		}
		else if(num==4) {
			System.out.println("4를 입력했습니다");
		}
		else if(num==5) {
			System.out.println("5를 입력했습니다");
		}
		else {
			System.out.println("숫자를 잘못 입력해줬습니다");
		}
		
	}
	
	

}
