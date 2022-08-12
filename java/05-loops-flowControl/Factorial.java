import java.util.Scanner;

// Write a program to find the factorial of any number entered by the user
public class Factorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int factorial = 1;
    System.out.print("Enter positive number : ");
    int number = sc.nextInt();
    for (int i = 1; i <= number; i++) {
      factorial *= i;
    }
    System.out.println("Factorial : " + factorial);
    sc.close();
  }
}
