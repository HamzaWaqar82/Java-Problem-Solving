// Learn how to make functions
// import java.util.*;
// public class functions {
//     public static void printMyName(String name, int age) {
//        int i = 1;
//     do {
//         System.out.println("the name is " + name + " and age is  " + age);
//         i++;
//        } while ( i<5);    
//         return;
//     }
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             String name = sc.nextLine();
//             int  age = sc.nextInt();
//             printMyName(name,age);
//         }        
//     }
// }




// Write a function to add two numbers
// import java.util.*;
// public class functions{
//     public static int sumOfTwoNum(int a, int b){
//         int sum = a+b;
//         return sum;
//     }
//     public static void main(String[] args) {
//         try (Scanner input = new Scanner(System.in)) {
//             System.out.println("Please enter the value of a");
//             int a = input.nextInt();
//             System.out.println("Please enter the value of b");
//             int b = input.nextInt();
//             int sum = sumOfTwoNum(a, b);
//             System.out.print(sum);
//         };
//     }
// }




// Write a function for a simple calculator
// import java.util.*;
// public class functions
// {
//     public static void main(String[] args) {
//         try (Scanner input = new Scanner(System.in)) {
//             System.out.println("please enter the first number");
//             int num1 = input.nextInt();
//             System.out.println("please enter the second number");
//             int num2 = input.nextInt();
//             System.out.println("please enter the operator");
//             char operator = input.next().charAt(0);
//             int result;
//             switch(operator){
//                 case '+':
//                 result = num1 + num2;
//                 break;
//                 case '-':
//                 result = num1 - num2;
//                 break;
//                 case '*':
//                 result = num1 * num2;
//                 break;
//                 case '/':
//                 result = num1 / num2;
//                 break;
//                 case '%':
//                 result = num1 % num2;
//                 break;
//                 default:
//                 System.out.println("Please enter the valid operator");
//                 return;

//             }
//             System.out.printf("%.1f %c %.1f = %.1f", num1, operator, num2, result);
//         }
//     }
// }




// find the factorial of a number

import java.util.*;
public class functions{
    public static void FindFactorial(int n){
        int factorial = 1;
        for (int i = n; i >= 1; i-- ){
            factorial = factorial * i;
            System.out.println(factorial);
            return;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(FindFactorial(number));
        
    }
}