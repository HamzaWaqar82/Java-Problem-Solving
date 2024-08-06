package RockPaperScissors;
import java.util.*;
import java.util.random.*;

public class RockPaperScissors {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        String moves[] = {"rock", "paper", "scissors" };
        
        // to take input from player
        System.out.println("please play your move : rock/paper/scissors");
        String playerMove = sc.nextLine().toLowerCase();


       //  to generate the computer random move
        int randomIndex = rd.nextInt(moves.length); // chooses random integer from the index length of array
        String computerMove = moves[randomIndex]; 
        System.out.println("computer Move is :" + computerMove);

        if (playerMove.equals(computerMove)) {
            System.out.println("its a tie");
        } else {
            if (playerMove.equals("paper") && computerMove.equals("rock") ||
                playerMove.equals("rock") && computerMove.equals("scissors") ||
                playerMove.equals("scissors") && computerMove.equals("paper") ) {
                System.out.println(" you win");
            } else {
                System.out.println("computer wins");
            }
        }
    }    
}
