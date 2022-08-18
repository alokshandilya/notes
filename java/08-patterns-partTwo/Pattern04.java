/* print the pattern [FLOYD'S TRIANGLE]

  1
  2 3
  4 5 6
  7 8 9 10

*/

public class Pattern04 {
  public static void printFloydsT(int n) {
    int counter = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(counter + " ");
        counter++;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    printFloydsT(4);
  }
}
