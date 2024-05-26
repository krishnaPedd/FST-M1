package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String args[])
    {
        Map<Integer,String> colors=new HashMap<Integer,String>();
        colors.put(1,"Orange");
        colors.put(2,"Yellow");
        colors.put(3,"White");
        colors.put(4,"Black");
        colors.put(5,"Red");
        System.out.println("Original Hash map is :"+colors);
        System.out.println("Original Hash map size is :"+colors.size());
        System.out.println("Remove Red color from Hash map :"+colors.remove(5));
        System.out.println("Is Green color exist in Hash map :"+colors.containsValue("Green"));
        System.out.println("New Hash map size is :"+colors.size());


    }

}
