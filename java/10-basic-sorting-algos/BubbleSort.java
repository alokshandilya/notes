public class BubbleSort {
  // bubble sort
  // Time Complexity : O(n^2)
  public static void sort(int[] arr, int n) {
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          // swap
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  // print array
  public static void printSorted(int arr[], int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] arr = {5, 4, 1, 3, 2};
    int n = arr.length;
    sort(arr, n);
    printSorted(arr, n);
  }
}
