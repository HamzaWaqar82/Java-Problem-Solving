package Java_lab3;
import java.util.*;
public class task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = input.nextInt();
        if (number<0 || number>1000) {
            System.out.println("please enter number between 1 to 1000. ");
        } else {
            int  sum = 0;
            while (number>0) {
                int digit = number%10;
                sum = sum + digit;
                int num = number/10;
                number = num;
            }
            System.out.println("The sum of the digits of the number is: "+sum);
        }
    }
}
