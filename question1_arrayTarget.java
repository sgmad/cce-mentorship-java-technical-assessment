import java.util.Scanner;

public class question1_arrayTarget {
	
	public static int num[];
	public static int target;
	public static boolean nextCase = true;
	
	public static void findTargetFromArray(int num[], int target) {
		
		
		// This nested loop basically starts with the first number in the array and check if all the other numbers add up to it to reach the target
		// If none of the other numbers pair up with the first one, we move on to the second and compare it to the rest as well
		// This entire structure is put under a labeled break to ensure "each input would have exactly one solution"
		
		entireLoop:
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] + num[j] == target) {
					System.out.println("Output: [" + i + ", " + j + "]");
					break entireLoop;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while (nextCase) {
			
			System.out.print("Select text case [1-5]: ");
			int testCase = scan.nextInt();
			
	        switch (testCase) {
	            case 1:
	                num = new int[] {2, 7, 11, 15};
	                target = 9; // Expected Output: [0, 1]
	        		findTargetFromArray(num, target);
	                break;
	            case 2:
	                num = new int[] {3, 2, 4};
	                target = 6; // Expected Output: [1, 2]
	        		findTargetFromArray(num, target);
	                break;
	            case 3:
	                num = new int[] {3, 3};
	                target = 6; // Expected Output: [0, 1]
	        		findTargetFromArray(num, target);
	                break;
	            case 4:
	                num = new int[] {1, 5, 3, 4};
	                target = 7; // Expected Output: [2, 3]
	        		findTargetFromArray(num, target);
	                break;
	            case 5:
	            	num = new int[] {0, 4, 3, 0};
	            	target = 0; // Expected Output: [0, 3]
	        		findTargetFromArray(num, target);
	                break;
	            default:
	            	System.out.println("Invalid choice. Exiting...");
	                nextCase = false;
	                break;
	        }
		}

		scan.close();
	}
}
