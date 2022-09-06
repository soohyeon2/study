package javastudy0826;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     
	      int number=0;
	      int count1=0;
	      int count2=0;
	      while(true) {
	         System.out.print("숫자를 입력해주세요 >> ");
	         number=sc.nextInt();
	         if(number==-1) {
	        	 break;
	         }
	         if(number%2==0) {
	        	 count1++;
	         }
	         else {
	        	 count2++;
	         }
	         System.out.println("짝수개수 : "+count1);
	         System.out.println("홀수개수 : "+count2);
	      }      
	      System.out.println("종료되었습니다");
	      sc.close();
	}

}
