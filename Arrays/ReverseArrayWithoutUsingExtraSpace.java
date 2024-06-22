// Problem Statement
// Given an array 'arr' of size 'n'.



// Return an array with all the elements placed in reverse order.

// Note:
// You don’t need to print anything. Just implement the given function.

// Sample Input 1:
// 8
// 3 1 1 7 4 2 6 11
// Sample Output 1:
// 11 6 2 4 7 1 1 3    
// Explanation Of Sample Input 1 :
// After reversing the array, it looks like this [11, 6, 2, 4, 7, 1, 1, 3].
// Sample Input 2:
// 4
// 8 1 3 2
// Sample Output 2:
// 2 3 1 8
// Explanation Of Sample Input 2 :
// After reversing the array, it looks like this [2, 3, 1, 8].
// Constraints:
// 1 <= 'n' <= 10^6
// -10^9 <= 'arr[i]' <=10^9

import java.util.Scanner;

public class ReverseArrayWithoutUsingExtraSpace {
    public static int[] reverseArray(int n, int[] nums) {
        int leftIndex = 0;
        int rightIndex = n - 1;
        while (leftIndex < rightIndex) {
            int temp = nums[leftIndex];
            nums[leftIndex] = nums[rightIndex];
            nums[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
        return nums;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arraySize = s.nextInt();
        int nums[] = new int[arraySize];
        for( int i=0; i< arraySize ; i++) {
            nums[i] = s.nextInt();
        }

        reverseArray(arraySize, nums);
        
        for( int i=0; i< arraySize ; i++) {
            System.out.print(nums[i] +" ");
        }

    }
}
