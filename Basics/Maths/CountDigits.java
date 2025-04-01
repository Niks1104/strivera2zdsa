Time Complexity = O(logN)

class Solution {
    static int evenlyDivides(int n) {
        // code here
        
        int count = 0;
        int temp = n;
        
        while(temp > 0){
            int digit = temp %10;
            if(digit != 0 && n % digit == 0) count++;
            temp = temp/10;
        }
        return count;
    }
}


//If we have to find total number of digits in a given number, we can do it using log as well rather than doing above process

int count = (int)(log10(n)+1);
return count;



eg: log10(7789) = 3.89 +1 = 4.89 => cast to integer = 4