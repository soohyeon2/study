package javastudy0907;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MP3Main {

	public static void main(String[] args) {
		ArrayList<MP3> playlist = new ArrayList<MP3>();
		playlist.add(new MP3("태연", "사계", 100,"C:\\Users\\smhrd\\git\\study\\javastudy0907\\src\\music\\사계 - 태연.mp3"));
		playlist.add(new MP3("뉴진스", "hypeboy", 200,"C:\\Users\\smhrd\\git\\study\\javastudy0907\\src\\music\\NewJeans_-_Hype_Boy.mp3"));
		playlist.add(new MP3("IVE", "LOVE DIVE", 300,"C:\\Users\\smhrd\\git\\study\\javastudy0907\\src\\music\\LOVE DIVE - IVE.mp3"));
		
		
		MP3Player mp = new MP3Player();
		// 틀 만들기
		
		// 1번을 누르면 재생
		// 2번을 누르면 정지
		// 3번을 누르면 이전곡
		// 4번을 누르면 다음곡
		// 5번을 누르면 종료 -> "MP3 Player를 종료합니다."
		Scanner sc = new Scanner(System.in);
		boolean onOff = true;
		int i=0;
		String singer=playlist.get(i).getSinger();
		String title=playlist.get(i).getTitle();
		int Playtime = playlist.get(i).getPlayTime();
		while(onOff) {
			System.out.print("[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료 >>");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				mp.play(playlist.get(i).getPath());
				System.out.printf("%s : %s(%d초)\n",singer,title,Playtime);
				break;
			case 2:
				mp.stop();
				System.out.printf("정지");
				break;
			case 3:
				i--;
				if(i<0) {
					// 0보다 작아지면 마지막곡으로
					i=playlist.size()-1;
				}
				mp.stop();
				singer=playlist.get(i).getSinger();
				title=playlist.get(i).getTitle();
				Playtime = playlist.get(i).getPlayTime();
				mp.play(playlist.get(i).getPath());
				System.out.printf("%s : %s(%d초)\n",singer,title,Playtime);
				break;
			case 4:
				i++;
				if(i>playlist.size()-1) {
					//리스트보다 커지면 처음곡으로
					i=0;
				}
				mp.stop();
				singer=playlist.get(i).getSinger();
				title=playlist.get(i).getTitle();
				Playtime = playlist.get(i).getPlayTime();
				System.out.printf("%s : %s(%d초)\n",singer,title,Playtime);
				mp.play(playlist.get(i).getPath());
				break;
			case 5:
				System.out.println("MP3 Player 종료합니다!!");
				onOff=false;
				break;

			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}
		
		}
	sc.close();
	}

}
