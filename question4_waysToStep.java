import java.util.Scanner;

public class question4_waysToStep {

	public static boolean nextCase = true;
	public static int n;
	
	static int waysToClimb(int n) {
		
		if (n == 1 || n == 0) {
			return 1; 
		}
		// The n == 0 took me a while to figure out. 
		// It's to account for the (n-2) when there are two steps left.
		// So we got to 0 because 2-2 = 0. That's 1 double step. 
		// From here it also obviously accounts for (n-1) when n = 1.
		
		return waysToClimb(n-2) + waysToClimb(n-1);
		// It needed writing on a paper to figure this out.
		// Try it. Start with an n and don't forget the '+'
		// It's a long series of basically 1+1s that become 2+2s.
		// And so on and so forth.
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		while (nextCase) {
			
			System.out.print("Select text case [1-5]: ");
			int testCase = scan.nextInt();
			
			switch (testCase) {
				case 1:
					n = 2; // Expected Output: 2
					System.out.println(waysToClimb(n));
					break;
				case 2:
					n = 3; // Expected Output: 3
					System.out.println(waysToClimb(n));
					break;
				case 3:
					n = 4; // Expected Output: 5
					System.out.println(waysToClimb(n));
					break;
				case 4:
					n = 5; // Expected Output: 8
					System.out.println(waysToClimb(n));
					break;
				case 5:
					n = 10; // Expected Output: 89
					System.out.println(waysToClimb(n));
					break;
				default:
					System.out.println("Exiting.");
					nextCase = false;
			}			
			
		}
		
		scan.close();
	}
}