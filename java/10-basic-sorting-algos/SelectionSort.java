public class SelectionSort {
  // Time Complexity : O(n^2) for all cases
  public static void sort(int[] arr, int n) {
    for (int i = 0; i < n - 1; i++) {
      int smallest = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[smallest]) {
          smallest = j;
        }
      }
      // exchange arr[smallest] with arr[i]
      int temp = arr[smallest];
      arr[smallest] = arr[i];
      arr[i] = temp;
    }
  }

  public static void printSorted(int[] arr, int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] arr = {5, 4, 3, 2, 1, -8, 0};
    int size = arr.length;
    sort(arr, size);
    printSorted(arr, size);
  }
}
