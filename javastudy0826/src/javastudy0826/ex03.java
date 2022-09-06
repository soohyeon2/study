package javastudy0826;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	     
	      int result=0;
	      while(result<10) {
	         System.out.print("숫자를 입력해주세요 >> ");
	            result = sc.nextInt();
  
	      }      
	      System.out.println("종료되었습니다");
	      sc.close();
	}

}
