package activities;

public class Activity7 {
    public static void main(String args[])
    {
        MountainBike mountainBike=new MountainBike(3,0,25);
        System.out.println(mountainBike.bicycleDesc());
        mountainBike.speedUp(20);
        mountainBike.applyBrake(5);
    }
}
