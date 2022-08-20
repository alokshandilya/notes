public class LinearSearch {
  public static int linearSearch(int numbers[], int key) {
    // Time complexity : O(n)
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == key) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int numbers[] = {10, 20, 30, 40, 50};
    int key = 50;
    int index = linearSearch(numbers, key);
    if (index == -1) {
      System.out.println(key + " not found");
    } else {
      // index ranges from 0 to n-1
      System.out.println(key + " found at index : " + index);
    }
  }
}
