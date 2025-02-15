Approach 1

public class Solution {
    public static void getNumberPattern(int n) {
        // Write your code here.

        int size = 2*n-1;

        int start = 0, end = size-1;
        int[][] arr = new int[size][size];

        while(n!=0){
            for(int i=start ; i<=end; i++){

                for(int j=start; j<=end; j++){

                    if(i==start || i==end || j==start || j==end)
                        arr[i][j] =n;
                }
            }
            start++;
            end--;
            n--;
        }

        //for printing the array
        for(int i=0; i<=size-1; i++){
            for(int j=0; j<=size-1; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
//Space complexity will increase in this approach


Approach 2 and Approach 3 is somewhat similar

Approach 2

public class Solution {
    public static void getNumberPattern(int n) {
        // Write your code here.

        //find the maximum distance of a specific location 
        // from top, bottom, left and right

        int len=2*n-1;

        for(int i=1; i<=len;i++){
            for(int j=1; j<=len; j++){

                //max distance between top and bottom
                int max1 = Math.max(i, 2*n-i);
                //max distance between left and right
                int max2 = Math.max(j, 2*n-j);
                //max from all four sides
                int max3 = Math.max(max1, max2);

                System.out.print(max3-n+1);
            }
            System.out.println();
        }
    }
}

Approach 3

public class Solution {
    public static void getNumberPattern(int n) {
        // Write your code here.

        //first we need to generate matrix that is n-currMatrixValues
        //then from n-newMatrix, we will get currMatrix(resultantMatrix)

        for(int i=0; i<2*n-1; i++){
            for(int j=0; j<2*n-1; j++){

                //now define top, bottom, left, right to find distances for specific location
                int top = i;
                int bottom = (2*n-2)-i;
                int left = j;
                int right = (2*n-2)-j;

                //find min distance from all 4 sides, that helps to generate new matrix
                //and subtract that from n to get resultant matrix

                System.out.print(n-Math.min(Math.min(top,bottom),Math.min(left, right)));
            }
            System.out.println();
        }
    }
}

4444444
4333334
4322234
4321234
4322234
4333334
4444444