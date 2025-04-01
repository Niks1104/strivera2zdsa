Insertion sort - take an element and place it in its correct order, by comparing all elements on its left

Time Complexity - O(n*2)

class Solution {
    
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        int len = arr.length;
        
        int start = 0;
        int end = 1;
        
        while(end <len){
            //pick the element and place it at its right position 
            //by comparing all elements on its left
            for(int i = end; i>start; i--){
                if(arr[i] < arr[i-1])
                    swap(arr, i, i-1);
            }
            end++; //after every pass we need to increment end
        }
    }
}

We can optimize it further, by breaking the loop when there is no swap

Time Complexity - O(n*2) - Worst and Average
Best Case - O(n) - because if array is already sorted, only outer loop will run and internal loop will never run

class Solution {
    
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        int len = arr.length;
        
        for(int i=0; i<len; i++){
            //previous elements are already sorted so we need to place the last 
            //element at its correct position by swapping with elements on its left
            int j = i;
            while(j>0 && arr[j] < arr[j-1]){//optimized part, to break loop when no swap done
                swap(arr, j, j-1);
                j--;
            }
            
        }
    }
}