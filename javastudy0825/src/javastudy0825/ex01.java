package javastudy0825;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		int money = 5000;
		Scanner sc = new Scanner(System.in);
		System.out.print("일할시간을 입력하세요 : ");
		int time= sc.nextInt();
		
		if(time>8) {
			int sum = money*8 + (time-8)*money*3/2;
			System.out.println("총 임금은 "+sum+"원 입니다.");
		}
		else {
			System.out.println("총 임금은 "+money*time+"원 입니다.");
		}
		sc.close();
	}

}
