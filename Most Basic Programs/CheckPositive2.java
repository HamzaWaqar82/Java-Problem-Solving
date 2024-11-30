import java.util.*;
public class CheckPositive2
{
    /* Implement a java program that input a number and check whether it’s a 
positive number.  */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number: ");
        int number = sc.nextInt();
        
        if (number > 0) {
            System.out.println("The Number is positive.");
        }else if (number == 0){
            System.out.println("The Number is Zero");
        } else{
            System.out.println("The Number is negative.");
        }
        sc.close();
    }
}
