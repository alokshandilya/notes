// creating duplicate array : Space complexity O(n)
// changes to same array : Space complexity O(1) [preferred]

public class ReverseArray {
  public static void reverse(int arr[]) {
    int start = 0, end = arr.length - 1;

    while (start < end) {
      // swap
      int temp = arr[end];
      arr[end] = arr[start];
      arr[start] = temp;

      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    int myArray[] = {1, 2, 3, 4, 5, 6, 7};
    for (int i = 0; i < myArray.length; i++) {
      System.out.print(myArray[i] + " ");
    }
    System.out.println();
    reverse(myArray);
    for (int i = 0; i < myArray.length; i++) {
      System.out.print(myArray[i] + " ");
    }
    System.out.println();
  }
}
