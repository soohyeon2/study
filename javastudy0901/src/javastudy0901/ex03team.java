package javastudy0901;

import java.util.Scanner;

public class ex03team {

	public static void main(String[] args) {
		String [] name = {"전수현", "나소영","이혜빈","김명현","신명호"};
		Scanner sc= new Scanner(System.in);
		
		System.out.print("이름 > > >");
		String check =sc.next();
		
		boolean isFind=false;
		
		for(int i=0;i<name.length;i++) {
			if(check.equals(name[i])) {
				System.out.println(check+"님은 "+i+"번 인덱스에 있습니다.");
				isFind=true;
				break;
			}
			
		}
		if(!isFind) {
			System.out.println(check + "님은 team에 없습니다.");
		}

	}

}
