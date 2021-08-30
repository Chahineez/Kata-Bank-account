package BankAccount;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create account for the user
		Account myAccount = new Account();
		
		
		while (true) {
		// ask for operations 
		System.out.println("\nPlease choose an operation by writing its number : \n "
				+ "1/ See my balance\n"
				+ " 2/ Deposit an amount\n"
				+ " 3/ Withdraw an amount\n"
				+ " 4/ Print my statement\n");
       
		
		
		Scanner s = new Scanner(System.in);
        // Read the value
        int numChoice = s.nextInt();
        // Make operation according to numChoice
        switch (numChoice) {
        
        case 1: // See my balance
        	System.out.println("Your balance : "+ myAccount.getBalance());
        	break;
        	
        case 2: // Deposit an amount
        	System.out.println("Please enter the amount");
            double amount1 = s.nextDouble();
            myAccount.deposit(amount1);
            break;
            
        case 3: //Withdraw an amount
        	System.out.println("Please enter the amount");
            double amount2 = s.nextDouble();
            myAccount.withdrawal(amount2);
            break;
        	
        case 4: //Print the statement
        	myAccount.printStatement();
        	break;
        }        
				
	  }
	}

}
