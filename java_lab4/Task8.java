package java_lab4;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the day, month and year in numeric value \nEnter Day");
        int day = input.nextInt();
        System.out.println();

        System.out.println("Enter month");
        int month = input.nextInt();
        System.out.println();

        System.out.println("Enter year. write only last two digits of the year");
        int year = input.nextInt();

        int magicDate = day * month;
        if (magicDate == year) {
            System.out.println("the date is  magic.");
        } else {
            System.out.println("the date is not magic.");
        }

    }
}
