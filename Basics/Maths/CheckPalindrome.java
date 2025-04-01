If a number is equal to its reverseNumber, then it is palindrome.

class Solution {
    public boolean isPalindrome(int x) {
        //beacuse negative number will never be equal; -121 => 121-
        if(x < 0) return false;

        int temp = x;
        int newNum = 0;
        while(temp != 0){
            int rem = temp %10;
            newNum = newNum * 10 + rem;
            temp /= 10;
        }

        if(newNum == x) return true;
        else return false;
    }
}