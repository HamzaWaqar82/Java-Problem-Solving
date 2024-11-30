
import java.util.*;
public class CheckWeather7
{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Temperature: ");
        int temp = sc.nextInt();
        
        if (temp > 35){
            System.out.println("Hot Day");
        } else if(temp <=35 && temp >= 25){
            System.out.println("Pleasant Day");
        }else if(temp <= 24 && temp >= 18){
            System.out.println("Cool Day");
        }else{
            if(temp < 18){
                System.out.println("Cold Day");
            }
        }
        
        sc.close();
    }
}
