import java.util.Scanner;

public class PositiveOrNegative {
  public static void main(String[] args) {
    System.out.print("Enter number : ");
    Scanner sc = new Scanner(System.in);
    float num = sc.nextFloat();
    sc.close();
    if (num > 0) {
      System.out.println("The number is positive");
    } else if (num < 0) {
      System.out.println("The number is negative");
    } else {
      System.out.println("The number is zero (neither +ve nor -ve)");
    }
  }
}
