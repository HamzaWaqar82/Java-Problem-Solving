
import java.util.*;
public class SwitchCaseExample6
{
    /*  Implement a java program that inputs length and choice. If user enters 
choice as 1, it calculates the area of square. If user enters choice as 2, it 
calculates the volume of cube. Otherwise it prints that its an invalid choice. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter length: ");
        int length = sc.nextInt();
        
        System.out.println("Enter Choice:\nEnter 1 to calculate the area of a square.\nEnter 2 to calculate the area of the cube.");
        int Choice = sc.nextInt();
        
        
        switch(Choice){
            case 1:
                int areaSquare = length * length;
                System.out.println("The area of the square is " + areaSquare);
                break;
            case 2: 
                int areaCube = length*length*length;
                System.out.println("The area of the Cube is " + areaCube);
                break;
            default: 
                System.out.println("Invalid Choice...");
        }
        sc.close();
    }
}
