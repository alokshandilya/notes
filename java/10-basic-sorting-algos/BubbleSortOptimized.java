public class BubbleSortOptimized {
  // for best case(sorted array), Time Complexity : O(n)
  public static void sort(int[] arr, int n) {
    for (int i = 0; i < n - 1; i++) {
      boolean flag = false;
      for (int j = 0; j < n - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          flag = true;
          // swap
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
      // if no swapping, then array is sorted
      if (!flag) {
        return;
      }
    }
  }

  public static void printSorted(int[] arr, int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int n = arr.length;
    sort(arr, n);
    printSorted(arr, n); // 1 2 3 4 5

    int[] arr2 = {5, 4, 3, 2, 1};
    int n2 = arr2.length;
    sort(arr2, n2);
    printSorted(arr2, n); // 1 2 3 4 5
  }
}
