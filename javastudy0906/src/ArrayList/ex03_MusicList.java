package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ex03_MusicList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> musicList = new ArrayList<String>();
		String music="";
		System.out.println("===== Music  Play  List =====");
		while (true) {

			System.out.print("[1]  �뷡�߰�   [2]  �뷡��ȸ   [3]  �뷡����   [4]  ����  >>   ");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.print("[1]  ���ϴ� ��ġ�� �߰�   [2] ������ ��ġ�� �߰�   >>  ");
				int choice=sc.nextInt();
				if(choice==1) {
					System.out.print("�߰� �� ��ġ   >>  ");
					int select=sc.nextInt();
					System.out.print("�߰� �� �뷡  �Է�  >>  ");
					music=sc.next();
					musicList.add(select-1, music);
				}
				else if(choice==2) {
					System.out.print("�߰� �� �뷡  �Է�  >>  ");
					music=sc.next();
					musicList.add( music);
				}
				System.out.println("�߰���  �Ϸ�  �Ǿ����ϴ�.");
				
			} else if (num == 2) {
				if(musicList.size()!=0) {
					System.out.println("=========  ����  ���  ���  =========");
					for(int i=0;i<musicList.size();i++) {
						System.out.println(i+1+".  "+musicList.get(i));
					}
				}
				else {
					System.out.println("=========  ����  ���  ���  =========");
					System.out.println("���  �����  �����ϴ�!");
				}
			} else if (num == 3) {
				System.out.print("[1]  ���� ����   [2]  ��ü ����  >>  ");
				int choice=sc.nextInt();
				if(choice==1) {
					System.out.print("����  ��  �뷡  ����  >>");
					musicList.remove(sc.nextInt()-1);
					System.out.println("�뷡��  ����  �Ǿ����ϴ�.");
				}
				else if(choice==2) {
					musicList.clear();
					System.out.println("��ü  ����Ʈ��  �����Ǿ����ϴ�.");
				}
				
			} else if (num == 4) {
				System.out.println("���α׷�  ����  �Ǿ����ϴ�~~!");
				break;
			}
			else { 
				System.out.println("1~4���� ���Է����ּ���");
			}
		}
	}

}
