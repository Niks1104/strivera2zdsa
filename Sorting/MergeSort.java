Merge sort is more optimized sorting algorithm, that works on divide and merge algorithm

Time Complexity - O(N logN)  => O(logN) - dividing continuously - n, n/2,n/4.....    O(N) - merge
Space complexity - O(N) - temp array

class Solution {
    
    void merge(int[] arr, int low, int mid, int high){
        
        //now for merging we will have two arrays, left and right
        //so we will keep pointer at starting point/index of both array
        //for left array, start = low, end = mid
        //for right array, start = mid+1, end = high
        
        int left = low, right = mid+1;
        int size = high-low+1;  //size of temp array
        int[] temp = new int[size];
        int ind = 0;
        
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[ind++] = arr[left];
                left++;
            }else{
                temp[ind++] = arr[right];
                right++;
            }
        }
        while(left <= mid){
            temp[ind++] = arr[left];
            left++;
        }
        while(right <= high){
            temp[ind++] = arr[right];
            right++;
        }
        
        //we need to copy element from temp array to original array
        for(int i=low; i<=high; i++){
            arr[i] = temp[i-low];   //because indexes will be different in case of right sides
        }
    }

    void mergeSort(int arr[], int l, int r) {
        //in merge sort, we are continuously dividing and merging the array. 
        //So, use recusrion and backtracking 
        
        //we are not creating new array after each division, just hypothetically
        //dividing (imaginary)
        
        if(l >= r) return; //base condition for recursion, when we have only one element we need to stop
        int mid = (l+r)/2; //find the mid to divide
        mergeSort(arr, l, mid); //to recursively divide the left side
        mergeSort(arr, mid+1, r); //to recursively divide the right side
        
        //once both the arrays (left and right) are sorted
        // we need to merge in sorted order
        merge(arr, l, mid, r);
    }
}