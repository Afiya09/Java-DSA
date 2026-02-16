import java.util.*;

class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle:");
        int l = sc.nextInt();
        System.out.println("Enter the breadth of rectangle: ");
        int b = sc.nextInt();

        for(int i = 1; i <=l; i++){
            for( int j = 1; j <= b; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
        
    }
    
}
