package Assignment1;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number");
       int number = input.nextInt();
       int reversedNum = 0, temp =number;

       while (temp>0) {
        int remainder = temp%10;
        reversedNum = reversedNum*10 +remainder;
        temp = temp/10;

       }



        if (number == reversedNum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
