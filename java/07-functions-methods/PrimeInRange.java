public class PrimeInRange {
  public static void primeInRange(int n) {
    for (int i = 0; i <= n; i++) {
      if (checkPrime(i) == true) {
        System.out.println(i);
      }
    }
  }

  public static boolean checkPrime(int n) {
    if (n == 0 || n == 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    primeInRange(100); // 25
  }
}
