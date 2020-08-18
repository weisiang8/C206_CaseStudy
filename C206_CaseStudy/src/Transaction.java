import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
	
	private LocalDateTime txnDate;
	private String type;
	private String ccyIn;
	private double amtIn;
	private String ccyOut;
	private double amtOut;
	private double rate;
	
	public Transaction(LocalDateTime txnDate, String type, String ccyIn, double amtIn, String ccyOut, double amtOut,
			double rate) {
		this.txnDate = txnDate;
		this.type = type;
		this.ccyIn = ccyIn;
		this.amtIn = amtIn;
		this.ccyOut = ccyOut;
		this.amtOut = amtOut;
		this.rate = rate;
	}

	public LocalDateTime getTxnDate() {
		return txnDate;
	}

	public String getType() {
		return type;
	}

	public String getCcyIn() {
		return ccyIn;
	}

	public double getAmtIn() {
		return amtIn;
	}

	public String getCcyOut() {
		return ccyOut;
	}

	public double getAmtOut() {
		return amtOut;
	}

	public double getRate() {
		return rate;
	}
	
	public String toString() {
//		txnDate = LocalDateTime.now();

		// Inbuilt format
//		DateTimeFormatter format = DateTimeFormatter.ISO_DATE_TIME;
//		 
//		// Custom format
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		 
		// Format LocalDateTime
//		String formattedDateTime = txnDate.format(formatter);
		String output = String.format("%-20s %-20s %-20s %-20.6f %-20s %-20.6f %-20.6f\n", 
				"18/8/2020",
				type, 
				ccyIn,
				amtIn,
				ccyOut,
				amtOut,
				rate
				);
		
		return output;
		
	}
	
	
	
	
	
	
	
	
	
}
