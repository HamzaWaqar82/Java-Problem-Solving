package Java_lab3;

import java.util.Scanner;

public class Activity5 {
    public static void main (String [] rgs){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter purchase amount :");
        double purchaseAmount = input.nextDouble();
        double tax = purchaseAmount*0.06;
        System.out.println("sales tax is "+ (int)(tax*100)/100.0);
    }
}
