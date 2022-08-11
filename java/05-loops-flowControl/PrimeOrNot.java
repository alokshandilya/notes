import java.util.Scanner;

public class PrimeOrNot {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int n = sc.nextInt();
    sc.close();
    boolean flag = true;
    if (n == 0 || n == 1) {
      System.out.println("NOT PRIME");
    } else {
      for (int i = 2; i <= n / 2; i++) {
        if (n % i == 0) {
          System.out.println("NOT PRIME");
          flag = false;
          break;
        }
      }
      if (flag == true) {
        System.out.println("PRIME");
      }
    }
  }
}
