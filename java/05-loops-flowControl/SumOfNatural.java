import java.util.Scanner;

public class SumOfNatural {
  public static void main(String[] args) {
    System.out.print("Enter N : ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    sc.close();
    int i = 1, sum = 0;
    while (i <= num) {
      sum += i; // sum = sum + i
      i++;
    }
    System.out.println("The sum is : " + sum);
  }
}

// or by formula : num * (num + 1) / 2;
