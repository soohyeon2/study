package javastudy0826;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     
	      int number=0;
	      int count1=0;
	      int count2=0;
	      while(true) {
	         System.out.print("���ڸ� �Է����ּ��� >> ");
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
	         System.out.println("¦������ : "+count1);
	         System.out.println("Ȧ������ : "+count2);
	      }      
	      System.out.println("����Ǿ����ϴ�");
	      sc.close();
	}

}
