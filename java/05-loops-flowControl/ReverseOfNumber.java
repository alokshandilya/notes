import java.util.Scanner;

// last digit = num % 10
// remove last digit = num / 10
public class ReverseOfNumber {
  public static void main(String[] args) {
    System.out.print("Enter a number : ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    sc.close();
    while (num > 0) {
      int lastDigit = num % 10;
      num /= 10;
      System.out.print(lastDigit);
    }
    System.out.println();
  }
}
