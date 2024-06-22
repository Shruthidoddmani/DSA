// Problem statement
// Print the following pattern for the given N number of rows.

// Pattern for N = 4
//    1
//   2 2
//  3 3 3
// 4 4 4 4

// Sample Input 1:
// 5
// Sample Output 1:
//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5

import java.util.Scanner;

public class PyramindOfNumbers {
     public static void main(String ar[])  
    {  
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        for( int i=1; i<=n; i++ ){
            System.out.print(" ");
            for( int j=1; j<= n-i; j++ ){
                System.out.print(" ");
            }
            for( int j=1; j<= i; j++ ){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    } 
}
