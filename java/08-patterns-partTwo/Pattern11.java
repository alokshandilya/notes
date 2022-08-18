/* print the pattern [PALINDROMIC PATTERN PYRAMID]

          1
        2 1 2
      3 2 1 2 3
    4 3 2 1 2 3 4
  5 4 3 2 1 2 3 4 5

*/

public class Pattern11 {
  public static void printPattern(int n) {
    for (int i = 1; i <= n; i++) {
      // spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print("  ");
      }
      // numbers descending
      for (int j = i; j >= 1; j--) {
        System.out.print(j + " ");
      }
      // numbers ascending
      for (int j = 2; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    printPattern(5);
  }
}
