package javastudy0902;

import java.util.Scanner;

public class ex01_2�����迭 {

	public static void main(String[] args) {
		// �л� 3���� ��, ��, ��, ��, �� �� ������ ������ �迭�� ����
		// �� �л��� ������� ���
		
		int [][] stuScore = {{ 60,50,20,40,75},
														{50,90,86,45,100},
														{56,75,49,86,29}};
		int sum=0;

		for(int i = 0;i<stuScore.length;i++) {
			System.out.print(i+1+"��° �л� ����  :  ");
			for(int j=0;j<stuScore[i].length;j++) {				
				System.out.print(stuScore[i][j]+"   ");
				sum+=stuScore[i][j];
	
			}
			System.out.println("\n����  :  "+sum);
			System.out.println("��� : "+(sum/stuScore[i].length));
			System.out.println();
			sum=0;
		}
		
		

	}

}
