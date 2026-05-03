import java.util.*;

public class Palindrome {
    @SuppressWarnings("empty-statement")
    public static boolean isPalindrome(int x){
        if(x<0 || (x%10==0 && x!=0)) return false;
        int reversedHalf = 0;
        while (x > reversedHalf){
            int digit = x%10;
            reversedHalf = reversedHalf * 10 + digit;
            x = x/10;
        }
        return x == reversedHalf || x == reversedHalf/10;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = sc.nextInt();
        boolean result = isPalindrome(x);
        if(result){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}
