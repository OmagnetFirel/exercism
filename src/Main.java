public class Main {
    public static void main(String[] args) {
//        MicroBlog microBlog = new MicroBlog();
//        System.out.print(microBlog.truncate("olaVictor"));

//        SqueakyClean clean = new SqueakyClean();
//        System.out.println(clean.Clean("à-ḃç"));
//        CarAssemble carAssemble = new  CarAssemble();
//        System.out.println(carAssemble.workingItemsPerMinute(8));
            NeedForSpeed nfs = new NeedForSpeed(3, 20);
            RaceTrack rt = new RaceTrack(16);

            System.out.println(rt.tryFinishTrack(nfs));

    }
}