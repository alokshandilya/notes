public class KadanesAlgo {
  public static void kadanes(int arr[], int n) {
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;
    // Time Complexity : O(n)
    for (int i = 0; i < n; i++) {
      currSum += arr[i];
      if (currSum < 0) {
        currSum = 0;
      }
      maxSum = Math.max(currSum, maxSum);
    }
    System.out.println(maxSum);
  }

  public static void main(String[] args) {
    int myArray[] = {2, -3, 4, -1, -2, 1, 5, -3};
    int size = myArray.length;
    kadanes(myArray, size);
  }
}
