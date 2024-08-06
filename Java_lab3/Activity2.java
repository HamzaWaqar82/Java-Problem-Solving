package Java_lab3;

public class Activity2 {
    public static void main(String [] args){
        double regularWages;
        double regularHours = 40;
        double basePay = 25;
        double overtimeWages ;
        double overtimePay = 37.5;
        double overtimeHours = 10;
        
        double totalWage;
        regularWages = regularHours*basePay;
        overtimeWages = overtimeHours*overtimePay;
        totalWage = regularWages+overtimeWages;
        System.out.println("Wages for this week are $ " + totalWage);
    }
}
