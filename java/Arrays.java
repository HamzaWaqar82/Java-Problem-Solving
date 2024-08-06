import java.util.*;
public class Arrays {

    public static void main(String[] args) {
        // int[] marks = new int[5];   
        // int marks[] = {97,98,99,56,66}; // we can also define arrays this way
        // marks[0]= 98;  phy
        // marks [1] = 99;  chem
        // marks[2] = 34;  bio
        // marks[3] = 77;  math
        
        // marks[4] = 45; // eng
        
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);
        // System.out.println(marks[4]);
        // System.out.println(marks[0]);

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int marks[] = new int[size];

        for (int i = 0; i<size; i++){
            System.out.println(marks[i]);
        }
    }
}