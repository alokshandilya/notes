public class KadanesNegative {
  public static void kadanes(int arr[], int n) {
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;
    boolean isNegative = true;
    int auxiliary = arr[0];
    // handle -ve numbers
    for (int i = 0; i < n; i++) {
      if (arr[i] >= 0) {
        isNegative = false;
      }
      currSum += arr[i];
      if (currSum < 0) {
        currSum = 0;
      }
      maxSum = Math.max(currSum, maxSum);
      if (auxiliary < arr[i]) {
        auxiliary = arr[i];
      }
    }
    if (isNegative == true) {
      maxSum = auxiliary;
    }
    System.out.println(maxSum);
  }

  public static void main(String[] args) {
    int arr1[] = {-7, -3, -5, -6, -2, -8, -3, -3, -9};
    int arr2[] = {-5, -1, -2, -4, -3, -1, -2, -2};
    int arr3[] = {-5, -1, -4, -3, 1, 1, -2, -2};
    kadanes(arr1, arr1.length); // -2
    kadanes(arr2, arr2.length); // -1
    kadanes(arr3, arr3.length); // 2
  }
}
