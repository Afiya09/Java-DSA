import java.util.*;

class Menu {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Enter the user choice either 1 or 0");
            choice = sc.nextInt();
            if(choice == 1){
                System.out.println("Enter the marks:");
                int marks = sc.nextInt();
                if(marks >= 90){
                    System.out.println("This is Godd");
                }
                else if (marks >=60 && marks <= 89){
                    System.out.println("This is also Good");
                }
                else {
                    System.out.println("This is Good as Well");
                }
            } 
        }while(choice !=0);
        sc.close();

    }
    
}
