public class BubbleSort{
    public static int[] bubbleSort(int arr[] , int size){
        if(arr.length == 0){
            System.out.println("Provided array is empty");
        }else if(arr.length == 1){
            return arr;
        }else{
            int i=0,temp=0;
            while(i<arr.length-1){
                int j=0;
                while(j<arr.length-1){
                    if(arr[j]>arr[j+1]){
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                    j++;
                }
                i++;
            }
        }
        return arr;
    }
    public static void main(String... args){
        int arr[] = {4,3,1,9,5};
        arr = bubbleSort(arr, arr.length);
        for(int x : arr){
            System.out.printf("%2d",x);
        }
        System.out.println();
    }
}