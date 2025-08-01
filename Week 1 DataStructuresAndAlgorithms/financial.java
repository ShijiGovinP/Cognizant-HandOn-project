import java.util.Scanner;
public class financial {
    public static double value(int year, double rate, double initial) {
        if (year == 0) {
            return initial;
        } else {
            return value(year - 1, rate, initial) * (1 + rate);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial investment: ");
        double initialInvestment = sc.nextDouble();
        System.out.print("Enter the annual growth rate : ");
        double growthRate = sc.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = sc.nextInt();
        double futureValue = value(years, growthRate, initialInvestment);
        System.out.println("Future value after " + years + " years is " + futureValue);
    }
}


// OUTPUT
// Enter the initial investment: 25000
// Enter the annual growth rate : 56.6
// Enter the number of years: 5
// Future value after 5 years is 1.5850845241344E13


    

