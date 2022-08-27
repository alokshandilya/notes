public class BinarySearch {
  public static int search(int arr[], int n) {
    int start = 0, end = arr.length - 1;

    // Time Complexity : O(log n)
    while (start <= end) { // == when single element remains
      int mid = (start + end) / 2;
      // or (same)
      // int mid = start + (end - start) / 2;
      if (arr[mid] == n) { // found
        return mid;
      } else if (arr[mid] < n) { // right
        start = mid + 1;
      } else { // left
        end = mid - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int myArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int key = 9;
    int index = search(myArray, key);
    System.out.println("The key,(" + key + ") is at index : " + index); // 8
  }
}
