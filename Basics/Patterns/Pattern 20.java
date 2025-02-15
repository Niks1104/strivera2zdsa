Approach 1

public class Solution {
    public static void symmetry(int n) {
        // Write your code here

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++)
                System.out.print("* ");
            for(int k=1; k<=2*(n-i); k++)
                System.out.print("  ");
            for(int l=1; l<=i; l++)
                System.out.print("* ");
            System.out.println();
        }

        for(int i=n-1; i>=1; i--){
            for(int j = 1; j<=i; j++)
                System.out.print("* ");
            for(int k=1; k<=2*(n-i); k++)
                System.out.print("  ");
            for(int l=1; l<=i; l++)
                System.out.print("* ");
            System.out.println();
        }
    }
}

Approach 2

public class Solution {
    public static void symmetry(int n) {
        // Write your code here

        int stars = 0;
        int spaces = 0;

        for(int i=1; i<(2*n); i++){

            if(i<=n){
                stars = i;
                spaces = 2*(n-i);
            }else{
                stars = 2*n-i;
                spaces = 2*(i-n);
            }

            for(int j=1; j<=stars; j++)
                System.out.print("* ");
            for(int k=1; k<=spaces; k++)
                System.out.print("  ");
            for(int l=1; l<=stars; l++)
                System.out.print("* ");
            System.out.println();
        }
    }
}

*         *
* *     * *
* * * * * *
* *     * *
*         *