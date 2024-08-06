package java_lab4;
import java.util.*;

public class Activity1 {

    public static void main(String[] args) {
        System.out.println(" Enter a year :");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        boolean isLeapYear = (year % 4 == 0 && year % 100 !=0) || (year % 400 == 0) ;
        System.out.println(year + " is a leap year? " + isLeapYear);
    }
}