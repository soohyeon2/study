package javastudy0904;

import java.util.Scanner;

public class bankMain {

	public static void main(String[] args) {
		PiggyBank pb=new PiggyBank(5000);
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.print("���� �Է� >> ");
			int num=sc.nextInt();
		
			if(num==0) {
				break;
			}
			else if(num==1) {
				System.out.print("�Ա� �ݾ� >>  ");
				int input=sc.nextInt();
				pb.deposit(input);
			}
			else if(num==2) {
				System.out.print("��� �ݾ� >> ");
				int out = sc.nextInt();
				pb.withdraw(out);
			}
			else if(num==3) {
				pb.showmoney();
			}
			
		}
		
		
		

	}

}
