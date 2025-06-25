public class Exercise_07 {
    public static double calculateFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        double nextValue = currentValue * (1 + growthRate);
        return calculateFutureValue(nextValue, growthRate, years - 1);
    }

    public static void main(String[] args) {
        double startingAmount = 10000.0;  // $10,000 initial investment
        double annualGrowth = 0.07;       // 7% annual growth
        int projectionYears = 5;          // Project 5 years ahead
        
        double futureValue = calculateFutureValue(startingAmount, annualGrowth, projectionYears);
        
        System.out.println("Current amount: $" + startingAmount);
        System.out.println("Growth rate: " + (annualGrowth * 100) + "% per year");
        System.out.println("After " + projectionYears + " years: $" + Math.round(futureValue));
    }
}