package javastudy0825;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		//드래그 한후 crt + Alt + 방향키 복사 붙여 넣기 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 >> ");
		int num= sc.nextInt();
		sc.close();
		
		switch (num) {
		case 12,1,2:
			System.out.println(num+"월은 겨울입니다");
			break;
		case 3,4,5:
			System.out.println(num+"월은 봄입니다");
			break;
		case 6,7,8:
			System.out.println(num+"월은 여름입니다");
			break;
		case 9,10,11:
			System.out.println(num+"월은 가을입니다");
			break;
		default:
			System.out.println("1~12 입력하세요");
			break;
		}
	}

}
