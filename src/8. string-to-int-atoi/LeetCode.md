## LeetCode Solution

```java
class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        //Skip leading whitespaces
        while(i<n && s.charAt(i)==' ') i++;
        //check sign
        int sign = 1;
        if(i<n && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            if(s.charAt(i)=='-') sign = -1;
            i++;
        }
        //convert digits
        int res = 0;
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';
            //overflow check
            if(res>Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && digit>7)){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 + digit;
            i++;
        }
        return res * sign;
    }
}
```