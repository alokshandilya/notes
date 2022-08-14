import java.util.Scanner;

public class ProductOfTwo {
  public static float productOfTwoNum(float a, float b) {
    // a, b are parameters/formal parameters [in definition]
    float product = a * b;
    return product;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter two numbers : ");
    float num1 = sc.nextFloat();
    float num2 = sc.nextFloat();
    System.out.println("Product of two numbers : " + productOfTwoNum(num1, num2));
    // num1, num2 are arguments/actual parameters [in call]
    System.out.println();
    System.out.println("Product of 7.7, 9.8 is : " + productOfTwoNum(7.7f, 9.8f));
    System.out.println();
    System.out.println("Product of 7, 9 is : " + productOfTwoNum(7, 9));
    sc.close();
  }
}

/************** OUTPUT ********************
 *  Enter two numbers : 4 8.3
 *  Product of two numbers : 33.2
 *
 *  Product of 7.7, 9.8 is : 75.46
 *
 *  Product of 7, 9 is : 63.0
 *****************************************/
