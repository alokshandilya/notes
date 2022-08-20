public class PairsInArray {
  public static void printPairs(int arr[]) {
    int totalPairs = 0;
    // Time Complexity : O(n^2)
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        System.out.print("(" + arr[i] + "," + arr[j] + ") ");
        // if only total paris are asked
        // 1 + 2 + ... + n-1 : (n*(n-1))/2
        totalPairs++;
      }
      System.out.println();
    }
    System.out.println("Total Pairs : " + totalPairs);
  }

  public static void main(String[] args) {
    int myArray[] = {2, 4, 6, 8, 10};
    printPairs(myArray);
  }
}

/************** OUTPUT ********************
 *  (2,4) (2,6) (2,8) (2,10)
 *  (4,6) (4,8) (4,10)
 *  (6,8) (6,10)
 *  (8,10)
 *
 *  Total Pairs : 10
 *****************************************/
