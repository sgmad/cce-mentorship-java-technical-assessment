import java.util.Scanner;

public class question3_StringToIntegerProduct {
	
	public static String num1, num2;
	public static boolean nextCase = true;
	
	public static void multiplyStrings(String num1, String num2) {
		
		int num1int = Integer.parseInt(num1);
		int num2int = Integer.parseInt(num2);
		
		int product = num1int * num2int;
		String productToString = Integer.toString(product);
		
		System.out.println("Output: " + productToString);
	}

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		while (nextCase) {
			
			System.out.print("Select text case [1-5]: ");
			int testCase = scan.nextInt();
			
	        switch (testCase) {
	            case 1:
	            	num1 = "2";
	        		num2 = "3";
	        		// Expected Output: "6"
	        		multiplyStrings(num1, num2);
	                break;
	            case 2:
	            	num1 = "123";
	        		num2 = "456";
	        		// Expected Output: "56088"
	        		multiplyStrings(num1, num2);
	                break;
	            case 3:
	            	num1 = "0";
	        		num2 = "12345";
	        		// Expected Output: "0"
	        		multiplyStrings(num1, num2);
	                break;
	            case 4:
	            	num1 = "999";
	        		num2 = "999";
	        		// Expected Output: "998001"
	        		multiplyStrings(num1, num2);
	                break;
	            case 5:
	            	num1 = "1234";
	        		num2 = "0";
	        		// Expected Output: "0"
	        		multiplyStrings(num1, num2);
	                break;
	            default:
	            	System.out.println("Invalid choice. Exiting.");
	                nextCase = false;
	                break;
	        }
		}

		scan.close();
	}
}