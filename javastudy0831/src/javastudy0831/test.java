package javastudy0831;

public class test {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print("*");
				
			}
			for(int k=1;k<=10-i;k++) {
				System.out.print("   ");
			}
			for (int z = 0;z<=10-i;z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=10;i++) {
			for(int k=1;k<=10-i;k++) {
				System.out.print("   ");
			}
			for (int j=1;j<=i;j++) {
				System.out.print("*");
				
			}
			for(int k=2;k<=i;k++) {
				System.out.print("   ");
			}
			for (int z = 0;z<=10-i;z++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
