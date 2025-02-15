Approach 1

public class Solution {
    public static void alphaHill(int n) {
        // Write your code here

        for(int i=1; i<=n; i++){

            char ch='A';
            for(int j=1; j<=n-i; j++)
                System.out.print("  ");
            
            int breakpoint = (2*i-1)/2;

            for(int k = 1; k<= (2*i-1); k++){
                System.out.print(ch + " ");
                if(k <= breakpoint) ch++;
                else ch--;
            }
            System.out.println();
        }
    }
}

Approach 2

public class Solution {
    public static void alphaHill(int n) {
        // Write your code here

        for(int i = 0; i<n; i++){
            char ch='A';
            for(int k=0; k<n-i-1; k++)
                System.out.print("  ");
            for(int j =0; j<(2*i+1); j++){

                if(j<i)
                    System.out.print(ch++ + " ");
                else
                   System.out.print(ch-- + " "); 
            }
            System.out.println();
        }
    }
}


    A
  A B A
A B C B A