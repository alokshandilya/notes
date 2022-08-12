import java.util.Scanner;

// Write a program that reads a set of integers, and then prints the sum of the even and odd
// integers
public class SumOfEvenOdd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int choice;
    int number;
    int sumEven = 0;
    int sumOdd = 0;
    do {
      System.out.print("Enter Numer : ");
      number = sc.nextInt();
      if (number % 2 == 0) {
        sumEven += number;
      } else {
        sumOdd += number;
      }
      System.out.println("Enter 1 : enter another number\nEnter 2 : exit");
      choice = sc.nextInt();
    } while (choice == 1);
    sc.close();
    System.out.println("Sum of Even numbers : " + sumEven);
    System.out.println("Sum of Odd numbers : " + sumOdd);
  }
}
