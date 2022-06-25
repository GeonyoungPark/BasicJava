package Exercise73.copy;

public class BankAccount {
	private int balance; // 잔액


	public BankAccount(int balance) { //밸런스 초기화
		this.balance = balance;
	}

	public int getBalance() { // 잔액 가져오기
		return balance;
	}

	public void deposit(int amount) { // 잔액더하기

		this.balance += amount;
	}

	public boolean withdraw(int amount) {//잔액빼기
		if (amount < balance) {
			balance -= amount;
			return true;
		} else {
			return false;
		}

	}

	public boolean transfer(int amount, BankAccount otherAccount) {
		if (amount < balance) {
		otherAccount.balance += amount;
		this.balance -= amount;
		//withdraw(amount);
		//otherAccount.deposit(amount);
			return true;
		} else {
			return false;
		}

	}
}
