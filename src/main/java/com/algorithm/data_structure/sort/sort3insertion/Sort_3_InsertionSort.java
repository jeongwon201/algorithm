package com.algorithm.data_structure.sort.sort3insertion;

import com.algorithm.data_structure.sort.common.CommonMethod;

public class Sort_3_InsertionSort {
    public static void main(String[] args) throws Exception {

        int nums[] = CommonMethod.getArray();
        insertionSort(nums);
        CommonMethod.printArray(nums);
    }

    public static int[] insertionSort(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            int target = nums[i];

            int prevIdx = i - 1;

            while (prevIdx >= 0 && target < nums[prevIdx]) {
                nums[prevIdx + 1] = nums[prevIdx];
                prevIdx--;
            }

            nums[prevIdx + 1] = target;
        }

        return nums;
    }
}
