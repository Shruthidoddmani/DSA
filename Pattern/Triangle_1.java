// Print the following pattern for the given N number of rows.

// Pattern for N = 3
// 1
// 22
// 333


// Sample Input1:
// 5
// Sample Output 1:
// 1
// 22
// 333
// 4444
// 55555
// Sample Input 2:
// 4
// Sample Output 2:
// 1
// 22
// 333
// 4444





import java.util.Scanner;

public class Triangle_1 {
    public static void main(String[] args)
	
	 {
		 Scanner s = new Scanner(System.in);
		 int n = s.nextInt();
         s.close();
		 for(int i = 1; i <= n; i++){
			 for(int j = 1; j <= i; j++){
				 System.out.print(i);
		 	}
			 System.out.println();
		 }
	}
}
