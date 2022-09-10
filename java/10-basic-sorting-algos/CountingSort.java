// https://www.geeksforgeeks.org/counting-sort

public class CountingSort {
  public static void sortArray(int[] arr, int n) {
    // Time Complexity : O(n+k) where k is range
    // so for k is small : O(n)
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      largest = Math.max(largest, arr[i]);
    }

    int[] count = new int[largest + 1]; // for positive
    for (int i = 0; i < n; i++) {
      count[arr[i]]++;
    }

    // sorting
    int j = 0;
    for (int i = 0; i < count.length; i++) {
      while (count[i] > 0) {
        arr[j] = i;
        j++;
        count[i]--;
      }
    }
  }

  public static void printArray(int[] arr, int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] arr = {1, 4, 1, 3, 2, 4, 3, 7};
    int size = arr.length;
    sortArray(arr, size);
    printArray(arr, size);
  }
}
