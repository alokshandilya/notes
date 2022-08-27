// https://leetcode.com/problems/search-in-rotated-sorted-array

public class SearchInRotatedSortedArray {
  // Time Complexity : O(log n)

  public static int search(int nums[], int target) {
    // Special case
    if (nums == null || nums.length == 0) {
      return -1;
    }

    int left = 0;
    int right = nums.length - 1;

    // finding index from where it's rotated
    while (left < right) {
      int mid = (left + right) / 2;
      // If the element at the mid is greater than the element at the right then we can say that the
      // array is rotated after mid index
      if (nums[mid] > nums[right]) {
        left = mid + 1;
      }
      // Else, the pivot is in the left part
      else {
        right = mid;
      }
    }

    // After the above loop is completed, then the left index will point to the pivot
    int pivot = left;
    left = 0;
    right = nums.length - 1;

    // Now we will find in which half of the array, our target is present
    if (target >= nums[pivot] && target <= nums[right]) {
      left = pivot;
    } else {
      right = pivot;
    }

    // normal binary search
    while (left <= right) {
      int mid = (left + right) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (target < nums[mid]) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int nums[] = {4, 5, 6, 7, 0, 1, 2};
    int target = 0;
    System.out.println(search(nums, target));
  }
}
