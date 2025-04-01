QuickSort is a divide and conquer algorithm. 

Time Complexity -  O(NlogN) => O(logN) -> recursive part ;  O(N) - partition function
Space Complxity - O(1) -> not using any extra space

class Solution {
    // Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high) {
        // in quick sort we have to pick an element as pivot element and place
        // it at its correct position, aka partitionIndex
        
        //all smaller elements will be on left and 
        //all larger elements will be on right
        if(low < high) {
            
            //partitionIndex is a place where pivot element is placed correctly
            int partitionIndex = partition(arr, low, high);
            
            //recursively we need to apply quickSort on left and right array
            quickSort(arr, low, partitionIndex-1); //left array
            quickSort(arr, partitionIndex+1, high); //right array
        }
    }

    static int partition(int arr[], int low, int high) {
        // now we need to pick the pivot element, we choose first element as pivot
        int pivot = arr[low];
        
        //everytime, we are not creating new arrays, we will just use pointers
        
        int i = low, j = high;
        
        //run the loop until j crosses i
        while(i < j){
            
            //find first greater element from pivot from left and stop i
            while(arr[i] <= pivot && i<high) i++;
            
            //find first smaller element from pivot from right and stop j
            while(arr[j] > pivot && j> low) j--;
            
            //swap
            if(i < j) swap(arr, i, j);
        }
        
        //now we need to swap the pivot element with last element where j stops
        swap(arr, low, j);
        
        return j; //as j is our partition index, where our pivot element is placed
    }
    
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
