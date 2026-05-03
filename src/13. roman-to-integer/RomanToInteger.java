import java.util.Scanner;

public class RomanToInteger {
    public int romanToInt(String s){
        int total = 0, prev = 0;
        for(int i=s.length()-1; i>=0; i--){
            int curr = getValue(s.charAt(i));
            if(curr<prev) total -= curr;
            else total += curr;
            prev = curr;
        }
        return total;
    }
    // Helper method
    private int getValue(char ch){
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
    // Main method
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roman Numeral: ");
        String input = sc.nextLine();
        RomanToInteger obj = new RomanToInteger();
        int result = obj.romanToInt(input);
        System.out.println("Integer Value: " + result);
        sc.close();
    }
}

