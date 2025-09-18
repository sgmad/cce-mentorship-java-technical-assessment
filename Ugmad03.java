public class Ugmad03 {
	
	public static String num1, num2;
	
	public static void multiplyStrings(String num1, String num2) {
		
		int num1int = Integer.parseInt(num1);
		int num2int = Integer.parseInt(num2);
		
		int product = num1int * num2int;
		String productToString = Integer.toString(product);
		
		System.out.println("Output: " + productToString);
	}

	public static void main(String[] args) {
		
		num1 = "123";
		num2 = "456";
		
		multiplyStrings(num1, num2);

	}
}