public class Solution {
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i=n; i>0; i--){
            for(int j=i; j<n;j++)
                System.out.print(" ");
            for(int k=1; k<= 2*i-1; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}

*****
 ***
  *