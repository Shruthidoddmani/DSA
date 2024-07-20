// Problem statement
// You have been given a random integer array/list(ARR) and a number X. Find and return the triplet(s) in the array/list which sum to X.

// Note :
// Given array/list can contain duplicate elements.
// Detailed explanation ( Input/output format, Notes, Images )
// Constraints :
// 1 <= t <= 10^2
// 0 <= N <= 10^3
// 0 <= X <= 10^9

// Time Limit: 1 sec
// Sample Input 1:
// 1
// 7
// 1 2 3 4 5 6 7 
// 12
// Sample Output 1:
// 5
// Sample Input 2:
// 2
// 7
// 1 2 3 4 5 6 7 
// 19
// 9
// 2 -5 8 -6 0 5 10 11 -3
// 10
// Sample Output 2:
// 0
// 5


//  Explanation for Input 2:
// Since there doesn't exist any triplet with sum equal to 19 for the first query, we print 0.

// For the second query, we have 5 triplets in total that sum up to 10. They are, (2, 8, 0), (2, 11, -3), (-5, 5, 10), (8, 5, -3) and (-6, 5, 11)
// import java.util.Arrays;

// public class Solution {

// 	public static int tripletSum(int[] arr, int num) {
// 		Arrays.sort(arr);
// 		int n = arr.length;
// 		int ans = 0;
// 		for (int i = 0; i < n - 3; i++) {
// 			// System.out.println("ygth");



import java.util.Arrays;
public class TripletSum_TE {
    
    public static int tripletSum(int[] arr, int num) {
		Arrays.sort(arr);
		int n = arr.length;
		int ans = 0;
		for (int i = 0; i < n - 3; i++) {
			// System.out.println("ygth");
			int low = i+1;
			int high = n - 1;
			while (low < high) {
				int sum = arr[i] + arr[low] + arr[high];
				if (sum == num) {
					ans += 1;
					int tempHigh = high -1;
					while (tempHigh > low) {
						// System.out.println("--");
						if (arr[tempHigh] == arr[high]) {
							ans += 1;
							tempHigh--;
							
						} else break;
					}
					low++;
				} else if (sum > num) {
					high--;
				} else {
					low++;
				}
			}
		}
		return ans;
	}
    public static void main(String[] args){
        int[] arr = {2, 3, 4, 6, 8, 9, 1, 2, 4, 6, 4, 0};
        int result = tripletSum(arr, 6);
        System.out.println(result);
    }
}
