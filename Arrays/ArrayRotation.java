// Problem statement
// There is an array ‘A’ of size ‘N’.

// You are also given an integer ‘X’ and direction ‘DIR’. You must rotate the array in the direction of ‘DIR’ by ‘X’ positions.

// You must return the rotated array.

// For example:

// Input :
// A = [6, 2, 6, 1], X = 1, DIR = ‘LEFT’

// Output :
// 2 6 1 6

// Explanation: Rotate array ‘A’ to the left one time.
// [6, 2, 6, 1] => [2, 6, 1, 6]
// Detailed explanation ( Input/output format, Notes, Images )
// Constraints :
// 1 <= T <= 10
// 1 <= N <= 10^5 
// 1 <= X <= 10^9
// ‘DIR’ is an element of {‘LEFT’, ‘RIGHT’}
// Time Limit: 1 sec
// Sample Input 1 :
// 2
// 4 1 LEFT
// 1 2 3 4
// 6 2 RIGHT
// 1 2 4 3 5 6 
// Sample Output 1 :
// 2 3 4 1
// 5 6 1 2 4 3
// Explanation Of Sample Input 1 :
// For test case one:

// Input :
// A = [1, 2, 3, 4], X = 1, DIR = ‘LEFT’

// Output :
// 2 3 4 1

// Explanation: Rotate array ‘A’ to the left one time.
// [1, 2, 3, 4] => [2, 3, 4, 1]

// For test case two:

// Input :
// A = [1, 2, 4, 3, 5, 6], X = 2, DIR = ‘RIGHT’

// Output :
// 5 6 1 2 4 3

// Explanation: Rotate array ‘A’ to the right one time.
// [1, 2, 4, 3, 5, 6] => [6, 1, 2, 4, 3, 5]
// Sample Input 2 :
// 2
// 6 3 LEFT
// 22 8 4 7 5 10
// 6 2 RIGHT
// 9 3 1 6 3 9
// Sample Output 2 :
// 7 5 10 22 8 4 
// 3 9 9 3 1 6 


public class ArrayRotation {
    public static void reverseArray(int[] a, int startIndex,int endIndex){
        for(int i = startIndex; i < endIndex; i++) {
            int temp = a[endIndex];
            a[endIndex] = a[i];
            a[i] = temp;
            endIndex--;
        }
    }

    public static int[] rotateArray(int[] a, int x, String dir) {
        int arraySize = a.length;
        if( x > arraySize) x = x % arraySize;
        reverseArray(a, 0, arraySize -1);
        
        if(dir.equals("RIGHT")){

                reverseArray(a, 0, x-1);
                reverseArray(a, x, arraySize -1);
        } 
        else {
            reverseArray(a, 0, arraySize-x-1);
            reverseArray(a, arraySize-x , arraySize-1);
        }
        return a;
    }
}
