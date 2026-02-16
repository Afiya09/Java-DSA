//Take an array as input from user Search for a given number x and print the index at which it occurs.
import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to be searched");
        int x =  sc.nextInt();
        for ( int i =0; i<n; i++){
            if (arr[i]==x){
                System.out.println("The number is found at index "+ i);
            }
        }
        sc.close();
    }
}
