package ExceptionHandling;
class InsufficiantBalanceException extends Exception {
	public InsufficiantBalanceException(String ExceptionDescription) {
		super(ExceptionDescription);
	}
	
}
class Account {
	int accno;
	String acchname;
	String acctype;
	int balance;
	
	public Account(int accno, String acchname, String acctype, int balance) {
		this.accno = accno;
		this.acchname = acchname;
		this.acctype = acctype;
		this.balance = balance;
	}
	
}

class Transition{
	String Transitionid;
	public Transition(String Transitionid) {
		this.Transitionid=Transitionid;
	}
	
	public void Withdrawl(Account account , int wdamt) {
		try {
		System.out.println("Transition Id : "+Transitionid);
		System.out.println("Account number : "+account.accno);
		System.out.println("Account holdername : "+account.acchname);
		System.out.println("Account type : "+account.acctype);
		System.out.println("Account total balance : "+account.balance);
		System.out.println("Transition Type : WithDraw");
		System.out.println("Withdraw Amount : "+wdamt);
		if(wdamt<=account.balance) {
			account.balance=account.balance-wdamt;
			System.out.println("remaining balance : "+account.balance);
		}
		else {
			throw new InsufficiantBalanceException("Insufficiant balance in your account");
			
		}
		}catch (InsufficiantBalanceException e){
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Thank you visit again");
		}
	}
}

public class Project1 {

	public static void main(String[] args) {
		Account acc1 = new Account(111,"parvez", "saving" ,20000);
		Transition tr1 = new Transition("t11");
		tr1.Withdrawl(acc1, 10000);
		System.out.println();
		Account acc2 = new Account(222,"junaid", "saving" ,10000);
		Transition tr2 = new Transition("t22");
		tr2.Withdrawl(acc2, 15000);

	}

}
