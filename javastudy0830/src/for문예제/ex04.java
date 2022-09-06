package for문예제;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 >> ");
		int num=sc.nextInt();
		sc.close();
		System.out.print(num+"의 약수 : ");
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+"  ");
			}
		}
						

	}

}
