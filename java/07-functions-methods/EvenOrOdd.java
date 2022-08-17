import java.util.Scanner;

public class EvenOrOdd {
  public static boolean isEven(int n) {
    if (n % 2 == 0) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int num = sc.nextInt();

    if (num == 0) {
      System.out.println("Neither even nor odd");
    } else {
      System.out.println("isEven : " + isEven(num));
    }
    sc.close();
  }
}
