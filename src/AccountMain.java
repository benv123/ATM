public class AccountMain{
	public static void main(String[] args){
		ATM atm=new ATM();
		atm.deposit("a",100);
		atm.deposit("b",100);
		atm.deposit("a",50);
		atm.deposit("c",300);
		atm.deposit("b",1000);
		System.out.println(atm);
		atm.withdraw("a", 100);
		System.out.println(atm);
		atm.withdraw("a", 1000);
		System.out.println(atm);
	}
}
