
import java.util.*;
public class SumOfSquaresOfNums15
{
    /*. Write a program in java that inputs a positive integer number "n" from the 
user and finds sum of the square of the integers from 1 to "n" using for 
loop.                  
(i.e. sum = 12 + 22 + 32 + ---- + n2)*/ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number ");
        int num = sc.nextInt();
        
        int sum  = 0;
        for (int i = 1; i <= num ; i++ ){
            sum += i*i;
        } 
        System.out.print("Sum = " + sum);
        sc.close();
    }
}
