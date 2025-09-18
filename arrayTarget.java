public class arrayTarget {
	
	public static int num[];
	public static int target;
	
	public static void findTargetFromArray(int num[], int target) {
		
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] + num[j] == target) {
					System.out.println("Output: [" + i + ", " + j + "]");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int num[] = {0, 4, 3, 0};
		int target = 0;
		
		findTargetFromArray(num, target);
		
	}
}