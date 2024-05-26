package activities;

import java.time.LocalDateTime;
import java.util.List;

public class Activity6 {
    public static void main(String args[]) throws InterruptedException {
        Plane plane=new Plane(10);
        plane.onBoard("Ravi");
        plane.onBoard("krishna");
        plane.onBoard("Juhith");
      LocalDateTime loc= plane.takeOff();
      System.out.println(" Plane Take off at :"+ loc);
     List<String> listOfpassengers= plane.getPassengers();
     System.out.println("People on the Plane :");
     for(String passenger:listOfpassengers)
     {
         System.out.println(passenger);
     }
     // flying
     Thread.sleep(10000);
     //Plane Landed
     plane.land();
     LocalDateTime lastTimeLanded=plane.getLastTimeLanded();
     System.out.println("Plane Landed at :"+lastTimeLanded);
     System.out.println("People on the plane after landing "+plane.getPassengers());


    }

}
