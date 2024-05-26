package activities;

public class MountainBike extends Bicycle {
   public int gears;
   public int currentSpeed;
    public int seatHeight;
    public  MountainBike(int gears,int currentSpeed,int seatHeight)
    {
        super(gears,currentSpeed);
        this.gears=gears;
        this.currentSpeed=currentSpeed;
        this.seatHeight=seatHeight;
    }
    public void setHeight(int newValue)
    {
        seatHeight=newValue;
    }
    public String bicycleDesc()
    {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed +"\nSeat height :"+ seatHeight);

    }


}
