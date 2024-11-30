/*.Implement a java program that inputs a number and displays its table using
do-while loop. */
import java.util.Scanner;
public class GenerateTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int i = 1;
        do {
            System.out.println(number + " * " + i + " = " + (number * i));
            i++;
        } while (i <= 10);
        input.close();
    }
}

