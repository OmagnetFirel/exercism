package main;

public class CarAssemble {
    double oneHourProductionRate = 221;
    public double productionRatePerHour(int speed) {
        if(speed <= 4){
            return speed * this.oneHourProductionRate;
        } else if (speed <= 8) {
            return speed * (this.oneHourProductionRate - (this.oneHourProductionRate * 0.10));
        } else if (speed == 9) {
            return speed * (this.oneHourProductionRate - (this.oneHourProductionRate * 0.20));
        }
        return speed * (this.oneHourProductionRate - (this.oneHourProductionRate * 0.23));
    }

    public int workingItemsPerMinute(int speed) {
        double carsPerHour = productionRatePerHour(speed);
        System.out.println(carsPerHour);
        return (int)Math.round(carsPerHour) / 60;
    }
}
