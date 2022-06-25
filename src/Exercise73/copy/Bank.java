package Exercise73.copy;

public class Bank {
	private Customer[] customers = null; // 고객목록
	private int numberOfCustomers; // 고객수

	public Bank() {
		customers = new Customer[10];
	}

	public void addCustomer(Customer customer) {
		customers[numberOfCustomers++] = customer;
		//++의 위치 NOC에 넣고 증가 // 증가시기고 넣기 x
	}

	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}

	public Customer[] getCustomers() {
		return customers;
	}

	public  Customer getCustomer(int index) {
		return customers[index];
	}
	
}
