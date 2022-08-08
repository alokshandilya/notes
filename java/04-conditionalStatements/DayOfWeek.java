import java.util.Scanner;

public class DayOfWeek {
  public static void main(String[] args) {
    System.out.print("Enter day number of week (1-7) : ");
    Scanner sc = new Scanner(System.in);
    int dayNumber = sc.nextInt();
    sc.close();
    switch (dayNumber) {
      case 1:
        System.out.println("It's Monday");
        break;
      case 2:
        System.out.println("It's Tuesday");
        break;
      case 3:
        System.out.println("It's Wednesday");
        break;
      case 4:
        System.out.println("It's Thursday");
        break;
      case 5:
        System.out.println("It's Friday");
        break;
      case 6:
        System.out.println("It's Saturday");
        break;
      case 7:
        System.out.println("It's Sunday");
        break;
      default:
        System.out.println("Invalid day number!");
    }
  }
}
