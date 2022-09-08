import java.util.Arrays;
import java.util.Collections;

public class InbuiltJavaSort {
  public static void printArray(int[] arr, int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void printArray(Integer[] arr, int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] arr1 = {-7, 77, 0, 7, -777};
    int size1 = arr1.length;
    // Time Complexity of Inbuilt Java Array Sortins
    // O(n logn)
    Arrays.sort(arr1);
    printArray(arr1, size1);

    // also
    // Array.sort(array_name, starting_index, ending_index [non exclusive so +1]);
    int[] arr2 = {-1, 17, 0, 8, -967};
    int size2 = arr2.length;
    // for sorting from index 0 to 3
    Arrays.sort(arr2, 0, 4);
    printArray(arr2, size2);

    // for reverse order
    // use Collection, reverseOrder() works on object and not primitive
    Integer[] arr3 = {-2, 7, 0, 13, -823};
    int size3 = arr3.length;
    Arrays.sort(arr3, Collections.reverseOrder());
    printArray(arr3, size3);

    Integer[] arr4 = {-57, -1, 90, 0};
    int size4 = arr4.length;
    // for sorting from index 0 to 2
    Arrays.sort(arr4, 0, 3, Collections.reverseOrder());
    printArray(arr4, size4);
  }
}

/************** OUTPUT ********************
 *  -777 -7 0 7 77
 *  -1 0 8 17 -967
 *  13 7 0 -2 -823
 *  90 -1 -57 0
 *****************************************/
