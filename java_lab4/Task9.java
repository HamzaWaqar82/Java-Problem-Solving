package java_lab4;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int pennies, nickels, dimes, quarters;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter pennies");
        pennies = input.nextInt();

        System.out.println("Enter nickels");
        nickels = input.nextInt();

        System.out.println("Enter dimes");
        dimes = input.nextInt();

        System.out.println("Enter quarters");
        quarters = input.nextInt();

        int cents = pennies + (nickels*20) + (dimes*10) + (quarters*25);
        float dollars = cents/100;

        if (cents == 100) {
            System.out.println("Congrats! you have won the game.");
        }else if (cents <100) {
            System.out.println("Your entered amount is equal to $"+dollars);
        } else{
            System.out.println("Your entered amount is equal to $"+dollars);
        }
    }
}
