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
		doll.pick();
	}
	

}
