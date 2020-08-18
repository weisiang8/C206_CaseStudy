import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class C206_CaseStudy {

	private static final int ADD = 1;
	private static final int VIEW = 2;
	private static final int transaction_choice = 5;
	static ArrayList<Currency> currencyList = new ArrayList<Currency>();


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Transaction> transactionList = new ArrayList<Transaction>();
		LocalDateTime date = LocalDateTime.now();
		transactionList.add(new Transaction(date,"buy","SGD",100.0,"USD",730.4,0.7304));
		//		transactionList.add(new Transaction(date,"sell","USD",100,"SGD", 877200.0,877.2000));

		currencyList.add(new Currency("KRW", "Korean Won", 880.2816, 877.2000));
		currencyList.add(new Currency("USD", "United States Dollar", 0.7304,0.7278));
		int option = 0;

		int exit = 6;
		while (option != exit) {
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");
			if(option == 1) {

			}
			else if(option == transaction_choice) {
				inMenu();
				int choice = Helper.readInt("Enter an option > ");
				if(choice == ADD) {
					Transaction t = inputTransaction();
					addTransaction(transactionList,t);
				}
				else if(choice == VIEW) {
					
					viewAllTransaction(transactionList);
				}
				else {
					Transaction t = inputTransaction();
					
				}
			}
		}
	}



	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
	public static void inMenu() {
		C206_CaseStudy.setHeader("Money Exchange");
		System.out.println("1. Add");
		System.out.println("2. View");
		System.out.println("3. Delete");
	}
	public static void menu() {
		C206_CaseStudy.setHeader("Money Exchange");
		System.out.println("1. Currency");
		System.out.println("2. Amount of holding ");
		System.out.println("3. Loan item");
		System.out.println("4. Return item");
		System.out.println("5. Transaction");
		System.out.println("6. Quit");
		Helper.line(80, "-");
	}
	private static Transaction inputTransaction() {
		// TODO Auto-generated method stub
		String type = Helper.readString("Enter type > ");
		String cynIn = Helper.readString("Enter Currency In > ");
		double amount = Helper.readDouble("Enter Amount In > ");
		String cynOut = Helper.readString("Enter Currency Out > ");
		double rate = 0;
		for(int i = 0; i < currencyList.size(); i++) {
			if(type.equals("buy")) {
				if(cynOut.equals("USD")){
					rate = currencyList.get(i).getBuyRate();
				}
			}
			else if(type.equals("sell")) {
				if(cynIn.equals("USD")){
					rate = currencyList.get(i).getSellRate();
				}
			}

		}
		double amountOut = amount * rate;

		LocalDateTime date = LocalDateTime.now();
		//		DateTimeFormatter format = DateTimeFormatter.ISO_DATE_TIME;
		//		LocalDateTime date = LocalDateTime.parse(dateString, format);
		Transaction t = new Transaction(date,type,cynIn, amount, cynOut, amountOut, rate);
		return t;
	}
	public static void deleteTransaction(ArrayList<Transaction> transactionList, Transaction t) {
		transactionList.remove(t);
		viewAllTransaction(transactionList);
	}
	public static void addTransaction(ArrayList<Transaction> transactionList, Transaction t) {

		transactionList.add(t);
		viewAllTransaction(transactionList);
	}
	public static String retrieveAllTransaction(ArrayList<Transaction> transactionList) {
		String output = "";

		for (int i = 0; i < transactionList.size(); i++) {

			String string = transactionList.get(i).toString();
			output += String.format("%-146s\n" , string );
		}
		return output;
	}
	public static void viewAllTransaction(ArrayList<Transaction> transactionList) {
		C206_CaseStudy.setHeader("TRANSACTION LIST");
		String output = String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "Date", "TYPE",
				"CCY_IN", "AMT_IN","CCY_OUT","AMT_OUT","RATE");
		output += retrieveAllTransaction(transactionList);	
		System.out.println(output);
	}
















}
