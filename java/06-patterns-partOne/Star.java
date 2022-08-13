// *
// * *
// * * *
// * * * *

// no. of lines (i) = 4
// no. of times in single line = i (no. of line)

public class Star {
  public static void main(String[] args) {
    int n = 4;
    for (int i = 1; i <= n; i++) {
      // single line
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
