import java.util.ArrayList;
public class ATM {
	private ArrayList<Account> accounts=new ArrayList<Account>();
	public ATM(){
	}
	public boolean deposit(String id,long deposit){
		for(Account account:accounts){
			if(account.getId().equals(id)){
				account.setBalance((long) (account.getBalance() + deposit));
				return true;
			}
		}
		accounts.add(new Account(id,deposit));
		return true;
	}
	public String toString(){
		String str="";
		for(Account account:accounts){
			str+="ID: "+account.getId()+"; Balance: "+account.getBalance()+"\n";
		}
		return str;
	}
	public boolean withdraw(String id, double withdraw) {
		for (Account account: accounts) {
			if(account.getId().equals(id)){
				if (withdraw > account.getBalance()) {
					throw new IllegalArgumentException("shrivel up, die, and dont talk to me again");
				}
				account.setBalance((long) (account.getBalance() - withdraw));
				return true;
			}
		}
		accounts.add(new Account(id, 0));
		return false;
	}
	public long checkBalance(String accountID) { 
		for(Account account:accounts){
			if (account.getId().equals(accountID)) {
				return account.getBalance();
			}
		}
		throw new IllegalArgumentException("you don't have an account because you're broke. what more can i say?");
	}
}
