package BankAccount;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Operation {
	private String operationName;
	private double amount;
	private Date date;
	
	// Constructor of operation
		public Operation(String operationName, double amount){
			this.setAmount(amount);
			this.setOperationName(operationName);
			this.setDate(new Date());
		}
	
		
	// Constructor of Operation done at a certain date
		public Operation(String operationName, double amount, Date date){
			this(operationName, amount);
			this.setDate(date);
		}
	
	// print the operation
		public String printOperation(){
		String operation= new String();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		operation= operationName +"  " + amount + "  "+ dateFormat.format(date);
		return operation;	
	}

	
	//Getters and setters	
		public String getOperationName() {
			return operationName;
		}
	
		public void setOperationName(String operationName) {
			this.operationName = operationName;
		}
	
	
		public double getAmount() {
			return amount;
		}
	
		
		public void setAmount(double amount) {
			this.amount = amount;
		}
	
		
		public Date getDate() {
			return date;
		}
	
		public void setDate(Date date) {
			this.date = date;
		}
}
