// Problem statement
// You have been given an integer array/list(ARR) of size N. It has been sorted(in increasing order) and then rotated by some number 'K' (K is greater than 0) in the right hand direction.

// Your task is to write a function that returns the value of 'K', that means, the index from which the array/list has been rotated.

// Constraints :
// 1 <= t <= 10^2
// 2 <= N <= 10^5
// Time Limit: 1 sec
// Sample Input 1:
// 1
// 6
// 5 6 1 2 3 4
// Sample Output 1:
// 2
// Sample Input 2:
// 2
// 5
// 3 6 8 9 10
// 4
// 10 20 30 1
// Sample Output 2:
// 0
// 3



public class CheckArrayRotation {

    public static int arrayRotateCheck(int[] arr){
    	for(int i=0; i< arr.length ;i++) {
            if( i+1 < arr.length &&  ! (arr[i] < arr[i+1])){
                return i + 1;
            }
        }
        return 0;
    }

