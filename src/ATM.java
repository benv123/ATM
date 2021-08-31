import java.util.ArrayList;
public class ATM {
	private ArrayList<Account> accounts=new ArrayList<Account>();
	public ATM(){
	}
	public boolean deposit(String id,double deposit){
		for(Account account:accounts){
			if(account.id.equals(id)){
				account.balance+=deposit;
				return true;
			}
		}
		accounts.add(new Account(id,deposit));
		return true;
	}
	public String toString(){
		String str="";
		for(Account account:accounts){
			str+="ID: "+account.id+"; Balance: "+account.balance+"\n";
		}
		return str;
	}
	public boolean withdraw(String id, double withdraw) {
		for (Account account: accounts) {
			if(account.id.equals(id)){
				if (withdraw > account.getBalance()) {
					throw new IllegalArgumentException("shrivel up, die, and dont talk to me again");
				}
				account.balance-=withdraw;
				return true;
			}
		}
		accounts.add(new Account(id, 0));
		return false;
	}
}
