/* print the pattern

          * * * * *
        *       *
      *       *
    *       *
  * * * * *

*/

public class Pattern08 {
  public static void printPattern(int n) {
    for (int i = 1; i <= n; i++) {
      // spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print("  ");
      }
      // stars (on boundary)
      for (int j = 1; j <= n; j++) {
        if (j == 1 || j == n || i == 1 || i == n) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    printPattern(5);
  }
}
