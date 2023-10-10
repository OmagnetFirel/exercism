class NeedForSpeed {
    private int battery = 100;
    private int speed, batteryDrain, distance;
    private static NeedForSpeed currentCar;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        currentCar = this;
    }

    public int getSpeed(){
        return this.speed;
    }
    public int getBatteryDrain(){
        return this.batteryDrain;
    }

    public boolean batteryDrained() {
        return this.battery < this.batteryDrain;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if(this.battery >= this.batteryDrain){
            this.distance += this.speed;
            this.battery -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return  new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        double manyDrives = (double) distance / car.getSpeed();
        String msg = String.format("quantidade voltas %f", manyDrives);
        System.out.println(msg);
        double batteryNeeded = manyDrives * car.getBatteryDrain();
        String msg2 = String.format("bateria necessaria %f", batteryNeeded);
        System.out.println(msg2);
        if( batteryNeeded > 100 ) return false;
        return true;
    }
}
