package ���_phone;

public class Main {

	public static void main(String[] args) {
		FeaturePhone fp = new FeaturePhone();
		fp.call();
		
		smartphone sp = new smartphone();
		sp.wifi();
		sp.call();
		
		
		// 2. ��Ӱ��迡�� ����Ŭ���� ��ü�� ����Ŭ���� Ÿ������ ����ȯ�� ������
		// => ��ĳ����
		// ����Ʈ���� ���� �޴����̶�� �Ҽ������� �ڵ������� ����Ʈ���̶�� �Ҽ�����.
		phone p = new FeaturePhone();
		p.sms();
		
	}

}
