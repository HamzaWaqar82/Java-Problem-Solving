package Java_lab3;

import java.util.Scanner;
import java.lang.Math;

public class task5 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter amount of daily milk produced  ");
        int dailyMilkProducd= input.nextInt();
        
        double cortonsRequired = dailyMilkProducd/3.78;
        System.out.println("cortons required: "+ Math.ceil(cortonsRequired));
        
        double costOfMilk = dailyMilkProducd*0.38;
        System.out.println("cost of daily milk produced is "+ costOfMilk);
        double profitForMilk = dailyMilkProducd*0.27;
        System.out.printf("profit of daily milk produced is " + "%.2f\n",  profitForMilk);
    }
}
