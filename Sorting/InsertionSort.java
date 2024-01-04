public class InsertionSort {
    
    public static int[] insertionSort(int arr[],int size){
    int temp1=0;
	if(arr.length == 0){
		System.out.println("This array is empty");
	}else if(arr.length == 1){
		return arr;
	}else{
		int i=0;
		int j=1;
		while(j<arr.length){
			i=j-1;
			int temp = arr[j];
			while(i>0 && temp < arr[i]){
				temp1 = arr[i+1];
				arr[i+1] = arr[i];
				arr[i] = temp1;
				i--;		
			}
			arr[i+1] = temp;
			j++;
		}
	}
	return arr;
    }

    public static void main(String... args){
        int arr[] = {0,1,3,4,5,2};
        for(int x : insertionSort(arr,arr.length)){
        	System.out.printf("%3d",x);
        }
        System.out.println();
    }

}
