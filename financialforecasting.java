public class financial {
    public static double value(int year, double rate, double initial) {
        if (year == 0) {
            return initial;
        } else {
            return value(year - 1, rate, initial) * (1 + rate);
        }
    }
    public static void main(String[] args) {
        double initialInvestment = 10000; 
        double growthRate = 0.07; 
        int years = 10;
        double futureValue = value(years, growthRate, initialInvestment);
        System.out.println("recursive" + futureValue);
    }
}
