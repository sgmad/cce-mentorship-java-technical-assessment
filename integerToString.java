import java.util.Scanner;

public class integerToString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        try {
            String s = Integer.toString(n); // This was the only missing part of the program that we were told to fill in. This method converts an integer to a string.
            System.out.println("Good job");
            
        } catch (Exception e) {
            System.out.println("Wrong answer");
            
        }
        
        scanner.close();
    }
}