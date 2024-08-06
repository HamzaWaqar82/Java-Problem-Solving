package java_lab4;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" please enter a number between 1 to 10: ");
        int number = input.nextInt();
        if (number < 10) {
            if (number == 1) {
                System.out.println("I");
            } else if (number == 2) {
                System.out.println("II");
            } else if (number == 3) {
                System.out.println("III");
            } else if (number == 4) {
                System.out.println("IV");
            } else if (number == 5) {
                System.out.println("V");
            } else if (number == 6) {
                System.out.println("VI");
            } else if (number == 7) {
                System.out.println("VII");
            } else if (number == 8) {
                System.out.println("VIII");
            } else if (number == 9) {
                System.out.println("IX");
            } else{
                System.out.println("X");
            }
        } else {
            System.out.println(" please enter number between 1 and 10");
        }


    }
}
