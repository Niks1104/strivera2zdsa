Problem Link : https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1

 An Armstrong number is a positive integer that is equal to the sum of its own digits each raised to the power of the number of digits

class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        
        //first count the no of digits
        int cnt = (int) (Math.log10(n) + 1);
        
        int sum = 0;
        int temp = n;
        
        while(temp != 0){
            int digi = temp %10;
            sum += (Math.pow(digi,cnt));
            temp /= 10;
        }
        if(sum == n) return true;
        else return false;
    }
}