package java_lab4;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int length1, width1, length2, width2;
// Triangle 1
        System.out.println("Enter the length of the Triangle 1: ");
        length1 = input.nextInt();

        System.out.println("Enter the width of the Triangle 1: ");
        width1 = input.nextInt();

        int areaOfTriangle1 = length1*width1;
        System.out.println("Area of triangle 1 is : " + areaOfTriangle1);

// Triangle 2
        System.out.println("Enter the length of the Triangle 2: ");
        length2 = input.nextInt();

        System.out.println("Enter the width of the Triangle 2: ");
        width2 = input.nextInt();

        int areaOfTriangle2 = length2*width2;
        System.out.println("Area of triangle 2 is : " + areaOfTriangle2);


// Triangle with Greator area.

        if (areaOfTriangle1 > areaOfTriangle2) {
            System.out.println("Triangle 1 has greator area than triangle 2");
        } else {
            System.out.println("Triangle 2 has greator area than triangle 1");
        }


    }
}
