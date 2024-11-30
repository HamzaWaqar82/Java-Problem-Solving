    import java.util.*;
    public class CheckEven3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter Number: ");
            int number = sc.nextInt();
            
            if (number % 2 == 0) {
                System.out.println("The Number is even.");
            }else {
                System.out.println("The Number is odd.");
            }
            sc.close();
        }
    }

