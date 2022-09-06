package javastudy0826;

import java.util.Scanner;

public class ex01잔돈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("보유 금액을 입력해주세요 >> ");
		
		int money = sc.nextInt();
		System.out.println("메뉴를 고르세요");
		System.out.print("1. 콜라(800원) 2.생수(500원) 3. 비타민워터(1500원) >> ");
		int num = sc.nextInt();
		int menupoint=0;
		int result=0;
		switch (num) {
		case 1:
			menupoint=800;
			break;
		case 2:
			menupoint=500;
			break;
		case 3:
			menupoint=1500;
			break;
		default:
			break;
		}
		if(money>=menupoint) {
			result=money-menupoint;	
		}
		else {
			result=money;
		}
		System.out.println("잔돈 : "+result+"원");
		System.out.print("천원 : "+result/1000+"개, ");
		System.out.print("오백원 : "+result%1000/500+"개, ");
		System.out.print("백원 : "+result%500/100+"개");
		sc.close();
	}
	
}
