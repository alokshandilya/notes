import java.util.Scanner;

// A leap year is exactly divisible by 4 except for century years (years ending with 00). The
// century year is a leap year only if it is perfectly divisible by 400.
public class LeapYearOrNot {
  public static void main(String[] args) {
    System.out.print("Enter Year : ");
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    sc.close();
    if (year % 4 == 0) {
      if (year % 100 == 0) {
        if (year % 400 == 0) {
          System.out.println("It's a leap year");
        } else {
          System.out.println("It's not a leap year");
        }
      } else {
        System.out.println("It's a leap year");
      }
    } else {
      System.out.println("Not a leap year");
    }
  }
}
