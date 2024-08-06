package Java_lab3;
import java.util.*;
public class task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your hourly pay rate");
        double payRate = input.nextDouble();
        System.out.println("please enter your hours worked");
        int hoursWorked = input.nextInt();

        double totalWage = payRate*hoursWorked;
        System.out.println("total income before taxes = "+ totalWage);

        double totalTax = totalWage*0.14;
        double incomeAfterTax = totalWage-totalTax;
        System.out.println("total income after taxes = " + incomeAfterTax);


        double moneySpendOnClothes = incomeAfterTax*0.10;
        System.out.printf("the money you spent on clothes and other accessories is :"+ "%.2f",moneySpendOnClothes);

        double schoolSupplies = incomeAfterTax*0.01;
        System.out.printf("\n the money you spent on school Supplies is :" + "%.2f",schoolSupplies);

        double MoneySpentOnClothesAndSchool = moneySpendOnClothes + schoolSupplies;
        System.out.printf("\n total Money Spent On Clothes And School Supplies is "+ "%.2f",MoneySpentOnClothesAndSchool);
        
        double incomeLeft = incomeAfterTax - MoneySpentOnClothesAndSchool;

        double amountBonds = incomeLeft*0.25;
        System.out.printf("\n the amount you spend on the savings bond is: "+ "%.2f", amountBonds);

        double parentsBondAmonut = amountBonds*0.50;
        System.out.printf("\n additional amount your parents spend on bonds: "+ "%.2f", parentsBondAmonut);
    }
}
