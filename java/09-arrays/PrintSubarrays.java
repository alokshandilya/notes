public class PrintSubarrays {
  public static void printSubArray(int arr[]) {
    // Time Complexity : O(n^3)
    int total = 0; // or by formula of sum of N natural no.
    // start [i]
    for (int i = 0; i < arr.length; i++) {
      // end [j]
      for (int j = i; j < arr.length; j++) {
        // print start to end [subarray]
        for (int k = i; k <= j; k++) {
          System.out.print(arr[k] + " ");
        }
        System.out.println();
        total++;
      }
      System.out.println();
    }
    System.out.println("Total Subarrays : " + total);
  }

  public static void main(String[] args) {
    int myArray[] = {2, 4, 6, 8, 10};
    printSubArray(myArray);
  }
}

/************** OUTPUT ********************
 *  2
 *  2 4
 *  2 4 6
 *  2 4 6 8
 *  2 4 6 8 10
 *
 *  4
 *  4 6
 *  4 6 8
 *  4 6 8 10
 *
 *  6
 *  6 8
 *  6 8 10
 *
 *  8
 *  8 10
 *
 *  10
 *
 * Total Subarrays : 15
 *****************************************/
