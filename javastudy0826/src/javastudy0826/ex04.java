package javastudy0826;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     
	      int a=0;
	      int b=0;
	      while(true) {
	         System.out.print("A 입력해주세요 >> ");
	         a = sc.nextInt();
	         System.out.print("B 입력해주세요 >> ");
	         b = sc.nextInt();
	         System.out.println("결과 >> "+(a-b));
	         if(a==0&&b==0) {
	        	 break;
	         }

	      }      
	      System.out.println("종료되었습니다");
	      sc.close();

	}

}
