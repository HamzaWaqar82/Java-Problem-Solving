import java.util.*;
public class Factorial10
{
    /*Implement a java program that inputs a number from user and calculate 
and display its factorial. */ 
// 5f = 5*4*3*2*1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number to find factorial: ");
        int num = sc.nextInt();
        
        int factorial = 1;
        for (int i = num; i>0; i--) {
            factorial = factorial*i;
        } 
        System.out.println("Factorial of " + num + " is " + factorial);
        sc.close();
    }
}
