package µ¡¼À°ÔÀÓ;

import java.util.Random;
import java.util.Scanner;

public class ·£´ýµ¡¼À°ÔÀÓ {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int i=0;
		int max=3;
		int bound=20;
		
		String [] fail = {
				"Á» ´õ »ý°¢ÇØºÁ¿ä",
				"±â¿î³»!",
				"¿¡ÈÞ..."
		};
		while(true) {
			if(i==max) {
				System.out.println("Game Over!");
				break;
			}
			
			int num1 = random.nextInt(bound)+1;
			int num2 = random.nextInt(bound)+1;
			int sum=num1+num2;
			System.out.printf("%d + %d = ",num1,num2);
			
			int answer=sc.nextInt();
			if(answer==sum) {
				System.out.println("Success!");
			}
			else {
				System.out.println(fail[i]);
				i++;
			}
		}
		sc.close();
		
	}

}
