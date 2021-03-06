package BankAccount;
import java.util.ArrayList;

public class Statement {
    private ArrayList <Operation> operationsList;
	
	// Constructor 
		public Statement(){
			 operationsList= new ArrayList<Operation> ();
		}
	
	// Save the new operation 
		public void saveOperation(Operation newOperation){
			operationsList.add(newOperation); // add the new operation to the array
		}
		
	// Print the statement
		public String printStatement(){
			String print = new String();
			if (operationsList.size() == 0) print = "No operation found !";
			else {
				for(int i=0; i < operationsList.size(); i++)
				{
					print += operationsList.get(i).printOperation() + "\n";
					//print += "\n";
				}
			}
			return print;
		}
	
}
