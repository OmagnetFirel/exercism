package RemoteControlCompetition;

public class ExperimentalRemoteControlCar implements RemoteControlCar  {

    int distanceDrove = 0;
    public void drive() {
        this.distanceDrove += 20;
    }

    public int getDistanceTravelled() {
        return this.distanceDrove;
    }
}