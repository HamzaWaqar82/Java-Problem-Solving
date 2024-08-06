package Assignment1;

import java.util.*;
import java.util.random.*;

public class HeadsOrTails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();


        System.out.println("please choose head or tail.\n head = 1 \n tail = 0");
        int playerChoice = sc.nextInt();

        int computerChoice = rd.nextInt(2);
        if (computerChoice == 0) {
            System.out.println("Computer choice is tail");
        } else {
            System.out.println("Computer choice is head");
        }

        if (playerChoice == computerChoice) {
            System.out.println("you guess is right");
        } else {
            System.out.println("your guess is wrong");
        }


    }
}
