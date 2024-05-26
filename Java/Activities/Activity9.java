package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
    public static void main(String args[])
    {
        List<String> myList=new ArrayList<>();
        /* Adding elements to the List */
        myList.add("krishna");
        myList.add("Ravi");
        myList.add("Juhith");
        myList.add("Raju");
        myList.add("Divya");
        /* Printing List values */
        for(String name:myList)
        {
            System.out.println(name);
        }
        System.out.println("3rd Elemenet in the List :"+myList.get(2));
        System.out.println("is Ravi Present in the List :"+myList.contains("Ravi"));
        System.out.println("Arraylist size is :"+myList.size());
        myList.remove("Raju");
        System.out.println("New size of Arraylist is :"+myList.size());

    }
}
