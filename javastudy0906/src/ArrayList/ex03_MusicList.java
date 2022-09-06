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

			System.out.print("[1]  노래추가   [2]  노래조회   [3]  노래삭제   [4]  종료  >>   ");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.print("[1]  원하는 위치에 추가   [2] 마지막 위치에 추가   >>  ");
				int choice=sc.nextInt();
				if(choice==1) {
					System.out.print("추가 할 위치   >>  ");
					int select=sc.nextInt();
					System.out.print("추가 할 노래  입력  >>  ");
					music=sc.next();
					musicList.add(select-1, music);
				}
				else if(choice==2) {
					System.out.print("추가 할 노래  입력  >>  ");
					music=sc.next();
					musicList.add( music);
				}
				System.out.println("추가가  완료  되었습니다.");
				
			} else if (num == 2) {
				if(musicList.size()!=0) {
					System.out.println("=========  현재  재생  목록  =========");
					for(int i=0;i<musicList.size();i++) {
						System.out.println(i+1+".  "+musicList.get(i));
					}
				}
				else {
					System.out.println("=========  현재  재생  목록  =========");
					System.out.println("재생  목록이  없습니다!");
				}
			} else if (num == 3) {
				System.out.print("[1]  선택 삭제   [2]  전체 삭제  >>  ");
				int choice=sc.nextInt();
				if(choice==1) {
					System.out.print("삭제  할  노래  선택  >>");
					musicList.remove(sc.nextInt()-1);
					System.out.println("노래가  삭제  되었습니다.");
				}
				else if(choice==2) {
					musicList.clear();
					System.out.println("전체  리스트가  삭제되었습니다.");
				}
				
			} else if (num == 4) {
				System.out.println("프로그램  종료  되었습니다~~!");
				break;
			}
			else { 
				System.out.println("1~4까지 수입력해주세요");
			}
		}
	}

}
