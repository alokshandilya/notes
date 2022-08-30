// https://leetcode.com/problems/trapping-rain-water
public class TrappingRainwater {
  public static int trap(int[] height) {
    int n = height.length;
    int result = 0, left = 0, right = n - 1;
    int rMax = height[right], lMax = height[left];
    while (left < right) {
      if (lMax < rMax) {
        left++;
        lMax = Math.max(lMax, height[left]);
        result += lMax - height[left];
      } else {
        right--;
        rMax = Math.max(rMax, height[right]);
        result += rMax - height[right];
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    int[] height2 = {4, 2, 0, 3, 2, 5};
    System.out.println(trap(height)); // 6
    System.out.println(trap(height2)); // 9
  }
}
