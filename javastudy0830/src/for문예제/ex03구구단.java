package for문예제;

public class ex03구구단 {

	public static void main(String[] args) {
//		for(int i = 2; i<10;i++) {
//			System.out.print(i+"단 : ");
//			for(int j=1;j<10;j++) {
//				System.out.print(i+" * "+j+" = "+(i*j)+"   ");
//			}
//			System.out.println();
//		}

		for (int j = 1; j < 10; j++) {
			for (int i = 2; i < 10; i++) {
				System.out.print(i + " * " + j + " = " + (i * j) + "   ");
			}
			System.out.println();
		}

	}

}
