package MostCommonQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HasDuplicateArray {

    //First approach brute force

    public static boolean checkDuplicateForloop(int[] nums){
        for(int i=0;i<nums.length;i++ ){
            for (int j = i+1; j< nums.length;j++){
                if (nums[i] == nums[j])
                return true;
            }
        }
        return false;
    }
    //Second approach with sorting
    public static boolean checkDuplicateBySorting(int[] nums){
        Arrays.sort(nums);
        for (int i= 1;i<nums.length;i++) {
            if (nums[i] == nums[i - 1])
                return true;

        }
        return false;
    }
    //Third approach with hashSet
    public static boolean checkDuplicateByHashSet(int[] nums){
        Set<Integer> numbers = new HashSet<>();
        for (int i : nums){
            if (numbers.contains(i)){
                return true;
            }
            numbers.add(i);
        }
        return false;
    }

    public static void main(String[] args){
       int[] nums1 = {1, 2, 3, 4};
       int[] nums2 = {1,2,3,3,4,5,6,7};
       System.out.println(checkDuplicateForloop(nums1));
       System.out.println(checkDuplicateForloop(nums2));
       System.out.println(checkDuplicateBySorting(nums1));
       System.out.println(checkDuplicateBySorting(nums2));
       System.out.println(checkDuplicateByHashSet(nums1));
       System.out.println(checkDuplicateByHashSet(nums2));
    }
}
