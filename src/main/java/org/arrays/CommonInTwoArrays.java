package org.arrays;

public class CommonInTwoArrays {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,56,6,7,8864};
        int arr2[] = {5,6,7,8,1,2,3,4};
        for(int x=0;x<arr.length;x++)
        {
            for(int y = 0;y<arr.length;y++)
            {
                if(arr[x]==arr2[y])
                {
                 System.out.println("The value"+arr[x]+"is located in second array");
                }
            }
        }
    }
}