class BirdWatcher {
    private final int[] birdsPerDay;
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return  this.birdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
       this.birdsPerDay[this.birdsPerDay.length - 1] = this.birdsPerDay[this.birdsPerDay.length - 1] + 1;
    }

    public boolean hasDayWithoutBirds() {
        boolean daysWithoutBirds = false;
        for (int bird: birdsPerDay){
            if(bird == 0)
                daysWithoutBirds = true;
        };
        return daysWithoutBirds;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int res =0;
        for (int i=0; i< numberOfDays; i++ ){
            if(i > birdsPerDay.length - 1 ){
                break;
            }
            res += birdsPerDay[i];
        }
        return res;
    }

    public int getBusyDays() {
        int busyDays= 0;
        for (int bird: birdsPerDay){
            if(bird >= 5){
                busyDays++;
            }
        };
        return busyDays;
    }
}
