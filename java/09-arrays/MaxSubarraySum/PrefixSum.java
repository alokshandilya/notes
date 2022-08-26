public class PrefixSum {
  public static void maxSubarraySum(int arr[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[arr.length];

    prefix[0] = arr[0];
    // calculate prefix array for myArray
    // {1, -1, -5, -6, -3}
    for (int i = 1; i < prefix.length; i++) {
      prefix[i] = prefix[i - 1] + arr[i];
    }

    // Time Complexity : O(n^2)
    for (int i = 0; i < arr.length; i++) {
      int start = i;
      for (int j = i; j < arr.length; j++) {
        int end = j;
        currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
        if (maxSum < currSum) {
          maxSum = currSum;
        }
      }
    }
    System.out.println(maxSum);
  }

  public static void main(String[] args) {
    int myArray[] = {1, -2, 6, -1, 3};
    maxSubarraySum(myArray); // 8
  }
}
