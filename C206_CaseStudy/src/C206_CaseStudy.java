
public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int option = 0;

		int exit = 6;
		while (option != exit) {
			C206_CaseStudy.menu();
			if(option == 1) {
				
			}
			else if(option == 5) {
				
			}
		}
	}
	
	
	
	
	
	
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
	public static void menu() {
		C206_CaseStudy.setHeader("RESOURCE CENTRE APP");
		System.out.println("1. Currency");
		System.out.println("2. Amount of holding ");
		System.out.println("3. Loan item");
		System.out.println("4. Return item");
		System.out.println("5. Transaction");
		System.out.println("6. Quit");
		Helper.line(80, "-");
	}

}
