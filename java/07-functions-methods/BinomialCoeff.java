import java.util.Scanner;

// binomail coefficient : n! / (r! * (n-r)!)

public class BinomialCoeff {
  public static long factorial(int a) {
    long fact = 1;
    for (int i = 1; i <= a; i++) {
      fact *= i;
    }
    return fact;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n and r : ");
    int n = sc.nextInt();
    int r = sc.nextInt();

    long nFact = factorial(n);
    long rFact = factorial(r);
    long nMinusRFact = factorial(n - r);
    System.out.println("Binomail coefficient is : " + nFact / (rFact * nMinusRFact));
    sc.close();
  }
}
