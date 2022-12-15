package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "rings";
		bookTitle = "Lord of the rings";
		
		
		if(bookTitle.contains(wordChoice)) {
			System.out.println("This book title contains ring");
		}
		
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome")){
			System.out.println("This browser is Chrome");
		}
		
		
		String firstName = "Glenn";
		String lastName = "Traver";
		String SSN = "2353252356";
		
		System.out.println("There are " + SSN.length() + " digits in your SSN.");
		
		//print the initials plus the last 4 digits of SSN
		
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.substring(0, 1));
		System.out.println(SSN.substring(6));

	}

}
