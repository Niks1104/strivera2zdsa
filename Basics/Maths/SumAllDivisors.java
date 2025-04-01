sum of all divisors of range 1 to n

Time Complexity - O(N sqrt(N))

class Solution {
    public static int sumOfDivisors(int n) {
        
        int sum = 0;
        
        for(int i = 1; i<=n; i++){
            
            //for optimization, we can run till sqrt(i) only
            for(int j=1; j<=Math.sqrt(i); j++){
                
                if(i%j == 0){
                    sum+=j;
                    if(j != i/j)        //for eg: 36 = 6*6; we need to add 6 only once
                        sum += i/j;
                }
            }
        }
        return sum;
    }
}

//Instead of using sqrt(), we can loop like this

class Solution {
    public static int sumOfDivisors(int n) {
        
        int sum = 0;
        
        for(int i = 1; i<=n; i++){
            
            //for optimization, we can run till sqrt(i) only
            for(int j=1; j*j<=i; j++){
                
                if(i%j == 0){
                    sum+=j;
                    if(j != i/j)        //for eg: 36 = 6*6; we need to add 6 only once
                        sum += i/j;
                }
            }
        }
        return sum;
    }
}