package javastudy0901;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []a= new int[5];
		int sum=0;
		
		for(int i = 0;i<5;i++) {
			System.out.print((i+1)+"번째 입력 : ");
			a[i]=sc.nextInt();
		}
		int max=a[0];
		int min=a[0];
		sc.close();
		System.out.print("입력된 점수 : ");
		for(int i = 0; i<a.length;i++) {
			System.out.print(a[i]+"   ");
			max=Math.max(max,a[i]);
			min=Math.min(min, a[i]);
			sum+=a[i];
		}
		
		System.out.println("\n최고 점수 : "+max);
		System.out.println("최저 점수 : "+min);
		System.out.println("점수 총합 : "+sum);
		System.out.println("점수 평균 : "+sum/a.length );
		
		
		
	}

}
