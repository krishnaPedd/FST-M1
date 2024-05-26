package activities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private LocalDateTime lastTimeTookup;
    private LocalDateTime lastTimeLanded;
    public Plane(int maxPassengers)
    {
    this.maxPassengers=this.maxPassengers;
    this.passengers=new ArrayList<>();
    }

    public void onBoard(String passenger)
    {
        passengers.add(passenger);
    }
    public LocalDateTime takeOff()
    {
       LocalDateTime locDate= java.time.LocalDateTime.now();
     return locDate;
    }
    public void land()
    {
        LocalDateTime locDate= java.time.LocalDateTime.now();
        lastTimeLanded=locDate;
        passengers.clear();
    }
    public LocalDateTime getLastTimeLanded()
    {
     return lastTimeLanded;
    }
    public List<String> getPassengers()
    {
    return passengers;
    }

}
