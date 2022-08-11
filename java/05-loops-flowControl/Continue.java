import java.util.Scanner;

// ExceptMultOfTen
// This program displays entered number except than multiple of 10
public class Continue {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // no sc.close() because this program runs infinitely
    do {
      System.out.print("Enter a num : ");
      int num = sc.nextInt();
      if (num % 10 == 0) {
        continue;
      }
      System.out.println(num);
    } while (true);
  }
}
