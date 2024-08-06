/*import java.util.*;
public class index {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        char operator = input.next().charAt(0);
        switch (operator) {
            case '+':
                double add = num1 + num2;
                System.out.println(add);
                break;
            case '-':
                double sub = num1-num2;
                System.out.println(sub);
                break;
            case '*':
                double multiply = num1 * num2;
                System.out.println(multiply);
                break;
            case '/':
                double div = num1/num2;
                System.out.println(div);
                break;
            case '%':
                double mod = num1%num2;
                System.out.println(mod);
                break;
            
            
            default:
                break;
        }
    }
}*/



// import java.util.Scanner;

// public class index {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int choice;
//         int marks;

//         do {
//             System.out.println("Menu:");
//             System.out.println("1. Enter student's marks");
//             System.out.println("0. Exit");
//             System.out.print("Enter your choice (1 or 0): ");
//             choice = scanner.nextInt();

//             if (choice == 1) {
//                 System.out.print("Enter student's marks (out of 100): ");
//                 marks = scanner.nextInt();

//                 if (marks >= 90) {
//                     System.out.println("This is Good");
//                 } else if (marks >= 60) {
//                     System.out.println("This is also Good");
//                 } else if (marks >= 0) {
//                     System.out.println("This is Good as well");
//                 } else {
//                     System.out.println("Invalid input. Marks should be between 0 and 100.");
//                 }
//             } else if (choice != 0) {
//                 System.out.println("Invalid choice. Please enter 1 or 0.");
//             }
//         } while (choice != 0);

//         System.out.println("Thank you for using the program!");
//     }
// }



// import java.util.*;
// public class index{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int marks, choice;

//         do {
//             System.out.println("Menu: ");
//             System.out.println("1. Enter student marks ");
//             System.out.println("0. Exit ");
//             System.out.println("choose either 1 or 0: ");
//             choice = input.nextInt();
//             if (choice==1) {
//                 System.out.println("enter student marks out of 100");
//                 marks = input.nextInt();
//                 if (marks >=89 && marks <=100) {
//                     System.out.println("This is Good");
//                 } else if (marks >=60 && marks <=89) {
//                     System.out.println("This is also Good");
//                 } else if (marks >=0 && marks <=59) {
//                     System.out.println("This is Good as well");
//                 }else{
//                     System.out.println("Enter numbers between 0 to 100");
//                 }

//             } else if (choice !=0) {
//                 System.out.println("Invalid choice. Please Enter 1 or 0: ");
//             } 
//         } while (choice!=0);
//     }
// }


import java.util.*;
public class index{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean isprime = true;
        for (int i = 2; i < num/2; i++) {
            if (num % i == 0) {
                isprime = false;
                break;
            }
            
        } 
        if (isprime) {
            System.out.println("the no is a prime no: ");
        } else{
            System.out.println("the no is not a prime no: ");
        }
    }
}
