// Inverted Half Pyramid
import java.util.*;
class Inverted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enterthe number of rows:");
        int n = sc.nextInt();
        for( int i = n; i>=1; i--){
            for( int j = 1; j <=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
