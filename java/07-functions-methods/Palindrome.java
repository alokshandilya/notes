public class Palindrome {
  public static boolean isPalindrome(int n) {
    int temp = n;
    int reverse = 0;
    while (temp > 0) {
      int lastDigit = temp % 10;
      reverse = reverse * 10 + lastDigit;
      temp = temp / 10;
    }
    if (n == reverse) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(isPalindrome(111)); // true
    System.out.println(isPalindrome(121)); // true
    System.out.println(isPalindrome(123)); // false
  }
}
