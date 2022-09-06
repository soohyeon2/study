package javastudy0831;


import java.util.Scanner;

public class ex04배열 {

	public static void main(String[] args) {
		int [ ] numArray = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0;i<numArray.length;i++) {
			System.out.print("정수를 입력해주세요 >> ");
			numArray[i]=sc.nextInt();
		}
		
		for (int i=0;i<numArray.length;i++) {
			System.out.print(numArray[i]+"    ");
		}
		sc.close();
	}

}
