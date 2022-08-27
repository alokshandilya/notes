// basic knowledge of java hashsets required
import java.util.HashSet;

public class UsingSets {
  public static boolean isRepeated(int arr[], int n) {
    // Time Complexity : O(n)
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < n; i++) {
      if (set.contains(arr[i])) {
        return true;
      } else {
        set.add(arr[i]);
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
