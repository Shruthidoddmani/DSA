// Problem statement
// Sort the given unsorted array 'arr' of size 'N' in non-decreasing order using the selection sort algorithm.



//  Note:
// Change in the input array/list itself. 


// Example:
// Input:
// N = 5
// arr = {8, 6, 2, 5, 1}

// Output:
// 1 2 5 6 8 



public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int length = arr.length;
        for(int i =0; i< length -1 ; i++){
            for(int j=0; j< length -1-i; j++) {
                if(arr[j+1+i] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j+1+i];
                    arr[j+1+i] = temp;
                }
            }
        }
    }
}
