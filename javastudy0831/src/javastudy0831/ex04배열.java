package javastudy0831;


import java.util.Scanner;

public class ex04�迭 {

	public static void main(String[] args) {
		int [ ] numArray = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0;i<numArray.length;i++) {
			System.out.print("������ �Է����ּ��� >> ");
			numArray[i]=sc.nextInt();
		}
		
		for (int i=0;i<numArray.length;i++) {
			System.out.print(numArray[i]+"    ");
		}
		sc.close();
	}

}
