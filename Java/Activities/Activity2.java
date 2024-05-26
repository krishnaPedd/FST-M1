package activities;

public class Activity2 {
    public static void main(String args[])
    {
        int[] arr ={10,77,10,54,-11,10};
       boolean result= findSumOfTen(arr);
       System.out.println("sum of 10 equal to 30 in the arry is :"+result);
    }
    public static boolean findSumOfTen(int[] a)
    {
        int sum=0;
        boolean status=false;
       for(int i=0;i<a.length;i++)
       {
           if(a[i]==10)
          sum+=a[i];
       }
       if(sum==30) {
           status = true;
       }
       return status;
    }

}
