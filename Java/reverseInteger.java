/*

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).


*/


class Solution {
    public int reverse(int x) {
        double ans = 0;
        while(x != 0){
            int cur = x%10;
            x = x/10;   
            
            if(ans < 2147483647/10 && ans > -2147483647/10 || 
               ans == 2147483647/10 && cur<7 || 
               ans ==  -2147483647/10 && -cur < 7) 
            {ans = ans*10 + cur;}
            
            else
            {return 0;}  
        }
        int output = (int)ans;
        return output;
    }
}
