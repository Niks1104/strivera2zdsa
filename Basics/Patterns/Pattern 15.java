public class Solution {
    public static void nLetterTriangle(int n) {
        // Write your code here

        char ch='A';
        for(int i = n-1; i>=0; i--){
            for(int j = 0; j<=i; j++){
                System.out.print((char)(ch+j) + " ");
            }
            System.out.println();
        }

    }
}

A B C
A B
A