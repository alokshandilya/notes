// https://leetcode.com/problems/3sum
// This problem uses list to return the numbers and HashSets to store them. These will be covered
// later

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class BruteForce {
  // Brute Force
  // Time Complexity : O(n^3)
  public static List<List<Integer>> bruteForce(int nums[]) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        for (int k = j + 1; k < nums.length; k++) {
          if (nums[i] + nums[j] + nums[k] == 0) {
            List<Integer> triplet = new ArrayList<Integer>();
            triplet.add(nums[i]);
            triplet.add(nums[j]);
            triplet.add(nums[k]);
            Collections.sort(triplet);
            result.add(triplet);
          }
        }
      }
    }
    result = new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));

    return result;
  }
}
