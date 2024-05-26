package activities;

public class Bicycle implements BicycleParts,BicycleOperations {
    public  int gears;
    public int currentSpeed;
    public Bicycle(int gears,int speed)
    {
        this.gears=gears;
        this.currentSpeed =speed;
    }
    @Override
    public void applyBrake(int decrement) {
        System.out.println("Current speed is :"+currentSpeed);
        currentSpeed= currentSpeed-decrement;
        System.out.println("Current speed after break :"+currentSpeed);
    }

    @Override
    public void speedUp(int increment) {
        currentSpeed+=increment;
        System.out.println("increases the current speed to :"+ increment);

    }
    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
    }
}
