Time Complexity - O(logN)

class Solution {
    int newNum = 0;
    public int reverse(int x) {
        while(x != 0){
            int rem = x % 10; //extract the last digit

            //if number crosses 32-bit signed range, we need to return 0, else find new number
            if(newNum > Integer.MAX_VALUE/10 || newNum < Integer.MIN_VALUE/10)
                return 0;
            //to create reverse number, 123 = 0*10+3 = 3; 3*10+2= 32; 32*10+1 = 321
            newNum = newNum * 10 + rem; 

            x /= 10;
        }
        return newNum;
    }
}