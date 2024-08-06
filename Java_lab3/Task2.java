package Java_lab3;

public class Task2 {
    public static void main(String [] args){
        int students = 6;
        int apples = 50;
        
        int applesEachStudentGet = apples/students;
        System.out.println("Number of apples each student get "+applesEachStudentGet);
        
        
        int remainingApples = 50 %8;
        System.out.println("The remainning apples are " + remainingApples);
    }
}
