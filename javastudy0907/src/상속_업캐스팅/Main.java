package ���_��ĳ����;

public class Main {

	public static void main(String[] args) {
		// ��ǥ - ��ĳ������ ����ϸ� �� ������ ü���غ���!
		// �����̱� ���
		// ��� - Main Ŭ�������� machine �޼ҵ� ����! (������ Ŭ������)
		// ������ - ������ Ŭ������ ����!
		machine(new Pika());
		machine(new Pari());
		machine(new Kko());

	}
	
	// machine�� �Ű������� �����̴�!
	public static void machine(pokemon doll) {
		//�������̵�
		doll.pick();
		// ��Ӱ��迡�� ����Ŭ������ ���Ե� �޼ҵ带 ����Ŭ�������� ������
		// => ��ĳ���õ� ���¿��� �������̵��� �޼ҵ带 ȣ���ϸ� ����Ŭ������ �޼ҵ尡 ����
		
		
		//�ٿ�ĳ����
//		if(doll instanceof Pika)
//			((Pika)doll).pick();//�ƹ����� pika�� �ٲٸ� �ȵǰڴ�.
//		else if(doll instanceof Pari)
//			((Pari)doll).pick();
//		else if(doll instanceof Kko)
//			((Kko)doll).pick();
		
		
		
	}
	

}
