package RemoteControlCompetition;


public class ProductionRemoteControlCar implements RemoteControlCar , Comparable <ProductionRemoteControlCar>{
    int distanceDrove = 0;
    public void drive() {
        this.distanceDrove += 10;
    }

    public int getDistanceTravelled() {
        return this.distanceDrove;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        return 0;
    }
}
