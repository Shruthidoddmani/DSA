// Problem statement
// Print the following pattern for the given N number of rows.

// Pattern for N = 3
// 321
// 321
// 321

// Sample Input1:
// 5
// Sample Output 1:
// 54321
// 54321
// 54321
// 54321
// 54321
// Sample Input 2:
// 4
// Sample Output 2:
// 4321
// 4321
// 4321
// 4321

import java.util.Scanner;

public class SquareNumber
{
	public static void main(String[] args) 
	{
		 // write your code !!  
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		for(int i=1; i<= n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(n-j+1);
			}
			System.out.println();
		}


    }
		   
}