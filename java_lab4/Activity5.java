package java_lab4;
import java.util.Scanner;

public class Activity5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println(" Enter 1, 2 or 3: ");
        int number = input.nextInt();

        switch (number) {
            case 1:
                System.out.println(" you entered number 1:");
                break;
        
            case 2:
                System.out.println(" you entered number 2:");
                break;
        
            case 3:
                System.out.println(" you entered number 3:");
                break;
        
            default:
            System.out.println(" That's not 1, 2, or 3. ");
                break;
        }
    }
}
