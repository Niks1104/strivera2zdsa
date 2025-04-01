Bubble Sort - push the max element at last by adjacent swaps

Time Complexity - O(n*2) - Worst and Average case

class Solution {
    
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // Function to sort the array using bubble sort algorithm.
    public static void bubbleSort(int arr[]) {
        // code here
        
        int len = arr.length;
        
        for(int i = 0; i<len-1; i++){
            for(int j = 0; j < len-i-1; j++){
                if(arr[j] > arr[j+1])
                    swap(arr, j, j+1);
            }
        }
    }
}

Best case - O(N) 

if array is already sorted, we don't need to run loop again and again.

So, to check this we can maintain a count of swap, if in first pass, there is no swap, we can break from there as array is already sorted.

class Solution {
    
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // Function to sort the array using bubble sort algorithm.
    public static void bubbleSort(int arr[]) {
        // code here
        
        int len = arr.length;
        
        for(int i = 0; i<len-1; i++){
            int swapCount = 0;
            for(int j = 0; j < len-i-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    swapCount = 1;
                }
            }
            if(swapCount == 0) break;
        }
    }
}
