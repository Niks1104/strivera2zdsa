public class Solution {
    public static void alphaRamp(int n) {
        // Write your code here

        char ch ='A';

        for(int i= 0; i<n; i++){
            for(int j= 0; j<=i; j++){
                System.out.print((char)(ch+i) + " ");
            }
            System.out.println();
        }
    }
}

A
B B
C C C