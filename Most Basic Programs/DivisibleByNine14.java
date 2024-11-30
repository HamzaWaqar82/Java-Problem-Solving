public class DivisibleByNine14
{
    /*. Implement a java program that prints all the values divisible by 9 in the 
range of 10 to 90 in reverse order.   */ 
    public static void main(String[] args) {
        for (int i = 90; i > 10 ; i-- ){
            if (i % 9 == 0){
                System.out.print(i + " ");
            } 
        } 
    }
}
