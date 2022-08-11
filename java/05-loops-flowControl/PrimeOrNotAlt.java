import java.util.Scanner;

public class PrimeOrNotAlt {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int n = sc.nextInt();
    sc.close();
    boolean flag = true;
    if (n == 0 || n == 1) {
      System.out.println("NOT Prime");
    } else {
      // Time Complexity: O(√N), better than O(N)
      for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
          System.out.println("NOT Prime");
          flag = false;
          break;
        }
      }
      if (flag == true) {
        System.out.println("Prime");
      }
    }
  }
}
