
public class PiggyBankMain {

	public static void main(String[] args) {

		// ������ ���赵 �ҷ�����
		PiggyBank pig = new PiggyBank();
		
		// �����뿡 1500��, 700�� ����
		pig.deposit(1500);
		pig.deposit(700);
		
		// ���� �ܾ� ���
		pig.showMoney();
		
		// �����뿡�� 500���� ���
		pig.withdraw(500);
		
		// ���� �ܾ� ���
		pig.showMoney();
	}

}
