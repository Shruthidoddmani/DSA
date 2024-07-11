import java.util.Scanner;

public class Binarysearch {
    public static int search(int[] nums, int target) {
        int leftIndex = 0, rightIndex = nums.length - 1;
        while (leftIndex <= rightIndex) {
            int midIndex = (int) (leftIndex + rightIndex) / 2;
            if (nums[midIndex] == target) {
                return midIndex;
            } else if (nums[midIndex] < target) {
                leftIndex = midIndex + 1;
            } else if (nums[midIndex] > target) {
                rightIndex = midIndex - 1;
            }
        }
        return -1;
    }
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int x = s.nextInt();
        int result = search(arr, x);
        System.out.print(result);
    }
}
