package activities;

public class Activity12 {
    public  static void main(String args[])
    {
    // Lambda expression without Return keyword
        Addable ad=(a,b)->(a+b);
        System.out.println(ad.add(10,20));
        // Lambda expression with Return keyword
        Addable ad2=(int a,int b)->{
            return (a + b);
        };
        System.out.println(ad2.add(20,30));

    }
}
