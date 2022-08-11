import java.util.Scanner;

// this program prompts to enter a number until user enters multiple of 10
public class Break {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    do {
      System.out.print("Enter num : ");
      int num = sc.nextInt();
      if (num % 10 == 0) {
        break;
      }
      System.out.println("Enter multiple of 10 to exit");
      continue;
    } while (true);
    sc.close();
  }
}
