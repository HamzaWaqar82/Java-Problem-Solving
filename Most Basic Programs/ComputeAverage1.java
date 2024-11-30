import java.util.Scanner;
public class ComputeAverage1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float sum = 0;
            float num, average;

        // For loop to take 4 inputs
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter number" + (i+1));
            num = input.nextFloat();
            sum += num;
        } 
        input.close();
        average = sum / 4;
        System.out.println("The average is " + average);
    }
}
