package javastudy0825;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		int number= sc.nextInt();
		
		if(number%10<5) {
			System.out.println("�ݿø� �� : "+number/10*10);
		}
		else {
			System.out.println("�ݿø� �� : "+(number/10+1)*10);
		}
		sc.close();
	}

}
