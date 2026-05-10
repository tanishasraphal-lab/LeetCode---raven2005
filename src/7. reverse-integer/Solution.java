import java.util.*;
public class Solution {
    static int reverse(int x){
        int rev = 0;
        while(x!=0){
            int digit = x % 10;
            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10) return 0;
            rev = rev * 10 + digit;
            x = x/10;
        }
        return rev;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int x = sc.nextInt();
        int result = reverse(x);
        System.out.println("Reversed integer: " + result);
        sc.close();
    }
}
