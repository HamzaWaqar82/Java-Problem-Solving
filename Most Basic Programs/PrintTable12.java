
import java.util.*;
public class PrintTable12
{
    /*. . Implement a java program that inputs a number and displays its table using 
do-while loop. */ 
// 5 = 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to find table: ");
        int num = sc.nextInt();
        
        System.out.printf("%10s %15s %15s\n", "Number", "Multipier", "Result" );
        int i = 1;
        do {
            System.out.printf("%6d %7s %7d %7s %10d\n", num, "*", i, "=", num*i);
            i++;
        } while (i <= 10);  
        sc.close();
    }
}
