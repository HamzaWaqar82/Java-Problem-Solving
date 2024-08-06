package Java_lab3;

import java.util.Scanner;

public class Task1 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the amount");
        double amount = input.nextDouble();
        double amountCents = amount*100;
        double dollars = amountCents/100;
        double remainingCents = amountCents%100;
        
        double quarters = remainingCents/25;
         remainingCents = remainingCents%25;
        
        double dimes = remainingCents/10; 
        remainingCents = remainingCents%10;
       
       
       double nickels = remainingCents/5;
       remainingCents = remainingCents%5;
       
       double penies = remainingCents;
       System.out.print(penies);
       
       
    }
}
