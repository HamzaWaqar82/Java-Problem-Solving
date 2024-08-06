package java_lab4;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number f books purchased");
        int booksPurchased = input.nextInt();

        int pointsEarned;

        if (booksPurchased == 0) {
            pointsEarned = 0;
            System.out.println(" points Earned = " + pointsEarned);

        } else if (booksPurchased == 1) {
            pointsEarned = 5;
            System.out.println(" points Earned = " + pointsEarned);
        } else if (booksPurchased == 2) {
            pointsEarned = 15;
            System.out.println(" points Earned = " + pointsEarned);
        } else if (booksPurchased == 3){
            pointsEarned = 30;
            System.out.println(" points Earned = " + pointsEarned);
        } else if (booksPurchased == 4) {
            pointsEarned = 60;
            System.out.println(" points Earned = " + pointsEarned);
        }
    }
}
