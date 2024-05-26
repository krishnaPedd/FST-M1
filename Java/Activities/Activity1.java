package activities;

public class Activity1 {
    public static void main(String args[]) {
        Car toyota = new Car();
        toyota.color = "Black";
        toyota.make=2014;
        toyota.transmission="manual";
        toyota.displayCharacteristics();
        toyota.accelarate();
        toyota.brake();
    }


}
