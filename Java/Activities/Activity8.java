package activities;

public class Activity8 {
    public void exceptionTest(String val) throws CustomException {
        if(val==(null))
            throw new CustomException("Entered null value");
        else
            System.out.println("String is :"+val);
    }
    public static void main(String args[])  {
    Activity8 activity8=new Activity8();
    try {
        activity8.exceptionTest("custom exception handling");
        activity8.exceptionTest(null);
        activity8.exceptionTest("wont execute");
    }
    catch(CustomException ce)
    {
        System.out.println("Inside Catch block :"+ce.getMessage());
    }
    }

}
