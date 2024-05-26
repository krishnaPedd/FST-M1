package activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {
    public static void main(String args[])
    {
        Set<String> hs=new HashSet<String>();
        hs.add("python");
        hs.add("java");
        hs.add("C++");
        hs.add("salesforce");
        hs.add("Rest Assured");
        hs.add("Selenium");
        System.out.println("Ori :"+hs.size());
        System.out.println("size of hash set is :"+hs.size());
        System.out.println("remove salesforce from hashset :"+hs.remove("salesforce"));
        System.out.println("try to remove elemenet which is not exist in hashset :"+hs.remove("jsp"));
        System.out.println(" is Java exist in the Set :"+hs.contains("java"));
       for (String course:hs)
           System.out.println(course);

    }
}
