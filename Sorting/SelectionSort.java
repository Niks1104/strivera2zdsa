Selection Sort - select the smallest element and swap at beginning

Time Complexity - O(n*2)

class Solution {
    
    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    void selectionSort(int[] arr) {
        // code here

        int len = arr.length;
        for(int i=0; i<len-1; i++){
            int minInd = i;
            for(int j = i+1; j<len; j++){
                if(arr[j] < arr[minInd])
                    minInd = j;
            }
            if(i != minInd)
                swap(arr, i, minInd);
        }
    }
}
