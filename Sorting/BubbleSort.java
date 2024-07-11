
import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSort(int[] arr, int n) {
        for (int frequency = 0; frequency < n - 1; frequency++) {
            for (int innerPass = 0; innerPass < n - 1 - frequency; innerPass++) {
                if (arr[innerPass] > arr[innerPass + 1]) {
                    int temp = arr[innerPass];
                    arr[innerPass] = arr[innerPass + 1];
                    arr[innerPass + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
