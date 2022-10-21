package homeWork1;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] nums = new int[] {0,1,2,2,3,0,4,2};
        int val = 2;
        int k = removeElements(nums, val);
        System.out.println("количество элементов, отличных от " + val + " = " + k);
        System.out.println(Arrays.toString(nums));
    }
    public static int removeElements(int[] nums, int val) {
        int copyInd = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[copyInd] = nums[i];
                copyInd++;
                k++;
            }
        }
        while (copyInd < nums.length) {
            nums[copyInd++] = -1;
        }
        return k;
    }
}
