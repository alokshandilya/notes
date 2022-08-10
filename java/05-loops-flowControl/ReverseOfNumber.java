import java.util.Scanner;

// last digit = num % 10
// remove last digit = num / 10 [update num]
public class ReverseOfNumber {
  public static void main(String[] args) {
    System.out.print("Enter a number : ");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    sc.close();
    int reversedNumber = 0;

    while (number > 0) {
      int lastDigit = number % 10;
      reversedNumber = (reversedNumber * 10) + lastDigit;
      number /= 10;
      System.out.print(lastDigit);
    }
    System.out.println();
  }
}
