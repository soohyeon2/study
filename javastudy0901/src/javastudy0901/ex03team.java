package javastudy0901;

import java.util.Scanner;

public class ex03team {

	public static void main(String[] args) {
		String [] name = {"������", "���ҿ�","������","�����","�Ÿ�ȣ"};
		Scanner sc= new Scanner(System.in);
		
		System.out.print("�̸� > > >");
		String check =sc.next();
		
		boolean isFind=false;
		
		for(int i=0;i<name.length;i++) {
			if(check.equals(name[i])) {
				System.out.println(check+"���� "+i+"�� �ε����� �ֽ��ϴ�.");
				isFind=true;
				break;
			}
			
		}
		if(!isFind) {
			System.out.println(check + "���� team�� �����ϴ�.");
		}

	}

}
