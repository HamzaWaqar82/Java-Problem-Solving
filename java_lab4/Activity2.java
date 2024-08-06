package java_lab4;
import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("PLease enter any number : ");
        int number = input.nextInt();

        if (number%5 == 0) {
            System.out.println("HiFive");}
        if (number % 2== 0) {
            System.out.println("HiEven");
        }
    }
}
