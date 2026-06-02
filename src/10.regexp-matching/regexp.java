import java.util.Scanner;

public class regexp {
    public static boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        //Handle pattern like a*b*c* or a*b* or a* etc.
        for(int j=2; j<=n; j++){
            if(p.charAt(j-1)=='*') dp[0][j] = dp[0][j-2];
        }
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                char pc = p.charAt(j-1);
                if(pc == '.' || pc == s.charAt(i-1)) dp[i][j] = dp[i-1][j-1];
                else if (pc == '*'){
                    //Zero occurrence of the character before '*'
                    dp[i][j] = dp[i][j-2];
                    char prev = p.charAt(j-2);
                    //One or more occurrence of the character before '*'
                    if(prev == '.' || prev == s.charAt(i-1)) dp[i][j] |= dp[i-1][j];
                }
            }
        }
        return dp[m][n];
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String s = sc.next();
        System.out.print("Enter the pattern:");
        String p = sc.next();
        boolean result = isMatch(s, p);
        System.out.println("Match Result:  " + result);
        sc.close();
    }
}
