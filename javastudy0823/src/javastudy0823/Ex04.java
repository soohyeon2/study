package javastudy0823;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("°ªÀÔ·Â >> ");
			int num=sc.nextInt();
			if(num==0) {
				break;
			}
			
			int result = (num/10)*10;
			System.out.println(result);
			
		}
		
	}

}
