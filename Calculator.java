import java.util.Scanner;
class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = sc.nextDouble();
        System.out.println("Enter the operation:");
        System.out.println("1. Addition\n2. Substraction\n3. Multiplication\n4. Division");
        int operation = sc.nextInt();
        double result = 0;
        switch(operation){
            case 1:
                result = num1 + num2;
                System.out.println("The result of additon is: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("The result of substraction is: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("The result of multiplication is: " + result);
                break;
            case 4:
                result = num1 / num2;
                System.out.println("The result of division is: " + result);
                break; 
            default:
                System.out.println("Invalid operation");
        }
        sc.close();

        
    }
}
