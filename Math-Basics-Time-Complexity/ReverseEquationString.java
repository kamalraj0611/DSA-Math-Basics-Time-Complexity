/*

Reversing the equation
Difficulty: EasyAccuracy: 58.61%Submissions: 34K+Points: 2
Given a mathematical equation that contains only numbers and +, -, *, /. Print the equation in reverse, such that the equation is reversed, but the numbers remain the same.
It is guaranteed that the given equation is valid, and there are no leading zeros.

Example 1:

Input:
S = "20-3+5*2"
Output: 2*5+3-20
Explanation: The equation is reversed with
numbers remaining the same.
Example 2:

Input: 
S = "5+2*56-2/4"
Output: 4/2-56*2+5
Explanation: The equation is reversed with
numbers remaining the same.
Your Task:
You don't need to read input or print anything. Your task is to complete the function reverseEqn() which takes the string S representing the equation as input and returns the resultant string representing the equation in reverse.

Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(|S|).

Constraints:
1<=|S|<=105
The string contains only the characters '0' - '9', '+', '-', '*', and '/'.
*/

import java.util.*;// User function Template for Java

class Solution {

    String reverseEqn(String S) {
        // your code here
        int n = S.length() - 1; int m = 0;
        StringBuilder sb = new StringBuilder();
        while(n >= 0)
        {
            if(Character.isDigit(S.charAt(n)))
            {
                m= n;
                while(m >=0 && Character.isDigit(S.charAt(m)))
                {
                    m--;
                }
                sb.append(S.substring(m+1, n+1));
                n = m;
            }
            else
            {
               
                sb.append(S.charAt(n));
                 n--;
            }
        }
        
        return sb.toString();
    }
}
