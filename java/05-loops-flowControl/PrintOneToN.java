import java.util.Scanner;

public class PrintOneToN {
  public static void main(String[] args) {
    System.out.print("Enter N : ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    sc.close();
    int i = 1;
    while (i <= num) {
      System.out.print(i + " ");
      i++;
    }
    System.out.println();
  }
}
