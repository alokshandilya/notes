import java.util.Scanner;

public class PrimeOrNot {
  public static boolean isPrime(int n) {
    // corner cases
    if (n == 0 || n == 1) {
      return false;
    }
    // for (int i = 2; i < n; i++) {
    // Time Complexity: O(N/2) ~ O(N)
    for (int i = 2; i <= n / 2; i++) { // upto n/2 because factors repeat after that
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = sc.nextInt();
    System.out.println("Is prime?? = " + isPrime(num));
    sc.close();
  }
}
