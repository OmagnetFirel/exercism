package main;

public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
        return (daysSkipped > 5) ? 0.85 : 1.0;
    }
    public int multiplierPerProductsSold(int productsSold) {
        return (productsSold > 20) ? 13 : 10;
    }
    public double bonusForProductSold(int productsSold) {
        return multiplierPerProductsSold(productsSold) * productsSold;
    }
    public double finalSalary(int daysSkipped, int productsSold) {
        double total = (multiplierPerDaysSkipped(daysSkipped)*1000) + bonusForProductSold(productsSold);
        return (total < 2000) ? total : 2000;
    }
}