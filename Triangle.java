//0-1 Triangle
import java.util.*;

class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        int num = 1;
        for( int i = 1; i <= n; i++){
            for( int j = 1; j <=i; j++){
                System.out.print(num  +" ");
                num = (num == 1) ? 0 : 1;
            }
            System.out.println( );
        }
        sc.close();
    } 
}
