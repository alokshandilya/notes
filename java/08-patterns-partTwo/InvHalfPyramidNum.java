/* print the pattern

  1 2 3 4 5
  1 2 3 4
  1 2 3
  1 2
  1

*/

public class InvHalfPyramidNum {
  public static void printPattern(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        // cell i,j
        if (i + j <= n + 1) {
          System.out.print(j + " ");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static void printPatternAlt(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print(j + " ");
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
