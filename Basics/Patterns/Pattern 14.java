public class Solution {
    public static void nLetterTriangle(int n) {
        // Write your code here

        char ch = 'A';
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++)
                System.out.print((char)(ch+j) + " ");
            System.out.println();
        }
    }
}

A
A B
A B C