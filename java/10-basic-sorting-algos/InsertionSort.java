public class InsertionSort {
  public static void insertionSort(int[] arr, int n) {
    // Time Complexity : O(n^2)
    for (int i = 0; i < n - 1; i++) {
      int curr = arr[i];
      int prev = i - 1;
      // finding position to insert
      while (prev >= 0 && arr[prev] > curr) {
        arr[prev + 1] = arr[prev];
        prev--;
      }
      // insertion
      arr[prev + 1] = curr;
    }
  }

  public static void printSorted(int[] arr, int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] arr = {-99, -9, 1, 8, 77};
    int n = arr.length;
    insertionSort(arr, n);
    printSorted(arr, n);
  }
}
