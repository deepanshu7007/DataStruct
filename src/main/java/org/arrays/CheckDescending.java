package org.arrays;

public class CheckDescending {
    public static void main(String... args)
    {
        int arr[] = {5,0,7,2,1};
        int l=arr[0];
        for(int x:arr)
        {
            if(x>l)
            {
                System.out.println("Not descending");
                System.exit(0);
            }
            else {
                l = x;
            }
        }
        System.out.println("It is Descending");
    }
}
