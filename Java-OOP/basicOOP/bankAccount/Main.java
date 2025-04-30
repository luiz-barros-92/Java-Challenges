import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
        sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String accountHolder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		String initialDeposit = sc.nextLine().toLowerCase();

        Account ac = null;
		
		if (initialDeposit.equals("y")) {
		    System.out.print("Enter initial deposit value: ");
		    double initialValue = sc.nextDouble();
		    ac = new Account (accountNumber, accountHolder, initialValue);
            
		}else if (initialDeposit.equals("n")) {
		    ac = new Account (accountNumber, accountHolder);
            
		}else {
		    System.out.println("Invalid input.");
            return;
		}
        
		System.out.println("Account data: ");
		System.out.println(ac.accountData());
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		
		ac.deposit(deposit);
		System.out.println(ac.accountData());
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		
		ac.withdraw(withdraw);
		System.out.println(ac.accountData());

        sc.close();
	}
}
