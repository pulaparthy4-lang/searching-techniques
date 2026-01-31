public class UniformBinarySearch {
  static final int MAX_SIZE = 10;
  static int[] lookupTable = new int[MAX_SIZE];
  
  static void createLookupTable(int n) {
    int pow = 1;
    int index = 0;
    
    do {
       pow <<= 1;
       lookupTable[index] = (n + (pow >> 1)) / pow;
    } while (lookupTable[index++] != 0);
  }
  static int uniformBinarySearch(int[] arr, int target) {
     int index = lookupTable[0] - 1;
     int step = 0;
     
     while (lookupTable[step] != 0){
        
        if (target == arr[index]) {
        return index;
        }
        else if (target < arr[index]){
        index -= lookupTable[++step];
        }
        else {
         index += lookupTable[++step];
        }
        if (index < 0 || index >= arr.length){
        return -1;
        }
     }
     return -1;
  }
  public static void main(String[] args){
    int[] arr = {1, 3, 5, 6, 7, 8, 9};
    int target = 3;
    
    createLookupTable(arr.length);
    
    int result = uniformBinarySearch(arr, target);
        if (result != -1)
    System.out.println("Element " + target + " found at index = "+ result);
    else
    System.out.println("Element "+ target + "  not foumd in  the array.");
  }
}