package BankAccount;
public class Account {	

		// 	Account balance
			private double balance;
		
		// 	The minimum possible balance
			private double min;
					
		//	Account statement
			private Statement statement;
						
			
		// Account constructor	
			public Account(){
				
				statement = new Statement();
				balance = 0;
				
		//  The minimum possible balance. it depends on the bank
				this.min = -100;
			}
			
			public Account(double balance, double min){
				this();
				this.balance = balance;
				this.min = min;
			}

		// Make a withdrawal of an amount
			public void withdrawal(double amount){
					
					// Testing whether this withdrawal is permitted or not 
					if( (balance-amount) >= min){
						Operation operation = new Operation("WITHDRAWAL ", amount);
						// save this operation for the statement historical
						statement.saveOperation(operation); 
						balance -= amount; // subtract the amount from the balance
						System.out.println("Operation done successfully !");
					}
					else
						System.out.println("Withdrawal impossible, please recheck your balance !");
				}
				
				
				
		 // Make a deposit			
			public void deposit(double amount){
						Operation operation=new Operation("DEPOSIT   ",amount);
						// save this operation for the statement historical
						statement.saveOperation(operation);
						balance += amount; // add the amount to the account balance
						System.out.println("Operation done successfully !");
					
				}
				
				
		 // Printing the statement
			public void printStatement(){
					System.out.println("Printing your statement");
					System.out.println("____________________________");	
					System.out.println("OPERATION     AMOUNT      DATE ");
					System.out.println("_____________________________");	
					System.out.println(statement.printStatement());
					System.out.println("Balance:   "+balance);
					System.out.println("_____________________________");
				}
			
				
		// Get the actual balance
			public double getBalance() {
					return balance;
				}
				 

			
}
