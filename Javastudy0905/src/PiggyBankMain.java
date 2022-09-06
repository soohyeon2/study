
public class PiggyBankMain {

	public static void main(String[] args) {

		// 저금통 설계도 불러오기
		PiggyBank pig = new PiggyBank();
		
		// 저금통에 1500원, 700원 저금
		pig.deposit(1500);
		pig.deposit(700);
		
		// 현재 잔액 출력
		pig.showMoney();
		
		// 저금통에서 500원을 출금
		pig.withdraw(500);
		
		// 현재 잔액 출력
		pig.showMoney();
	}

}
