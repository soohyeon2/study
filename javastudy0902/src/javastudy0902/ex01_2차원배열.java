package javastudy0902;

import java.util.Scanner;

public class ex01_2차원배열 {

	public static void main(String[] args) {
		// 학생 3명의 국, 영, 수, 사, 과 의 점수를 저장할 배열을 생성
		// 각 학생의 평균점수 출력
		
		int [][] stuScore = {{ 60,50,20,40,75},
														{50,90,86,45,100},
														{56,75,49,86,29}};
		int sum=0;

		for(int i = 0;i<stuScore.length;i++) {
			System.out.print(i+1+"번째 학생 점수  :  ");
			for(int j=0;j<stuScore[i].length;j++) {				
				System.out.print(stuScore[i][j]+"   ");
				sum+=stuScore[i][j];
	
			}
			System.out.println("\n총점  :  "+sum);
			System.out.println("평균 : "+(sum/stuScore[i].length));
			System.out.println();
			sum=0;
		}
		
		

	}

}
