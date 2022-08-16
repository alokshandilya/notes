public class PrimeOrNotAlt {
  public static boolean isPrime(int n) {
    if (n == 0 || n == 1) {
      return false;
    }
    // Time Complexity: O(√N), better than O(N)
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isPrime(0)); // false
    System.out.println(isPrime(1)); // false
    System.out.println(isPrime(2)); // true
    System.out.println(isPrime(5)); // true
    System.out.println(isPrime(6)); // false
    System.out.println(isPrime(7)); // true
    System.out.println(isPrime(97)); // true
  }
}
