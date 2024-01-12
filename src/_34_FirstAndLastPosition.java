//        Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//        If target is not found in the array, return [-1, -1].
//        You must write an algorithm with O(log n) runtime complexity.
//
//
//        Example 1:
//
//        Input: nums = [5,7,7,8,8,10], target = 8
//        Output: [3,4]
//        Example 2:
//
//        Input: nums = [5,7,7,8,8,10], target = 6
//        Output: [-1,-1]
//        Example 3:
//
//        Input: nums = [], target = 0
//        Output: [-1,-1]
//
//
//        Constraints:
//
//                0 <= nums.length <= 10^5
//                -10^9 <= nums[i] <= 10^9
//                nums is a non-decreasing array.
//                -10^9 <= target <= 10^9

import java.util.Arrays;

public class _34_FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    private static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int st = -1;
        int en = -1;

        // for first position
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                st = mid;
                end = mid - 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        start = 0;
        end = nums.length - 1;

        // for last position
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                en = mid;
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return new int[] {st, en};
    }
}
