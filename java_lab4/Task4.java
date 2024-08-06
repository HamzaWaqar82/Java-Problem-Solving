package java_lab4;
import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;
        
        System.out.println(" Enter number 1");
        num1 = input.nextInt();

        System.out.println(" Enter number 2");
        num2 = input.nextInt();

        if (num1 >num2 ) {
            System.out.println("The smallest integer is: " + num2);
        } else {
            System.out.println("The smallest integer is: " + num1);
        }


        System.out.println(" Enter number 3");
        num3 = input.nextInt();

        if (num1 < num2) {
            if (num1 < num3) {
                System.out.println("The smallest integer is : " + num1);
            } else {
                System.out.println(" The smallest integer is : " + num3);
            }
        } else {
            System.out.println(" The smallest integer is num2"+num2);
        }

    }
}
