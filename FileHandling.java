import java.util.*;
import java.io.*;
public class FileHandling {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            File file = new File("F:\\Java\\test.txt");
            PrintStream out = new PrintStream(file);
            while (true) {
                System.out.println("Enter name: ");
                String name = scanner.next();
                if (name =="stop") {
                    break;
                }

                System.out.println("Enter rollNo: ");
                int rollNo = scanner.nextInt();

                System.out.println("Enter marks: ");
                int marks = scanner.nextInt();
                out.println(name + " " + rollNo + " " + marks);
                System.out.println("Data saved");
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}