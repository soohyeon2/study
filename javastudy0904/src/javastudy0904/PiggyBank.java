package javastudy0904;

public class PiggyBank {
	private int money;
	
	public PiggyBank(int money) {
		super();
		this.money = money;
	}
	
	public void deposit(int input) {
		money +=input;
		System.out.println("현재자산 >>  "+money);
	}
	
	public void withdraw(int out) {
		money-=out;
		System.out.println("현재자산 >>  "+money);
	}
	
	public void showmoney() {
		System.out.println("현재자산 >>  "+money);
	}
}
