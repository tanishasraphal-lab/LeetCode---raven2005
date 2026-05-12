import java.util.*;
public class Solution {
    public static int myAtoi(String s){
        int i=0;
        int n = s.length();
        //Skip leading whitespaces
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        //check sign
        int sign = -1;
        if(i<n && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            if(s.charAt(i)=='-') sign = -1;
            i++;
        }
        //convert digits
        int result = 0;
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';
            //overflow check
            if(result>Integer.MAX_VALUE/10 || 
                (result == Integer.MAX_VALUE/10 && digit>7)){
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            //build number
            result = result * 10 +digit;
            i++;
        }
        return result*sign;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int ans = myAtoi(s);
        System.out.println("Converted Integer: " + ans);
        sc.close();
    }
}
