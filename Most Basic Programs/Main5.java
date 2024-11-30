
import java.util.*;
public class Main5
{
    /*  Implement a java program that takes a number as input. If the number is in 
between 60 to 70. It should display “Required number” otherwise it should 
display “Not Required”. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number1: ");
        int number1 = sc.nextInt();
        
        
        if (number1 <= 60 && number1 >= 70){
            System.out.println("NOt Required");
        } else{
            System.out.println("Required number");
        }
        sc.close();
    }
}
