package Java_lab3;
import java.lang.Math;
public class task10 {
    public static void main(String[] args) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", "Degrees", "Radians", "Sine", "Cosine", "Tangent");
        
        int Degrees = 30;
        
        double Radians = Math.toRadians(Degrees);
        System.out.printf("%-10d %-10.4f %-10.4f %-10.4f %-10.4f%n",
                Degrees, Radians, Math.sin(Radians), Math.cos(Radians), Math.tan(Radians));
        
        
        int degrees = 60;
        
        double radians = Math.toRadians(degrees);
        System.out.printf("%-10d %-10.4f %-10.4f %-10.4f %-10.4f%n",
                degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
    }
}
