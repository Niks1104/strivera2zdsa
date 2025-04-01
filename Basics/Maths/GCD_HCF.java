Problem Link: https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1

GCD - Greatest Common Divisor/ HCF - Highest Common Factor
find the highest factor that divides both the numbers

Brute Force Approach

Time Complexity - O(min(a,b))

class Solution {
    public static int gcd(int a, int b) {
        // code here
        for(int i = Math.min(a,b); i>0; i--){
            if(a %i == 0 && b%i == 0)
                return i;  //it will be our gcd/hcf
        }
        return 1;
    }
}


Optimized Approach - Using Euclidean Algorithm

gcd(a,b) = gcd(a-b, b); where a>b

to optimize it further, we use 
gcd(a,b) = gcd(a%b, b); where a>b

Time Complexity - O(log phi (min(a,b)))

class Solution {
    public static int gcd(int a, int b) {
        // code here
        
        //using enhanced version of euclidean algorithm
        //gcd(a,b) = gcd(a%b, b); where a>b
        
        while(a > 0 && b > 0){
            if(a>b)
                a = a%b;
            else
                b=b%a;
        }
        return a==0 ? b : a; //at the end, one becomes 0 and other will be gcd
    }
}

