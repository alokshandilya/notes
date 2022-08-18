/* print the pattern

  * * * * * * *
  *           *
  *           *
  *           *
  * * * * * * *

*/

public class HollowRectangle {
  public static void printHollowRectangle(int row, int column) {
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= column; j++) {
        // cell i,j [consider as matrix]
        if (i == 1 || i == row || j == 1 || j == column) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    printHollowRectangle(5, 7);
  }
}
