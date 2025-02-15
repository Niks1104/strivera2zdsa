public class Solution {
    public static void alphaTriangle(int n) {
        // Write your code here
        for(int i = n-1; i>=0; i--){
            char ch='A';
            for(int j=n-1; j>=i; j--){
                System.out.print((char)(ch+j) + " ");
            }
            System.out.println();
        }
    }
}

C
C B 
C B A