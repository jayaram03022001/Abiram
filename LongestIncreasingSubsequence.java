import java.util.Scanner;
public class LongestIncreasingSubsequence {
private static int longestIncreasingSubsequenceEndingAt(int[] a,int i) {
			if (i == 0) {
			return 1;
			}
			int lisEndingHere = 1;
			for (int j = 0;j<i ; j++) {
			if (a[i] > a[j]) {
			lisEndingHere = Math.max(lisEndingHere,
			longestIncreasingSubsequenceEndingAt(a, j) +1);
			}
			}
			return lisEndingHere;
			}
			private static int findLengthOfLongestIncreasingSubsequence(int[]a, int n) {
			int lis = 1;
			for (int i = 0; i < n; i++) {
			lis = Math.max(lis, longestIncreasingSubsequenceEndingAt(a,i));
			}
			return lis;
			}
			public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);
			System.out.printf("Enter the element :" );
			int n = keyboard.nextInt();
			int[] a = new int[n];
			for (int i = 0; i <n; i++) {
			a[i] = keyboard.nextInt();
			}
			keyboard.close();
			System.out.printf("Length of longest increasing subsequence =%d%n",
			findLengthOfLongestIncreasingSubsequence(a, n - 1));
			}
			}

	
	
	
		
	


