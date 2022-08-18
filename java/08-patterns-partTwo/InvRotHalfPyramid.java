/* print the pattern

          *
        * *
      * * *
    * * * *
  * * * * *

*/

public class InvRotHalfPyramid {
  public static void printPattern(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        // cell i,j
        if (i + j >= (n + 1)) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

  // another method
  // first print spaces, then stars
  public static void printPatternAlt(int n) {
    for (int i = 1; i <= n; i++) {
      // spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print("  ");
      }
      // stars
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    printPattern(5);
    System.out.println("Another method :");
    printPatternAlt(5);
  }
}
