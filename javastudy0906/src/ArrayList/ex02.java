package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> team = new ArrayList<String>();
		
		for(int i=0;i<5;i++) {
			System.out.print("�̸��� �Է��ϼ���  :  ");
			team.add(sc.next());	
		}
		System.out.print("�������� ������  ");
		for(int i=0;i<team.size();i++) {
			System.out.print(team.get(i)+"  ");
		}
		System.out.print("�Դϴ�.\n");
		
		System.out.print("������ ������ �̸�  >>  ");
		team.remove(sc.next());
		
		System.out.print("�������� ������  ");
		for(int i=0;i<team.size();i++) {
			System.out.print(team.get(i)+"  ");
		}
		System.out.print("�Դϴ�.");
		
		
	
		
		
		sc.close();

	}

}
