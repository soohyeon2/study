package javastudy0831;

public class ex01 {

	public static void main(String[] args) {
		
		// �ڵ� ���� : crtl + a  ->  ctrl +shift + f
		for (int i = 2; i < 31; i++) {
			System.out.print(i + "�� ��� : ");
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					System.out.print(j + "  ");
				}
			}
			System.out.println();
		}

	}

}
