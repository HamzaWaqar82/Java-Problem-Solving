
import java.util.*;
public class PrintNTimes
{
    /* Write a program that takes a number n from user and prints ‘A’ n times 
using for loop. */ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number ");
        int num = sc.nextInt();
        
        for (int i = 0; i < num ; i++ ){
            System.out.print("A" + " ");
        } 
        
        sc.close();
    }
}
