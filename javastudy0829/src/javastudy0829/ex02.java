package javastudy0829;

public class ex02 {

	public static void main(String[] args) {
		// for ���� ����Ͽ� 21���� 57���� ����Ͻÿ�
		for(int i=21;i<58;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		// for ���� ����Ͽ� 96���� 53���� ����Ͻÿ�.
		for(int i=96;i>52;i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//for���� ����Ͽ� 21���� 57������ �� �� Ȧ���� ����Ͻÿ�
		//ù��° ���
		for(int i=21;i<58;i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
		//�ι�° ���
		for(int i=21;i<58;i+=2) {
			System.out.print(i+" ");
		}
	}

}
