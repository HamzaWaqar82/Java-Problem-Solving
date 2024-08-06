package java_lab4;
import java.util.Scanner;


public class Activity4 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Enter Score: ");
        int Score = input.nextInt();

        if (Score >= 90) {
            System.out.println("the grade is A");
        } else if (Score >= 80) {
            System.out.println("the grade is B");
        } else if (Score >= 70) {
            System.out.println(" the grade is C");
        } else if(Score >= 60){
            System.out.println(" the grade is D");
        } else {
            System.out.println(" The grade is F");
        }
    }
}
