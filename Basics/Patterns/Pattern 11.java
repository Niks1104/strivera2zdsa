public class Solution {
    public static void nBinaryTriangle(int n) {
        // Write your code here.

        int start = 0;
        for(int i =0; i<n; i++){

            //even row starts with 1 and odd row starts with 0
            if(i%2==0) start = 1;
            else start = 0;

            for(int j = 0; j<=i; j++){
                System.out.print(start + " ");
                start = 1-start;
            }
            System.out.println();
        }
    }
}


1
0 1
1 0 1