package activities;

import java.util.Arrays;

public class Activity4
{
    public static void main(String args[])
    {
        int[] arr={5,2,3,4,9,1,8};
        System.out.println("before sorting :"+Arrays.toString(arr));

        int[] a= Activity4.insertionSort(arr);
       System.out.println("After sorting :"+Arrays.toString(a));
    }
    public static int[] insertionSort(int[] a)
    {
      for(int i=1;i<a.length;i++)
      {
       int key=a[i];
       int j=i-1;
       while(j>=0 && key < a[j])
       {
         a[j+1] =a[j];
         --j;
       }
       a[j+1]=key;
      }
      return a;
    }


}
