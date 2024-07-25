1) 2 sum problem
================


2) Reverse an integer problem

//pop operation
pop = x % 10;
x /= 10;

//push operation
temp = rev * 10 + pop;


class Solution {
    public int reverse(int x) {
        int reversedInt = 0;
        for(int temp = x; temp>0;temp/=10){					//pop operation
        reversedInt = reversedInt*10 + (temp % 10);			//push operation
        }
        return reversedInt;
    }
}


using while loop
----------------
class Solution {
    public int reverse(int x) {
        int reversedInt = 0;
        int temp = x;
        while(temp > 0){
            reversedInt = reversedInt*10 + (temp%10);
            temp/=10;
        }
        return reversedInt;
    }
}


Integer.MAX_VALUE
2147483647

Integer.MIN_VALUE
-2147483648

To take care of the overflow we need to ensure that reversedInt*10 
should not be greater than Integer.MAX_VALUE
OR
should not be less than Integer.MIN_VALUE


Overflow with pop ?? > 7 and pop < -8??

class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}


3. Palindrome 
=============
All negative numbers are not palindrome
so you can return false directly

Approach 1 : reverse the integer and compare it with original integer
class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        
        int temp = x;
        int reversedInt = 0;
        while(x!=0){
            reversedInt = reversedInt*10 + x%10;
            x/=10;
        }
        if(reversedInt == temp){
            return true;
        }
        return false;
        
    }
}

Approach 2 - reverse the half of the number and compare it with first half


When the number of digits of that number exceeds 10 to the power 18, 
we can’t take that number as an integer since the range of long long int doesn’t satisfy the given number.

function checkPalindrone(str){
	var len = str.length;
		// Traversing through the string 
    // upto half its length
    for (var i = 0; i < len / 2; i++) {
        
        // Comparing ith character 
        // from starting and len-ith
        // character from end
        if (str[i] != str[len - i - 1])
            return false;
    }
    
    // If the above loop doesn't return then it is
    // palindrome
    return true;
}