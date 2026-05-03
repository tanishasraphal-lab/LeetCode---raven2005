import java.util.*;
public class TwoSum{
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int cur = nums[i];
            int x = target - cur;
            if(map.containsKey(x)) return new int[]{map.get(x),i}; 
            map.put(cur,i);
        }
        return new int[]{};
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        int[] result = twoSum(nums, target);
        if(result.length == 2){
            System.out.println("Indices: " + result[0] + " " + result[1]);
        }
        else{
            System.out.println("No solution found");
        }
        sc.close();
    }
}
