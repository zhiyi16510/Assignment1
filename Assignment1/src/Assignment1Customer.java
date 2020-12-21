import java.util.Scanner;

public class Assignment1Customer {

	public static void main(String[] args) {
		// TEOH ZHI YI 278645 (CREDIT CARD) 21 December 2020
		//1. ASK DETAIL PERSONAL BACKGROUND
		//2. ASK WHAT PRODUCT OR SERVICES THEY PROVIDE
		//3. WHAT PRICE PER QUANTITY OR HOW MUCH THE SERVICE CHARGE PER HOUR
		//4. ASK CUSTOMER HOW MANY ITEM AND QUANTITY OR HOW MANY SERVICES THEY WOULD LIKE TO ORDER
		//5. TOTAL PRICE NEED TO BE PAID
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Welcome to Bank Harimau, please enter any key to continue.");
		System.out.println("Please enter your name: ");
		String name = in.next();
		System.out.println("Please enter your identity card number: ");
		String ic = in.next();
		System.out.println("Please enter your home address: ");
		String address = in.next();
		
		System.out.println("Please enter your age: ");
		int age = in.nextInt();
		if(age>=18) {
			System.out.println("Congratulations! You are qualified to move onto the next step.");
		} else if(age<18) {
			System.out.println("Oops, seems like you are not qualified to apple credit cards.");
		}
		
		System.out.println("Please enter your income per annum: ");
		int income = in.nextInt();
		if(income>=24000) {
			System.out.println("Congratulations! You are qualified to apply credit cards from Bank Harimau");
		} else if(income<24000) {
			System.out.println("Oops, you have not achieved the minimum eligibility for new credit card holders.");
		}
		
		if(income>=50000) {
			System.out.println("Type of credit card(s) provided are 'Platinum Credit Card', 'Gold Credit Card' and 'Signature Credit Card'.");
		} else if(income<50000 && income>=24000) {
			System.out.println("Type of credit card(s) provided are 'Classic Credit Card' and 'Harimau Credit Card");
		}
		
		if(income>=50000) {
			System.out.println("The annual fees is RM130 and the interest rate per month is 1.30% to 1.70%.");
		} else if(income>=24000 && income<50000) {
			System.out.println("The annual fees is RM60 and the interest rate per month is 1.25% to 1.50%.");
		}
		
		System.out.println("Please enter the type of the credit card you are interested to apply: ");
		String card = in.next();
		if(income>=50000) {
			System.out.println("The maximum amount of credit cards you can apply is 2.");
		} else if(income>=24000 && income<50000) {
			System.out.println("The maximum amount of credit cards you can apply is 1.");
		}
		
		int sum2 = 1*60*3;
		if(income>=24000 && income<50000) {
			System.out.println("The total fees you have to pay is " + sum2);
		} else if(income>=50000) {
			System.out.println("Please enter the amount of credit cards you would like to apply: ");
			int num = in.nextInt();
			int sum1 = num*130*3;
			System.out.println("The total fees you have to pay is " + sum1);
		}
		
		System.out.println();
		System.out.println("Thank you for using Bank Harimau.");
		
		in.close();

	}

}
