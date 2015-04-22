package haosTearDownOfDesignPatterns;
//Adaptor Pattern 
public class AdaptorPattern {
		
	public static void main(String[] args) {
		
		NewSystem.AccountStanding acctStanding = new NewSystem().getAcctStanding(new Account());
		
		System.out.println(acctStanding);
	}
}

class Account{
	String custName = "Joe";
	double balance = 100.00;
	String passCode = "1203";
	String acctId = "234213";
}

class NewSystem{
	
	public AccountStanding getAcctStanding(Account acct){
		
		AccountStanding standing = new AccountStanding();		
		standing.status = verifyAcct(acct);
		
		// Use of LegacySystem to connect current account to previous account type.
		standing.currentBalance = LegacySystem.getBalance(acct.custName);
		return standing;
	}

	
	public boolean verifyAcct(Account acct){ return true; }

	// * * * * Internal Class * * * * *
	class AccountStanding{
		boolean status;
		double currentBalance;
		public String toString(){
			return "Good standing? " + status + " Current balance: " + currentBalance;
		}
	}
}

class LegacySystem{
	public static double getBalance(String exampleParam){
		return 100.00;
	}
}

