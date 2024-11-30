public class PrintSequence
{
    /*  Write a program to display to find the sum of given sequence using while 
loop. 
20 + 25 + 30 + 35 + 40 + 45 + 50 + 55 + 60 */ 
    public static void main(String[] args) {
        int sum = 0;
        int n =20;
        while(n <=60){
            sum += n;
            n +=5;
        }
        System.out.println("Sum = " + sum);
    }
}
