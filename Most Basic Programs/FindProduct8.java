
// import java.util.*;
public class FindProduct8
{
    /*Implement a java program to display the product of given numbers using 
while loop. 
1 x 3 x 5 x 7 x 9 x 11 x 13 x 15*/
    public static void main(String[] args) {
        int startNum = 1;
        int product = 1;
        while(startNum < 16){
            product *= startNum;
            startNum += 2;
        }
        System.out.println("Product : " + product);
    }
}
