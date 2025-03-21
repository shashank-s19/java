class BankRunner{
	public static void main (String ref[]){
		BankAccount.getbalance();
		BankAccount.credit(-0.0);
		BankAccount.getbalance();
		BankAccount.debit(-50.0);
		BankAccount.getbalance();
	}
}