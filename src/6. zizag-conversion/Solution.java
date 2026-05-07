import java.util.*;
public class Solution {
    public static String convert(String s, int numRows){
        if(numRows==0 || s.length()<=numRows) return s;
        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i=0; i<numRows; i++){
            rows[i] = new StringBuilder();
        }
        int currentRow = 0;
        boolean goingDown = false;
        for(char c : s.toCharArray()){
            rows[currentRow].append(c);
            if(currentRow==0 || currentRow==numRows-1) goingDown = !goingDown;
            currentRow += goingDown ? 1 : -1;
        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder row : rows){
            result.append(row);
        }
        return result.toString();
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        System.out.print("Enter number of rows: ");
        int numRows = sc.nextInt();
        String answer = convert(s,numRows);
        System.out.println("Zigzag Conversion: " + answer);
        sc.close();
    }
}
