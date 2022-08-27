// given an integer array nums, return true if any value appears at least twice in the array, and
// return false if every element is distinct.

public class BruteForce {
  // Time Complexity : O(n^2)
  public static boolean isRepeated(int arr[], int n) {
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[i] == arr[j]) {
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int nums1[] = {1, 2, 3, 1};
    int nums2[] = {1, 2, 3, 4};
    int nums3[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
    int size1 = nums1.length;
    int size2 = nums2.length;
    int size3 = nums3.length;
    System.out.println(isRepeated(nums1, size1)); // true
    System.out.println(isRepeated(nums2, size2)); // false
    System.out.println(isRepeated(nums3, size3)); // true
  }
}
