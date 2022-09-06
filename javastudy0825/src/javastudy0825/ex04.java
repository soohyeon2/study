package javastudy0825;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해주세요 >> ");
		int grade = sc.nextInt();
		
		if(grade>=90) {
			System.out.println("A학점입니다.");
		}
		else if(grade>=80) {
			System.out.println("B학점입니다.");
		}
		else if(grade>=70) {
			System.out.println("C학점입니다.");
		}
		else {
			System.out.println("휴학추천합니다!");
		}
		
		switch (grade/10) {
		case 9,10:
			System.out.println("a");
			break;
		case 8:
			System.out.println("b");
			break;
		case 7:
			System.out.println("c");
			break;
		
		default:
			System.out.println("휴학");
			break;
		}
		
		
		
		
		sc.close();
	}

}
