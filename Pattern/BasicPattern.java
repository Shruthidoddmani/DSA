// Print the following pattern for the given N number of rows.

// Pattern for N = 3
// ###
// ###
// ###

// Sample Input1:
// 5
// Sample Output 1:
// #####
// #####
// #####
// #####
// #####
// Sample Input 2:
// 4
// Sample Output 2:
// ####
// ####
// ####
// ####


import java.util.Scanner;


public class BasicPattern
{
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
         sc.close();
		 for(int i=0; i< num; i++) {
			 for(int j=0; j< num; j++) {
				 System.out.print("#");
			 }
			 System.out.println();
		 }
	}
}