public class LargestElement {
  public static int getLargest(int arr[]) {
    int largest = Integer.MIN_VALUE;
    // Time Complexity : O(n)
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > largest) {
        largest = arr[i];
      }
    }
    return largest;
  }

  public static void main(String[] args) {
    int myArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 97};
    int largestIndex = getLargest(myArray);
    System.out.println("Largest element in array is : " + largestIndex);
  }
}
