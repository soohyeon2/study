package javastudy0826;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     
	      int a=0;
	      int b=0;
	      while(true) {
	         System.out.print("A �Է����ּ��� >> ");
	         a = sc.nextInt();
	         System.out.print("B �Է����ּ��� >> ");
	         b = sc.nextInt();
	         System.out.println("��� >> "+(a-b));
	         if(a==0&&b==0) {
	        	 break;
	         }

	      }      
	      System.out.println("����Ǿ����ϴ�");
	      sc.close();

	}

}
