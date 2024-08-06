package java_lab4;
import java.util.*;

public class Activity3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double wages, rate, hours ;

        System.out.println("enter the hours: ");
        hours = input.nextDouble();
        System.out.println();

        System.out.println("enter the pay rate : ");
        rate = input.nextDouble();
        System.out.println();

        if (hours>40) {
            wages = hours * rate + 1.5*rate * (hours-40);
        } else {
            wages = hours * rate;
        }
        System.out.printf("The wages are $%.2f %n", wages);
    }
}
