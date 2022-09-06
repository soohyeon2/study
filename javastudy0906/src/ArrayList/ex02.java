package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> team = new ArrayList<String>();
		
		for(int i=0;i<5;i++) {
			System.out.print("이름을 입력하세요  :  ");
			team.add(sc.next());	
		}
		System.out.print("수현팀의 팀원은  ");
		for(int i=0;i<team.size();i++) {
			System.out.print(team.get(i)+"  ");
		}
		System.out.print("입니다.\n");
		
		System.out.print("삭제할 팀원의 이름  >>  ");
		team.remove(sc.next());
		
		System.out.print("수현팀의 팀원은  ");
		for(int i=0;i<team.size();i++) {
			System.out.print(team.get(i)+"  ");
		}
		System.out.print("입니다.");
		
		
	
		
		
		sc.close();

	}

}
