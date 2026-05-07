import java.util.*;
public class Solution {
    public static double findMedian(int[] nums1, int[] nums2){
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m+n];
        int i=0, j=0, k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]) merged[k++] = nums1[i++];
            else merged[k++] = nums2[j++];
        }
        while(i<m){
            merged[k++] = nums1[i++];
        }
        while(j<n){
            merged[k++] = nums2[j++];
        }
        int total = m+n;
        if(total % 2 == 1) return merged[total/2];
        return (merged[total/2 - 1] + merged[total/2])/2.0;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int m = sc.nextInt();
        int[] nums1 = new int[m];
        System.out.println("Enter elements for nums1: ");
        for(int i=0; i<m; i++){
            nums1[i] = sc.nextInt();
        }
        System.out.print("Enter size of second array: ");
        int n = sc.nextInt();
        int[] nums2 = new int[n];
        System.out.println("Enter elements for nums2: ");
        for(int i=0; i<n; i++){
            nums2[i] = sc.nextInt();
        }
        double median = findMedian(nums1, nums2);
        System.out.println("Median = " + median);
        sc.close();
    }
}
