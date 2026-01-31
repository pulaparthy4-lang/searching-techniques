public class BinarySearch {
public static int binarySearch(int[] arr, int key){
int low = 0, high = arr.lenght-1;

while (low <= high){
 int mid = (low + high)/2;
 
 if (arr[mid] == key)
   return mid;
 else if (key < arr[mid])
   high = mid-1;
 else
   low = mid+1;
    
}
return -1;
}

public static void main(String[] args){
int[] arr = {5, 10, 15, 20, 25, 30, 35};
int key = 25;

int result = binarySearch(arr, key);

 if(result != -1)
   System.out.println("Element is found at index: "+ result);
 else
   System.out.println("element not found");  
}
}