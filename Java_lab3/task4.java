package Java_lab3;

import java.util.Scanner;

public class task4 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes passed ");
        int minutesPassed = input.nextInt();
        
        int hours = minutesPassed/60;
        
        int min= minutesPassed%60;
        
        System.out.println("The time is  " + hours + " : "+ min+ "am");
    }
}
