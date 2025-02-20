public class Solution {
    public static void nStarDiamond(int n) {
        // Write your code here

        //upper part
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++)
                System.out.print(" ");
            for(int k=1; k<= (2*i-1); k++)
                System.out.print("*");
            System.out.println();
        }

        //lower part
        for(int i=n; i>0; i--){
            for(int j=i; j<n; j++)
                System.out.print(" ");
            for(int k=1; k<=(2*i-1); k++)
                System.out.print("*");
            System.out.println();
        }
    }
}


  *
 ***
*****
*****
 ***
  *