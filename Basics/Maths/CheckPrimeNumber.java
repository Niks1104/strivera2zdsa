
Problem Link - https://www.geeksforgeeks.org/problems/prime-number2314/1

Prime number is a number that only divides by 1 or itself

Time Complexity - O(N)

class Solution {
    static boolean isPrime(int n) {
        // code here
        
        if(n == 1) return false;
        
        boolean isPrime = true;
        for(int i = 2; i<n; i++){
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}


Prime number is a number that has exactly 2 factors 1 and itself.
Approach - count all factors in sqrt(n) time, and at end check, if there are exactly 2 factors then it is prime otherwise not.

Time Complexity - O(n^2)

class Solution {
    static boolean isPrime(int n) {
        // code here
        
        int count = 0;
        for(int i = 1; i*i<=n; i++){
            if(n % i == 0) {
                count++;
                if(i != n/i) count++;
            }
        }
        if(count == 2) return true;
        else return false;
    }
}