import java.util.ArrayList;
public class ATM {
	private ArrayList<Account> accounts=new ArrayList<Account>();
	public ATM(){
	}
	public boolean deposit(String id,double deposit){
		for(Account account:accounts) {
			if(account.id.equals(id)){
				account.balance+=deposit;
				return true;
			}
		}
		accounts.add(new Account(id,deposit));
		return true;
	}
}
