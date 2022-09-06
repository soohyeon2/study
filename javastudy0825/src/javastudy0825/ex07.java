package javastudy0825;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("∫∏¿Ø ±›æ◊¿ª ¿‘∑¬«ÿ¡÷ººø‰ >> ");
		
		int money = sc.nextInt();
		System.out.println("∏ﬁ¥∫∏¶ ∞Ì∏£ººø‰");
		System.out.print("1. ƒ›∂Û(800ø¯) 2.ª˝ºˆ(500ø¯) 3. ∫Ò≈∏πŒøˆ≈Õ(1500ø¯) >> ");
		int num = sc.nextInt();
		
		switch (num) {
		case 1:
			if(money>=800) {
				System.out.println("±∏∏≈øœ∑·");
				System.out.println("¿‹µ∑ : "+(money-800));
			}
			else {
				System.out.println("µ∑¿Ã ∫Œ¡∑«ÿø‰ §–§–");
				System.out.println("¿‹µ∑ : "+money);
			}
			
			break;
		case 2:
			if(money>=500) {
				System.out.println("±∏∏≈øœ∑·");
				System.out.println("¿‹µ∑ : "+(money-500));
			}
			else {
				System.out.println("µ∑¿Ã ∫Œ¡∑«ÿø‰ §–§–");
				System.out.println("¿‹µ∑ : "+money);
			}
			
			break;
		case 3:
			if(money>=1500) {
				System.out.println("±∏∏≈øœ∑·");
				System.out.println("¿‹µ∑ : "+(money-1500));
			}
			else {
				System.out.println("µ∑¿Ã ∫Œ¡∑«ÿø‰ §–§–");
				System.out.println("¿‹µ∑ : "+money);
			}
			
			break;

		default:
			break;
		}
		sc.close();
	}

}
