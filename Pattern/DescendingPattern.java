// Problem statement
// Print the following pattern for the given N number of rows.

// Note: Print spaces between the numbers. Pattern for N = 5
// 5 
// 5 4 
// 5 4 3 
// 5 4 3 2 
// 5 4 3 2 1

// Sample Input 1:
// 7
// Sample Output 1:
// 7
// 7 6
// 7 6 5 
// 7 6 5 4 
// 7 6 5 4 3 
// 7 6 5 4 3 2 
// 7 6 5 4 3 2 1
// Sample Input 2:
// 6
// Sample Output 2:
// 6
// 6 5 
// 6 5 4 
// 6 5 4 3 
// 6 5 4 3 2 
// 6 5 4 3 2 1

import java.util.Scanner;

public class DescendingPattern {
    public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 int n = s.nextInt();
         s.close();
		 for( int  i = 1; i <= n ; i++) {
			 int p = n;
			 for( int  j = 1; j <= i ; j++) {
				System.out.print(p + " ");
				p -= 1;
		 	}
			 System.out.println();
		 }
	}
}
