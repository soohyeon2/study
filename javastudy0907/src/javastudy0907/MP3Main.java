package javastudy0907;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MP3Main {

	public static void main(String[] args) {
		ArrayList<MP3> playlist = new ArrayList<MP3>();
		playlist.add(new MP3("�¿�", "���", 100,"C:\\Users\\smhrd\\git\\study\\javastudy0907\\src\\music\\��� - �¿�.mp3"));
		playlist.add(new MP3("������", "hypeboy", 200,"C:\\Users\\smhrd\\git\\study\\javastudy0907\\src\\music\\NewJeans_-_Hype_Boy.mp3"));
		playlist.add(new MP3("IVE", "LOVE DIVE", 300,"C:\\Users\\smhrd\\git\\study\\javastudy0907\\src\\music\\LOVE DIVE - IVE.mp3"));
		
		
		MP3Player mp = new MP3Player();
		// Ʋ �����
		
		// 1���� ������ ���
		// 2���� ������ ����
		// 3���� ������ ������
		// 4���� ������ ������
		// 5���� ������ ���� -> "MP3 Player�� �����մϴ�."
		Scanner sc = new Scanner(System.in);
		boolean onOff = true;
		int i=0;
		String singer=playlist.get(i).getSinger();
		String title=playlist.get(i).getTitle();
		int Playtime = playlist.get(i).getPlayTime();
		while(onOff) {
			System.out.print("[1]��� [2]���� [3]������ [4]������ [5]���� >>");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				mp.play(playlist.get(i).getPath());
				System.out.printf("%s : %s(%d��)\n",singer,title,Playtime);
				break;
			case 2:
				mp.stop();
				System.out.printf("����");
				break;
			case 3:
				i--;
				if(i<0) {
					// 0���� �۾����� ������������
					i=playlist.size()-1;
				}
				mp.stop();
				singer=playlist.get(i).getSinger();
				title=playlist.get(i).getTitle();
				Playtime = playlist.get(i).getPlayTime();
				mp.play(playlist.get(i).getPath());
				System.out.printf("%s : %s(%d��)\n",singer,title,Playtime);
				break;
			case 4:
				i++;
				if(i>playlist.size()-1) {
					//����Ʈ���� Ŀ���� ó��������
					i=0;
				}
				mp.stop();
				singer=playlist.get(i).getSinger();
				title=playlist.get(i).getTitle();
				Playtime = playlist.get(i).getPlayTime();
				System.out.printf("%s : %s(%d��)\n",singer,title,Playtime);
				mp.play(playlist.get(i).getPath());
				break;
			case 5:
				System.out.println("MP3 Player �����մϴ�!!");
				onOff=false;
				break;

			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				break;
			}
		
		}
	sc.close();
	}

}
